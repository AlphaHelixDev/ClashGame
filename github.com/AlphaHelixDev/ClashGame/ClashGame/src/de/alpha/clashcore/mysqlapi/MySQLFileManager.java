package de.alpha.clashcore.mysqlapi;

public class MySQLFileManager {

	public static SimpleFile getMySQLFile() {
		
		return new SimpleFile(MySQLAPI.getMySQLFilePath(), "mysql.yml");	
	}
	
	public static void setStandardMySQL() {		
		SimpleFile cfg = getMySQLFile();
		
		cfg.setDefault("username", "root");
		cfg.setDefault("password", "password");	
		cfg.setDefault("database", "localhost");		
		cfg.setDefault("host", "localhost");		
		cfg.setDefault("port", "3306");
		
		cfg.save();	
	}
	
	public static void readMySQL() {
		SimpleFile cfg = getMySQLFile();

		MySQLAPI.setMySQLConnection(cfg.getString("username"), cfg.getString("password"), cfg.getString("database"), cfg.getString("host"), cfg.getString("port"));		
	}
}