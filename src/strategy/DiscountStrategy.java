/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: DiscountStrategy.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-8-10
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package strategy;

abstract public class DiscountStrategy {
	protected double price;
	protected int copies;

	public DiscountStrategy(double price, int copies) {
		this.price = price;
		this.copies = copies;
	}

	public abstract double calculateDiscount();

}
