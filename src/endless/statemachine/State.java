package endless.statemachine;

import endless.model.Player;

/**
 * Created by bubblebitoey on 4/20/2017 AD.
 */
public class State {
	protected Player player;
	
	public State(Player p) {
		player = p;
	}
	
	public void crawlPress() {
	}
	
	public void crawlRelease() {
	}
	
	public void jump() {
	}
	
	public void update() {
	}
}
