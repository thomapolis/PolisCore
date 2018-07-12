package fr.thomapolis.poliscore.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.thomapolis.poliscore.PolisCore;
import fr.thomapolis.poliscore.database.SqlConnection;

public class ListenerPlayer implements Listener {

	public SqlConnection sql;
	
	public ListenerPlayer(PolisCore polisCore) {

		this.sql = polisCore.getSQL();
		
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		sql.createAccount(event.getPlayer());
		
	}
	
}
