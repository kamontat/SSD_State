package endless.statemachine;

import endless.model.Player;

/**
 * Created by bubblebitoey on 4/20/2017 AD.
 */
public class CrawlState extends State {
	public CrawlState(Player p) {
		super(p);
	}
	
	@Override
	public void crawlPress() {
		player.setHeight(Player.CRAWL_HEIGHT);
		System.out.println("Crawl Pressed");
	}
	
	@Override
	public void crawlRelease() {
		player.setHeight(Player.NORMAL_HEIGHT);
		player.setState(new NormalState(player));
		System.out.println("Crawl Release");
	}
	
	@Override
	public void jump() {
	}
}
