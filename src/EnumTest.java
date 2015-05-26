/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: EnumTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-5-6
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
public enum EnumTest {
	AAAA("aaaa"), BBBB("bbbb");
	private String name;

	EnumTest(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String compare(String oldValue, String newValue){
		return this.name + "：" + oldValue + "->" + newValue;
	}
	
	public static void main(String[] args) {
		EnumTest test = EnumTest.valueOf("AAAA");
		System.out.println(test);
	}

	@Override
	public String toString() {
		return this.name() + ":" + name;
	}
}
