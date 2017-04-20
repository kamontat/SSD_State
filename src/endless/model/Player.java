package endless.model;

public class Player {
	public static final int JUMP_SPEED = 300;
	public static final int WIDTH = 30;
	public static final int NORMAL_HEIGHT = 60;
	public static final int CRAWL_HEIGHT = 30;
	
	enum State {
		NORMAL, JUMP_1, JUMP_2, CRAWL;
	}
	
	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;
	
	// TODO: Add variables you need.
	private State state;
	private boolean crawling;
	private long jumpTime;
	private int jumpY;
	private int jumpCount;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		// TODO: Initialize variables you need
		state = State.NORMAL;
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
	
	public void jumpPressed() {
		if (state == State.NORMAL) state = State.JUMP_1;
		else if (state == State.JUMP_1) state = State.JUMP_2;
		else return;
		
		jumpCount++;
		jumpTime = System.currentTimeMillis();
		jumpY = y;
		System.out.println("Jump Pressed");
	}
	
	public void crawlPressed() {
		if (state != State.NORMAL) return;
		
		state = State.CRAWL;
		height = CRAWL_HEIGHT;
		System.out.println("Crawl Pressed");
	}
	
	public void crawlReleased() {
		if (state != State.CRAWL) return;
		
		state = State.NORMAL;
		height = NORMAL_HEIGHT;
		System.out.println("Crawl Released");
		
	}
	
	public void update() {
		if (state == State.JUMP_1 || state == State.JUMP_2) {
			float t = (System.currentTimeMillis() - jumpTime) / 1000.0f;
			y = (int) (jumpY + JUMP_SPEED * t + 0.5f * Game.GRAVITY * t * t);
			
			System.out.println("Jumping");
			
			if (y <= 0) {
				state = State.NORMAL;
			}
		}
	}
	
}
