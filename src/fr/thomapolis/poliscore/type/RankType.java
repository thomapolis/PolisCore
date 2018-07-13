package fr.thomapolis.poliscore.type;

import java.util.ArrayList;
import java.util.List;

import fr.thomapolis.poliscore.ranks.Rank;

public class RankType {

	private static List<Rank> ranks;
	
	public RankType() {
		
		ranks = new ArrayList<>();
		
	}
	
	public static void register() {
		
		
		
	}
	
	public boolean isRank(String name) {
		
		for(Rank rank : ranks) {
			
			if(name.equals(rank.getName())) {
				
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public Rank getRank(String name) {
		
		for(Rank rank : ranks) {
				
			if(name.equals(rank.getName())) {
				
				return rank;
			}
		}
		
		return null;
	}
	
}
