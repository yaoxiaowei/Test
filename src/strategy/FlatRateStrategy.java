/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: FlatRateStrategy.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-8-10
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package strategy;

public class FlatRateStrategy extends DiscountStrategy {
	private double amount;

	public FlatRateStrategy(double price, int copies) {
		super(price, copies);
	}

	@Override
	public double calculateDiscount() {
		return this.copies * amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		FlatRateStrategy discountStrategy = new FlatRateStrategy(100.0, 50);
		discountStrategy.setAmount(5);
		System.out.println(discountStrategy.calculateDiscount());
	}

}
