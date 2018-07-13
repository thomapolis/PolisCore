package fr.thomapolis.poliscore.ranks;

import java.util.List;

public abstract class Rank {

	public abstract String getName();
	
	public abstract String prefix();
	
	public abstract List<String> perms();
	
}
