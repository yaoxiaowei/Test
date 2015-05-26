/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: NoDiscountStrategy.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-8-10
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package strategy;

public class NoDiscountStrategy extends DiscountStrategy {

	public NoDiscountStrategy(double price, int copies) {
		super(price, copies);
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}

}
