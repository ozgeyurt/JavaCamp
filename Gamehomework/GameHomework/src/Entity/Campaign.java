package Entity;

public class Campaign {
	public int id;
	public String campaignName;
	private int discountRate;
	private double unitPrice;
	
	
	public Campaign(int id, String campaignName, int discountRate, double unitPrice) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;
	}
	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public double getUnitPrice() {
		return this.unitPrice-(this.unitPrice* this.discountRate/100);
	}
	
	

}
