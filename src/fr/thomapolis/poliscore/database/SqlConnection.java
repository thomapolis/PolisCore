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
				PreparedStatement q = connection.prepareStatement("INSERT INTO joueursData(UUID,pseudo,money,rank) VALUES (?,?,?,?)");
				q.setString(1, player.getUniqueId().toString());
				q.setString(2, player.getName());
				q.setInt(3, 100);
				q.setString(4, "joueur");
				q.execute();
				q.close();
				
				System.out.println(player.getName()+" a bien été enregistré sur la BDD");
				System.out.println(getId(player)+" "+getMoney(player)+" "+getRank(player));
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		
	}
	
	public boolean hasAccount(Player player) {
		
		try {
			PreparedStatement q = connection.prepareStatement("SELECT uuid FROM joueursData WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			ResultSet result = q.executeQuery();
			boolean hasAccount = result.next();
			
			q.close();
			
			return hasAccount;
		
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;
	}
	
	public int getMoney(Player player) {
		
		try {
			
			PreparedStatement q = connection.prepareStatement("SELECT money FROM joueursData WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			int money = 0;
			ResultSet rs = q.executeQuery();
			
			while(rs.next()) {
				money = rs.getInt("money");
				
			}
			
			q.close();
			
			return money;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int getId(Player player) {
		
		try {
			
			PreparedStatement q = connection.prepareStatement("SELECT id FROM joueursData WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			int id = 0;
			ResultSet rs = q.executeQuery();
			
			while(rs.next()) {
				id = rs.getInt("id");
				
			}
			
			q.close();
			
			return id;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public String getRank(Player player) {
		
		try {
			
			PreparedStatement q = connection.prepareStatement("SELECT rank FROM joueursData WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			String rank = "";
			ResultSet rs = q.executeQuery();
			
			while(rs.next()) {
				rank = rs.getString("rank");
				
			}
			
			q.close();
			
			return rank;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int getCosmeticPower(Player player) {
		
		try {
			
			PreparedStatement q = connection.prepareStatement("SELECT cosmeticrank FROM joueursData WHERE uuid = ?");
			q.setString(1, player.getUniqueId().toString());
			
			int power = 0;
			ResultSet rs = q.executeQuery();
			
			while(rs.next()) {
				power = rs.getInt("cosmeticrank");
				
			}
			
			q.close();
			
			return power;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}
}
