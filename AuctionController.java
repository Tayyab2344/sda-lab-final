import java.util.Scanner;

public class AuctionController {
    private Auction auction;

    // No-argument constructor
    public AuctionController() {
        this.auction = new Auction(new Item("Vintage Watch", 100.0)); // Default item setup
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Auction System ---");
            System.out.println("1. View Auction");
            System.out.println("2. Place Bid");
            System.out.println("3. View Winning Bid");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewAuction();
                    break;
                case 2:
                    placeBid(scanner);
                    break;
                case 3:
                    viewWinningBid();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void viewAuction() {
        System.out.println(auction);
        if (!auction.getBids().isEmpty()) {
            System.out.println("Current Bids:");
            for (Bid bid : auction.getBids()) {
                System.out.println(bid);
            }
        } else {
            System.out.println("No bids yet.");
        }
    }

    private void placeBid(Scanner scanner) {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter bid amount: ");
        double bidAmount = scanner.nextDouble();
        scanner.nextLine();

        User user = new User(userName);
        Bid bid = new Bid(user, bidAmount);
        auction.placeBid(bid);
    }

    private void viewWinningBid() {
        Bid highestBid = auction.getHighestBid();
        if (highestBid != null) {
            System.out.println("Winning Bid: " + highestBid);
        } else {
            System.out.println("No bids yet.");
        }
    }
}
