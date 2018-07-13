package fr.thomapolis.poliscore.cosmeticranks;

import org.bukkit.ChatColor;

public abstract class CosmeticRank {

	public abstract int getPower();
	
	public abstract String getSymbole();
	
	public abstract ChatColor getColor();
	
	public abstract int[] getCosmetics();
	
	public String getPrefix() {
		
		return getColor()+getSymbole();
	}
}
