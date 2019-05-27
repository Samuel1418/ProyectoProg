/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mmr_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Samuel
 */
public class Conectarse {
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Conexion= True");
            
        } catch (SQLException e) {
            System.out.println("Conexion= False");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
 
    
    
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Usuario (\n"
                + "	NombreUSer text NOT NULL PRIMARY KEY,\n"
                + "	NumeroPartida real PRIMARY KEY,\n"
                + "	Resultado text\n"
                + "	Farmeo real\n"
                + "	Kills real,\n"
                + "	Asesinatos real,\n"
                + "	Muertes real,\n"
                + "	Vision real,\n"
                + "	Rango text,\n"
                + "	Elo real,\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTable2() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        
        // SQL statement for creating a new table
        String sql1 = "CREATE TABLE IF NOT EXISTS Build (\n"
                + "	NombreBuild text PRIMARY KEY,\n"
                + "	NombreObjeto text,\n"
                + "	NombreObjeto2 text,\n"
                + "	NombreObjeto3 text,\n"
                + "	NombreObjeto4 text,\n"
                + "	NombreObjeto5 text,\n"
                + "	NombreObjeto6 text,\n"
                + ");";
        
        try (Connection connn = DriverManager.getConnection(url);
            Statement stmt = connn.createStatement()) {
            stmt.execute(sql1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
