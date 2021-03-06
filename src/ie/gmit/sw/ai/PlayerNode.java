package ie.gmit.sw.ai;

public class PlayerNode {
	
	private int row;
	private int col;
	private double health = 200;
	private int hydrogenBomb = 0;
	private int bombs = 0;
	private int sword = 0;
	private double swordPower = 5;
	private double bombPower = 10;
	private double hydrogenBombPower = 20;
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	
	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public PlayerNode(int row, int col){
		this.row = row;
		this.col = col;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	public double getSwordPower() {
		return swordPower;
	}

	public void setSwordPower(double swordPower) {
		this.swordPower = swordPower;
	}
	
	public int getHydrogenBomb() {
		return hydrogenBomb;
	}

	public void addHydrogenBomb() {
		hydrogenBomb++;
	}
	
	public int getBombs() {
		return bombs;
	}

	public void addBombs() {
		this.bombs++;
	}
	
	public int getSword() {
		return sword;
	}

	public void addSword() {
		this.sword++;
	}

	public double getswordPower() {
		return swordPower;
	}

	public void setswordPower(double swordPower) {
		this.swordPower = swordPower;
	}

	public double getBombPower() {
		return bombPower;
	}

	public void setBombPower(double bombPower) {
		this.bombPower = bombPower;
	}

	public double getHydrogenBombPower() {
		return hydrogenBombPower;
	}

	public void setHydrogenBombPower(double hydrogenBombPower) {
		this.hydrogenBombPower = hydrogenBombPower;
	}




}
