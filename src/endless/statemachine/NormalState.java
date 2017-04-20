package endless.statemachine;

import endless.model.Player;

/**
 * Created by bubblebitoey on 4/20/2017 AD.
 */
public class NormalState extends State {
	public NormalState(Player p) {
		super(p);
	}
	
	@Override
	public void crawlPress() {
		player.setState(new CrawlState(player));
		player.crawlPressed();
	}
	
	@Override
	public void crawlRelease() {
	}
	
	@Override
	public void jump() {
		player.setState(new JumpState(player));
	}
}
