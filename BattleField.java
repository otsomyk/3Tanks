package tank;


public class BattleField {
	
	private int bfWidth = 576;
	private int bfHeigth = 576;
	
	
	private String[][] battleField = {
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", " ", "B", "B", "B", " ", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{"B", " ", " ", " ", "B", " ", " ", " ", "B" },
			{"B", "B", "B", " ", "B", "B", "B", " ", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" }
};
	
	public BattleField(){
	}
	
	public BattleField(String[][] battleField){
		this.battleField = battleField;
	}
	
	public void updateQuadrant (int v, int h, String object){
		battleField[v][h] = object;
	}
	
	public String scanQuadrant (int v, int h){
		return battleField[v][h];
	}
	
	public int getDimentionX (){
		return battleField.length;
	}
	
	public int getDimentionY (){
		return battleField.length;
	}
	
	public int getBfWidth(){
		return bfWidth;
	}
	
	public int getBfHeigth(){
		return bfHeigth;
	}
	
	
	

	
	

}
