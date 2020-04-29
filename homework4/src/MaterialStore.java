import java.util.Hashtable;

public class MaterialStore {
	private static Hashtable<Integer, material> materialstore = new Hashtable<Integer,material>();
	public static  void Add(Integer key,material material) {
		materialstore.put(key, material);
	}
	public static material Get(Integer key) {
		material material = (material)materialstore.get(key);
		return (material) material.clone();
	}
	public static boolean ContainsKey(Integer key) {
		if(materialstore.contains(key))
			return true;
		else
			return false;
	}
}
