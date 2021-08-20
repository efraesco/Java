/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Requerimiento_1;
import Modelo.Requerimiento_1Dao;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_2Dao;
import Modelo.Requerimiento_3;
import Modelo.Requerimiento_3Dao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eescobarm
 */
public class ControladorRequerimientos {
    private final Requerimiento_1Dao requerimiento1;
    private final Requerimiento_2Dao requerimiento2;
    private final Requerimiento_3Dao requerimiento3;    
    
    public ControladorRequerimientos() {
        this.requerimiento1 = new Requerimiento_1Dao();
        this.requerimiento2 = new Requerimiento_2Dao();
        this.requerimiento3 = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException{
        return this.requerimiento1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException{
        return this.requerimiento2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException{
        return this.requerimiento3.requerimiento3();
    }
}
