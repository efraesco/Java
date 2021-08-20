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
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException{
        ArrayList<Requerimiento_2> resultado = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        try{       

            String consulta = " select ID_Proyecto, Proveedor, Pagado, Compra.ID_MaterialConstruccion, Nombre_Material " +
                    "from Compra inner join MaterialConstruccion " +
                    "on (Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion) " +
                    "where Proveedor ='Homecenter' and Pagado='No' " +
                    "order by ID_Proyecto; ";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Requerimiento_2 requerimiento = new Requerimiento_2();
                requerimiento.setIdProyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento.setProveedor(resultSet.getString("Proveedor"));
                requerimiento.setPagado(resultSet.getString("Pagado"));
                requerimiento.setIdMaterialConstruccion(resultSet.getInt("ID_MaterialConstruccion"));
                requerimiento.setMaterialConstruccion(resultSet.getString("Nombre_Material"));
                resultado.add(requerimiento);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.err.println("Exception: no es posible resolver Requerimiento 4 Reto 3: "+e);
        
        }
        return resultado;
    }
}
