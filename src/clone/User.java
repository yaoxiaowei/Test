/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: User.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-5-7
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package clone;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {
	private String name;
	private String sex;
	private int age;
	private List<String> list;

	public User() {
	}

	public User(String name, String sex, int age, List<String> list) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + ", list=" + list + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> newList = new ArrayList<String>(this.list);
		return new User(this.name, this.sex, this.age, newList);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("yao");
		list.add("xiao");
		User user1 = new User("yaoxw", "男", 25, list);
		System.out.println(user1);
		try {
			User user2 = (User) user1.clone();
			user2.setName("晓伟");
			user2.getList().add("wei");
			System.out.println("user1   " + user1);
			System.out.println("user2   " + user2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
