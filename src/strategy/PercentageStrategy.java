/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: PercentageStrategy.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-8-10
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package strategy;

public class PercentageStrategy extends DiscountStrategy {
	private double percent;

	public PercentageStrategy(double price, int copies) {
		super(price, copies);
	}

	@Override
	public double calculateDiscount() {
		return this.price * this.copies * percent;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public static void main(String[] args) {
		PercentageStrategy percentageStrategy = new PercentageStrategy(100, 50);
		percentageStrategy.setPercent(0.1);
		System.out.println(percentageStrategy.calculateDiscount());
	}
}
