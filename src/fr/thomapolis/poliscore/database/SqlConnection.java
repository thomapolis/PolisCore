package fr.thomapolis.poliscore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

public class SqlConnection {

	private Connection connection;
	private String urlbase,host,database,user,pass;
	
	public SqlConnection(String urlbase, String host, String database, String user, String pass) {
		
		this.urlbase = urlbase;
		this.host = host;
		this.database = database;
		this.user = user;
		this.pass = pass;
		
	}

	public void connect() {
		
		if(!isConnected()) {
			
			try {
				connection = DriverManager.getConnection(urlbase+host+"/" + database, user, pass);
				System.out.println("connected !");
			} catch (SQLException e) {
				System.out.println("connection error !!!");
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public void disconnect() {
		
		if(isConnected()) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}

	public boolean isConnected() {
		
		return connection != null;
	}
	
	public void createAccount(Player player) {
		
		if(!hasAccount(player)) {
			
			try {
				PreparedStatement q = connection.prepareStatement("INSERT INTO joueurs(uuid,money,rank) VALUES (?,?,?)");
				q.setString(1, player.getUniqueId().toString());
				q.setInt(2, 100);
				q.setString(3, "joueur");
				q.execute();
				q.close();
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		
	}
	
	public boolean hasAccount(Player player) {
		
		try {
			PreparedStatement q = connection.prepareStatement("SELECT uuid FROM joueurs WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			ResultSet result = q.executeQuery();
			boolean hasAccount = result.next();
			
			return hasAccount;
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;
	}
	
	public int getMoney(Player player) {
		
		return 0;
	}
	
	public void addMoney(Player player) {
		
		
	}
	
	public void removeMoney(Player player) {
		
		
	}
}