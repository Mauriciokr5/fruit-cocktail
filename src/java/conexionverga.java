/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class conexionverga extends HttpServlet {

    private Connection conexion;
    private Statement state;
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/database_PA";
    String usuario = "root";
    String clave = "n0m3l0";
    private String y;
    
    
    public conexionverga(){
        
    }
     public String prinusuario(){     
        
        y="hi";
        return y;
    }      
    
    
    public void conexion(){
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url,usuario,clave);
            state = conexion.createStatement();
            System.out.print("si hay conexion");
            
            
        } catch (Exception ex){

            System.out.print("no hay conexion");
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
        }
        
    }
            
            
             

            

            
            
            
          
    /*public String prinusuario(){     
        try{
        ResultSet rs= state.executeQuery("Select * from usuarios");
        String y="";

        while(rs.next()){
            y=y+rs.getObject(2);
        }
        
        }catch(Exception e){
            System.out.print(e);
        }
        
        return y;
    }  */     
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           
        }
    


    
