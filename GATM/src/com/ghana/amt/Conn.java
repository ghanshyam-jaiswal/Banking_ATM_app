package com.ghana.amt;



import java.sql.*;  

public class Conn{
   Connection c; 
   Statement s;
   public Conn(){  
       try{  
           class.forName("com.mysql.cj.jdbc.Driver");  
//           class.forName("org.postgresql.Driver");  
           c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");    
//           c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/bankmanagementsystem","postgres","root");    
           s =c.createStatement(); 
          
         
           
       }catch(Exception e){ 
           System.out.println(e);
       }  
   }  
}  
