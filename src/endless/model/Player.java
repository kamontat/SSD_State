package endless.model;

import endless.statemachine.NormalState;
import endless.statemachine.State;

public class Player {
	
	public static final int JUMP_SPEED = 300;
	public static final int WIDTH = 30;
	public static final int NORMAL_HEIGHT = 60;
	public static final int CRAWL_HEIGHT = 30;
	
	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;
	
	private State state;
	
	public long jumpTime;
	public int jumpY;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		
		setState(new NormalState(this));
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getvY() {
		return vY;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setvY(int vY) {
		this.vY = vY;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void jumpPressed() {
		state.jump();
	}
	
	public void crawlPressed() {
		state.crawlPress();
	}
	
	public void crawlReleased() {
		state.crawlRelease();
	}
	
	public void update() {
		state.update();
	}
}
