package fr.thomapolis.poliscore;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import fr.thomapolis.poliscore.database.SqlConnection;
import fr.thomapolis.poliscore.listeners.ListenerPlayer;
import fr.thomapolis.poliscore.polisclass.PolisPlayer;
import fr.thomapolis.poliscore.type.CosmeticRankType;
import fr.thomapolis.poliscore.type.RankType;

public class PolisCore extends JavaPlugin {
	
	public SqlConnection sql;
	
	private String prefix;
	
	public RankType rankType;
	public CosmeticRankType crType;
	
	@Override
	public void onEnable() {
		
		//Init
		sql = new SqlConnection("jdbc:mysql://", "localhost", "servermc", "root", "");
		sql.connect();
		rankType = new RankType();
		crType = new CosmeticRankType();
		
		setPrefix(ChatColor.GRAY+"["+ChatColor.RED+"PolisCore"+ChatColor.GRAY+"] ");
		
		System.out.println(getPrefix()+"PolisCore activate");
		
		registerEvents();
	}
	
	@Override
	public void onDisable() {
		
		sql.disconnect();
	}
	
	public String getPrefix() {
		
		return this.prefix;
	}
	
	public void setPrefix(String prefix) {
		
		this.prefix = prefix;
	}
	
	public SqlConnection getSQL() {
		
		return this.sql;
	}
	
	public void registerEvents() {
		
		this.getServer().getPluginManager().registerEvents(new ListenerPlayer(this), this);
	}
	
	public RankType getRankType() {
		
		return this.rankType;
	}
	
	public PolisPlayer getPolisPlayer(Player player) {
		
		return new PolisPlayer(player, this);
	}
	
	public CosmeticRankType getCosmeticRankType() {
		
		return this.crType;
	}
}
