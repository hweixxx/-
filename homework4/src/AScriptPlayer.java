
public class AScriptPlayer implements AGameScript {
	material material_A = new material_A();
	equipment equipment_A = new equipment_A();

	public material CreateM() {
		if (MaterialStore.ContainsKey(1)) {
			return MaterialStore.Get(1);
		} else {
			MaterialStore.Add(1, new material_A());
			return MaterialStore.Get(1);
		}
	}

	public equipment CreateE() {
		if (MaterialStore.ContainsKey(1)) {
			return EquipmentStore.Get(1);
		} else {
			EquipmentStore.Add(1, new equipment_A());
			return EquipmentStore.Get(1);
		}
	}

	public static void main(String[] args) {
		AScriptPlayer A = new AScriptPlayer();
		A.CreateM().Display();
		A.CreateM().Display();
		A.CreateE().Display();
		A.CreateE().Display();
	}
}
