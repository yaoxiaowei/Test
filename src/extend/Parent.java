/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: Parent.java
 * @Author: YaoXiaowei
 * @CreateDate: 2015-3-2
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package extend;

public class Parent {
	private String name;

	protected Parent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
