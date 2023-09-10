package MODELO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsconexion {
    public Connection cn ;
    private final String pueto="3306";
    private final String BD="dbempresa";
   // jdbc:mysql://localhost:3306/?user=root
    private final String urlconection= String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",pueto,BD);
    private final String usuario ="root";
    private final String contraseña="1234";
    private final String jdbc="com.mysql.cj.jdbc.Driver";
    
    public  void abrir(){
    try{
        Class.forName(jdbc);
            cn=DriverManager.getConnection(urlconection, usuario, contraseña);
            System.out.println("si se conecto:) ");
    }catch(ClassNotFoundException  | SQLException ex){
         System.out.println("error "+ ex.getMessage());
    }
    
    
    }
     public  void cerrar(){
    try{
        Class.forName(jdbc);
           cn.close();
            System.out.println("si se desconecto:) ");
    }catch(ClassNotFoundException  | SQLException ex){
         System.out.println("error "+ ex.getMessage());
    }
    
    
    }
    
    
    
}
