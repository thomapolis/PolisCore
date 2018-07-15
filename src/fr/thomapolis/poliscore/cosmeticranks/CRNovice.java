package fr.thomapolis.poliscore.cosmeticranks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;

public class CRNovice extends CosmeticRank {

	@Override
	public String getName() {
		
		return "Novice";
	}
	
	@Override
	public int getPower() {

		return 0;
	}

	@Override
	public String getSymbole() {
		return "✿";
	}

	@Override
	public ChatColor getColor() {
		
		return ChatColor.YELLOW;
	}
	
	@Override
	public List<String> getCosmetics() {
		
		List<String> cosmetics = new ArrayList<>();
		cosmetics.add("1");
		cosmetics.add("2");
		
		return cosmetics;
	}

}
