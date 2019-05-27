/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mmr_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */

public class Introducir {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:D:\\Clase\\SQLMan\\hola.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
     public void insert(String NombreUSer, int NumeroPartida,String Resultado,int Farmeo,int Kills,int Asesinatos,int Muertes,int Vision,int Rango,int Elo) {
        String sql = "INSERT INTO Usuario(NombreUSer,NumeroPartida,Resultado,Farmeo,Kills,Asesinatos,Muertes,vision,elo) VALUES(?,?,?,?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NombreUSer);
            pstmt.setInt(2, NumeroPartida);
            pstmt.setString(3, Resultado);
            pstmt.setInt(4, Farmeo);
            pstmt.setInt(5, Kills);
            pstmt.setInt(6, Asesinatos);
            pstmt.setInt(7, Muertes);
            pstmt.setInt(8, Vision);
            pstmt.setInt(9, Rango);
            pstmt.setInt(10, Elo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }
        }
     
     public void insert2(String NombreBuild,String NombreObjeto, String NombreObjeto2,String NombreObjeto3,String NombreObjeto4,String NombreObjeto5,String NombreObjeto6) {
        String sql = "INSERT INTO Build(NombreBuild,NombreObjeto,NombreObjeto2,NombreObjeto3,NombreObjeto4,NombreObjeto5,NombreObjeto6) VALUES(?,?,?,?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NombreBuild);
            pstmt.setString(2, NombreObjeto);
            pstmt.setString(3, NombreObjeto2);
            pstmt.setString(4, NombreObjeto3);
            pstmt.setString(5, NombreObjeto4);
            pstmt.setString(6, NombreObjeto5);
            pstmt.setString(7, NombreObjeto6);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se puede repetir la clave primaria!");
            JOptionPane.showMessageDialog(null,"No se puede repetir la clave primaria!");
        }
        }
}
