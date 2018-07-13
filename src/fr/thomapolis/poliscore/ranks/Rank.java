package fr.thomapolis.poliscore.ranks;

import java.util.List;

import org.bukkit.ChatColor;

public abstract class Rank {

	public abstract String getName();
	
	public abstract ChatColor getColorName();
	
	public abstract String getPrefix();
	
	public abstract List<String> getPerms();
	
}
