package fr.thomapolis.poliscore.ranks;

import java.util.List;

import org.bukkit.ChatColor;

public class Joueur extends Rank {

	@Override
	public String getName() {

		return "joueur";
	}

	@Override
	public ChatColor getColorName() {
		
		return ChatColor.GRAY;
	}

	@Override
	public String getPrefix() {
		
		return ChatColor.GRAY+"["+ChatColor.BLUE+"Joueur"+ChatColor.GRAY+"] ";
	}

	@Override
	public List<String> getPerms() {
		// XXX Auto-generated method stub
		return null;
	}

}
