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
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException{
        ArrayList<Requerimiento_3> resultado = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        try{  
            String consulta = "select distinct Lider.ID_Lider, Nombre, Primer_Apellido, Segundo_Apellido " +
                    "from Lider inner join Proyecto " +
                    "on (Lider.ID_Lider = Proyecto.ID_Lider); ";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Requerimiento_3 requerimiento = new Requerimiento_3();
                requerimiento.setIdLider(resultSet.getInt("ID_Lider"));
                requerimiento.setNombre(resultSet.getString("Nombre"));
                requerimiento.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                requerimiento.setSegundoApellido(resultSet.getString("Segundo_Apellido"));
                resultado.add(requerimiento);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Exception: No es posible resolver Requerimiento 5 Reto 3: "+e);
        
        }
        return resultado;
    } 
}
