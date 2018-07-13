package fr.thomapolis.poliscore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import fr.thomapolis.poliscore.database.SqlConnection;
import fr.thomapolis.poliscore.listeners.ListenerPlayer;

public class PolisCore extends JavaPlugin {
	
	public SqlConnection sql;
	
	private String prefix;
	
	@Override
	public void onEnable() {
		
		//Init
		sql = new SqlConnection("jdbc:mysql://", "localhost", "servermc", "root", "");
		sql.connect();
		
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
}
