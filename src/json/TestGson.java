package json;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestGson {
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public static void main(String[] args) {
		TestGson.test1();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 1000; i++) {
//					TestGson.test1();
//				}
//			}
//		}).start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 1000; i++) {
//					TestGson.test2();
//				}
//			}
//		}).start();
	}

	public static void test1() {
		CZBagsSearch czBagsSearch = new CZBagsSearch();
		czBagsSearch.setDate(new Date());

		String json = GSON.toJson(czBagsSearch);
		System.out.println("test1-> " + json);
		
		CZBagsSearch targetBagsSearch = GSON.fromJson(json, CZBagsSearch.class);
		System.out.println(targetBagsSearch);
	}

	public static void test2() {
		CZBagsSearch czBagsSearch = new CZBagsSearch();
		czBagsSearch.setDate(new Date());
		czBagsSearch.setBagName("hello");

		String json = GSON.toJson(czBagsSearch);
		System.out.println("test2-> " + json);
	}
}
