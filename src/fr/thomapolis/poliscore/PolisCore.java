package fr.thomapolis.poliscore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import database.SqlConnection;

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
}
