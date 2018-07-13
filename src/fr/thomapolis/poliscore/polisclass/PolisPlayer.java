package fr.thomapolis.poliscore.polisclass;

import org.bukkit.entity.Player;

import fr.thomapolis.poliscore.PolisCore;
import fr.thomapolis.poliscore.ranks.Rank;

public class PolisPlayer {

	private Player player;
	private int id;
	private String uuid;
	private int money;
	private Rank rank;
	
	public PolisPlayer(Player player, PolisCore core) {
		
		this.player = player;
		this.id = core.getSQL().getId(player);
		this.uuid = player.getUniqueId().toString();
		this.money = core.getSQL().getMoney(player);
		this.rank = core.getRankType().getRank(core.getSQL().getRank(player));
		
	}
	
	public int getMoney() {
		
		return this.money;
	}
	
}
