import java.util.Hashtable;

public class EquipmentStore {
	private static Hashtable equipmentstore = new Hashtable<Integer,equipment>();
	public static void Add(Integer key,equipment equipment) {
		equipmentstore.put(key, equipment);
	}
	public static equipment Get(Integer key) {
		equipment equipment = (equipment)equipmentstore.get(key);
		return (equipment) equipment.clone();
	}
	public static boolean ContainsKey(Integer key) {
		if(equipmentstore.contains(key))
			return true;
		else
			return false;
	}
}
