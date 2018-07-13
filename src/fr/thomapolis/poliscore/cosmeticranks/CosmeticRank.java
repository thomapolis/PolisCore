package fr.thomapolis.poliscore.cosmeticranks;

import java.util.List;

import org.bukkit.ChatColor;

public abstract class CosmeticRank {

	public abstract int getPower();
	
	public abstract String getSymbole();
	
	public abstract ChatColor getColor();
	
	public abstract List<String> getCosmetics();
	
	public String getPrefix() {
		
		return getColor()+getSymbole();
	}
}
