package fr.thomapolis.poliscore.type;

import java.util.ArrayList;
import java.util.List;

import fr.thomapolis.poliscore.ranks.Admin;
import fr.thomapolis.poliscore.ranks.Joueur;
import fr.thomapolis.poliscore.ranks.Rank;

public class RankType {

	private List<Rank> ranks;
	
	public RankType() {
		
		this.ranks = new ArrayList<>();
		
		register();
		
	}
	
	public void register() {
		
		this.ranks.add(new Admin());
		this.ranks.add(new Joueur());
		
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
