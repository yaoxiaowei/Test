/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: TestJson.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-10-17
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package json;

import java.util.Date;

import com.google.gson.Gson;

public class TestJson {
	public static void main(String[] args) {
		CZBagsSearch czBagsSearch = new CZBagsSearch();
		czBagsSearch.setBagName("yaoxw");
		czBagsSearch.setDate(new Date());
		CZBagsSearch.BagRecord bagRecord1 = new CZBagsSearch.BagRecord();
		bagRecord1.setRecordType("bag1");
		bagRecord1.setRefAirlineCode("atl1");
		czBagsSearch.setBagRecord(bagRecord1);
		
		CZBagsSearch.BagRecord bagRecord2 = new CZBagsSearch.BagRecord();
		bagRecord2.setRecordType("bag2");
		bagRecord2.setRefAirlineCode("atl2");
		czBagsSearch.setBagRecordArray(new CZBagsSearch.BagRecord[]{bagRecord2});
		
		Gson gson = new Gson();
		String json = gson.toJson(czBagsSearch);
		System.out.println(json);
		
		CZBagsSearch newCzBagsSearch = gson.fromJson(json, CZBagsSearch.class);
		System.out.println(newCzBagsSearch);
		
	}
}

	