package fr.thomapolis.poliscore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class PolisCore extends JavaPlugin {
	
	private String prefix;
	
	@Override
	public void onEnable() {
		
		setPrefix(ChatColor.GRAY+"["+ChatColor.RED+"PolisCore"+ChatColor.GRAY+"] ");
		
		System.out.println(getPrefix()+"PolisCore activate");
		
		
	}
	
	public String getPrefix() {
		
		return this.prefix;
	}
	
	public void setPrefix(String prefix) {
		
		this.prefix = prefix;
	}
}
