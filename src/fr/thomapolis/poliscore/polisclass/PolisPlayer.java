package fr.thomapolis.poliscore.polisclass;

import org.bukkit.entity.Player;

import fr.thomapolis.poliscore.PolisCore;
import fr.thomapolis.poliscore.cosmeticranks.CosmeticRank;
import fr.thomapolis.poliscore.ranks.Rank;

public class PolisPlayer {

	private Player player;
	private int id;
	private String uuid;
	private int money;
	private Rank rank;
	private CosmeticRank cosmeticRank;
	
	public PolisPlayer(Player player, PolisCore core) {
		
		this.player = player;
		this.id = core.getSQL().getId(player);
		this.uuid = player.getUniqueId().toString();
		this.money = core.getSQL().getMoney(player);
		this.rank = core.getRankType().getRank(core.getSQL().getRank(player));
		this.cosmeticRank = core.getCosmeticRankType().getRank(core.getSQL().getCosmeticPower(player));
	}
	
	public int getMoney() {
		
		return this.money;
	}
	
	public Rank getRank() {
		
		return this.rank;
	}
	
}
