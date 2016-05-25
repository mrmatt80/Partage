
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Matthieu
 */
public class Animal {

    private final int id;
    private final String name;
    
    
    public Animal(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public static ArrayList<Animal> findAll() throws ClassNotFoundException, SQLException{
        ArrayList<Animal> animals = new ArrayList();
        
        // 1 ere etape charger le driver
        Class.forName("org.sqlite.JDBC");
        // 2 eme etape : connexion a la database
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Matthieu\\BDJava.db");
        
        // 3 eme etape : requête de la base
        Statement statement = connection.createStatement();
        
       ResultSet resultSet = statement.executeQuery("SELECT * FROM animals ORDER BY nom;");
        // 4 eme etape affichage de retour de base
        while(resultSet.next()){
            int id = -1;
            String name = "Not Found";
            id = resultSet.getInt("id");
            name = resultSet.getString("nom");
            animals.add(new Animal(id,name));
        }
        // 5 eme etape TOUT FERMER DANS L ORDRE !!!!!!
        resultSet.close();
        statement.close();
        connection.close();
        
        return animals;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + '}';
    }
    
}
