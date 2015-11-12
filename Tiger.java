package tank;

public class Tiger extends Tank {
	private static int armor;

	public Tiger(TankColor color, int maxSpeed, int crew) {
		super(color, maxSpeed, crew);

	}

	public Tiger() {
		
	}

	public static int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		Tiger.armor = armor;
	}
}
