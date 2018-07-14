package fr.thomapolis.poliscore.type;

import java.util.ArrayList;
import java.util.List;

import fr.thomapolis.poliscore.cosmeticranks.CRAmateur;
import fr.thomapolis.poliscore.cosmeticranks.CRNovice;
import fr.thomapolis.poliscore.cosmeticranks.CosmeticRank;

public class CosmeticRankType {

	public List<CosmeticRank> ranks = new ArrayList<>();
	
	public CosmeticRankType() {
		
		register();
		
	}
	
	public void register() {
		
		this.ranks.add(new CRNovice());
		this.ranks.add(new CRAmateur());
		
	}
	
	public boolean rankExist(int power) {
		
		for(CosmeticRank rank : ranks) {
			
			if(power == rank.getPower()) {
				
				return true;
			}
			
		}
		
		return false;
	}
	
	public CosmeticRank getRank(int power) {
		
		for(CosmeticRank rank : ranks) {
			
			if(power == rank.getPower()) {
				
				return rank;
			}
		}
		
		return null;
	}
	
}
