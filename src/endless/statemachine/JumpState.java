package endless.statemachine;

import endless.model.Game;
import endless.model.Player;

/**
 * Created by bubblebitoey on 4/20/2017 AD.
 */
public class JumpState extends State {
	public JumpState(Player p) {
		super(p);
		
		player.jumpTime = System.currentTimeMillis();
		player.jumpY = player.getY();
		System.out.println("Jump Pressed");
	}
	
	@Override
	public void jump() {
		player.setState(new DoubleJumpState(player));
	}
	
	@Override
	public void update() {
		float t = (System.currentTimeMillis() - player.jumpTime) / 1000.0f;
		player.setY((int) (player.jumpY + Player.JUMP_SPEED * t + 0.5f * Game.GRAVITY * t * t));
		System.out.println("Jumping");
		if (player.getY() <= 0) {
			player.setState(new NormalState(player));
		}
	}
}
