/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eescobarm
 */
public class Requerimiento_1Dao {
    
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException{
        ArrayList<Requerimiento_1> resultado = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();
        try{       

            String consulta = "select count(l.ID_Lider) numLideres, Ciudad_Residencia " +
                    "from Lider l " +
                    "group by Ciudad_Residencia " +
                    "order by Ciudad_Residencia";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Requerimiento_1 requerimiento = new Requerimiento_1();
                requerimiento.setNumLideres(resultSet.getInt("numLideres"));
                requerimiento.setCiudadResidencia(resultSet.getString("Ciudad_Residencia"));
                resultado.add(requerimiento);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Exception: No es posible resolver Requerimiento 3 Reto 3: "+e);
        
        }
        return resultado;
    }
}
