package fr.thomapolis.poliscore.cosmeticranks;

import java.util.List;

import org.bukkit.ChatColor;

public class CRAmateur extends CosmeticRank {

	@Override
	public String getName() {
		
		return "amateur";
	}

	@Override
	public int getPower() {

		return 1;
	}

	@Override
	public String getSymbole() {

		return "◈";
	}

	@Override
	public ChatColor getColor() {

		return ChatColor.GREEN;
	}

	@Override
	public List<String> getCosmetics() {
		// XXX Auto-generated method stub
		return null;
	}

}
