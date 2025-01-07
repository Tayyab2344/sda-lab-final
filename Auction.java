import java.util.ArrayList;
import java.util.List;

public class Auction {
    private Item item;
    private List<Bid> bids;

    public Auction(Item item) {
        this.item = item;
        this.bids = new ArrayList<>();
    }

    public void placeBid(Bid bid) {
        // Only accept bids higher than the current highest bid
        if (bids.isEmpty() || bid.getAmount() > getHighestBid().getAmount()) {
            bids.add(bid);
            System.out.println("Bid placed successfully.");
        } else {
            System.out.println("Bid must be higher than the current highest bid.");
        }
    }

    public Bid getHighestBid() {
        if (bids.isEmpty()) {
            return null;
        }
        Bid highestBid = bids.get(0);
        for (Bid bid : bids) {
            if (bid.getAmount() > highestBid.getAmount()) {
                highestBid = bid;
            }
        }
        return highestBid;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Auction for: " + item.getName() + " | Base Price: " + item.getBasePrice();
    }
}
