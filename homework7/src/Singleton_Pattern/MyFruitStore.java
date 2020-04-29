package Singleton_Pattern;

import java.util.Hashtable;


public class MyFruitStore {
	private static Hashtable fruittable = null;
	private static MyFruitStore fruitstore = null;   //ÀÁººÊ½
	//private static MyFruitStore fruitstore = new new MyFruitStore();  //¶öººÊ½
	private MyFruitStore() {
		fruittable = new Hashtable<Integer,MyFruit>();
	}

	public static MyFruitStore Getfruitstore() {
		if (fruitstore == null) {
			fruitstore = new MyFruitStore();
		}
		return fruitstore;
	}

	public static void Add(Integer key, MyFruit fruit) {
		fruittable.put(key, fruit);
	}

	public static MyFruit Get(Integer key) {
		MyFruit fruit = (MyFruit) fruittable.get(key);
		return (MyFruit) fruit.clone();
	}
}
