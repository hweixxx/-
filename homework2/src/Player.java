public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GameFactory factory=new GameFactoryB(); Role role=factory.CreateR();
		 * role.Create();
		 */
		GameFactory factory=(GameFactory)XMLUtil.getBean();
		Role role=factory.CreateR();
		role.Create();
	}

}
