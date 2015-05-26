/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: Child.java
 * @Author: YaoXiaowei
 * @CreateDate: 2015-3-2
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package extend;

public class Child extends Parent {
	private String age;

	protected Child(String name, String age) {
		super(name);
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
