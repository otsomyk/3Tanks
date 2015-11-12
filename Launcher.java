package tank;

public class Launcher {
	public static void main(String[] args) throws Exception {
		ActionField af = new ActionField();
	//	af.runTheGame();
		Tank[] tanks = new Tank[5];
		Tiger tiger = new Tiger();
				
		tanks[0] = new T34(TankColor.BLACK, 70, 3);
		tanks[1] = new BT7(TankColor.GREEN, 72, 4);
		tanks[2] = new Tiger(TankColor.DARK_GREEN, 36, 3);
		tanks[3] = new Tank();
		tanks[4] = new Tank(TankColor.DARK_GREEN, 80, 4);

		tiger.printTankInfo(tanks);
	}

}
