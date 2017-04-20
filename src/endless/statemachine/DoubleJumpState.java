package endless.statemachine;

import endless.model.Game;
import endless.model.Player;

/**
 * Created by bubblebitoey on 4/20/2017 AD.
 */
public class DoubleJumpState extends JumpState {
	public DoubleJumpState(Player p) {
		super(p);
	}
	
	@Override
	public void crawlPress() {
	}
	
	@Override
	public void crawlRelease() {
	}
	
	@Override
	public void jump() {
	}
}
