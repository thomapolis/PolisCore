package fr.thomapolis.poliscore.ranks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class Admin extends Rank {

	@Override
	public String getName() {

		return "admin";
	}

	@Override
	public ChatColor getColorName() {
		
		return ChatColor.RED;
	}
	
	@Override
	public String getPrefix() {

		return ChatColor.RED+"["+ChatColor.DARK_RED+"Administrateur"+ChatColor.RED+"] ";
	}

	@Override
	public List<String> getPerms() {
		
		List<String> perms = new ArrayList<>();
		
		
		return null;
	}

}
