
public class BScriptPlayer {
	material material_B = new material_B();
    equipment equipment_B = new equipment_B();
    public material CreateM() {
    	if(MaterialStore.Get(2)!=null) {
    		return MaterialStore.Get(1);
    	}else {
    		MaterialStore.Add(2, material_B);
    		return MaterialStore.Get(1);
    	}
    }

    public equipment CreateE() {
    	if(EquipmentStore.Get(2)!=null) {
    		return EquipmentStore.Get(1);
    	}else {
    		EquipmentStore.Add(2, equipment_B);
    		return EquipmentStore.Get(1);
    	}
    }
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
