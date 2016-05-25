/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manastria.codex.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Models.Personne;
import javax.swing.JList;

/**
 *
 * @author Matthieu
 */
final public class BDController extends Personne {
    

        public BDController(int id, String nom, String prenom, int age, String comment, String photo) {
        super(id, nom, prenom, age, comment, photo);
    }
    public static ArrayList<Personne> findAll() throws ClassNotFoundException, SQLException{
        ArrayList<Personne> coWorker = new ArrayList();
        // 1 ere etape charger le driver
        Class.forName("org.sqlite.JDBC");
        // 2 eme etape : connexion a la database
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Matthieu\\BDProjetJava.db");
        
        // 3 eme etape : requête de la base
        Statement statement = connection.createStatement();
        
       ResultSet resultSet = statement.executeQuery("SELECT * FROM personne ORDER BY nom;");
        // 4 eme etape affichage de retour de base
        while(resultSet.next()){
            int id = -1;
            int age = -1;
            String name = "Not Found";
            String prenom = "Not Found";
            String comment = "Not Found";
            String image = "Not Found";
            id = resultSet.getInt("id");
            name = resultSet.getString("nom");
            prenom = resultSet.getString("prenom");
            age = resultSet.getInt("age");
            comment = resultSet.getString("comment");
            image = resultSet.getString("image");
            
            
            coWorker.add(new BDController(id,name,prenom,age,comment,image));
        }
        // 5 eme etape TOUT FERMER DANS L ORDRE !!!!!!
        resultSet.close();
        statement.close();
        connection.close();
       
        return coWorker;
    }

    public void addBD(Personne personne) throws ClassNotFoundException, SQLException {
        String nom, prenom, comment, photo;
        int age;
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Matthieu\\BDProjetJava.db");
        Statement statement = connection.createStatement();
        nom = personne.getNom();
        prenom = personne.getPrenom();
        age = personne.getAge();
        comment = personne.getComment();
        photo = personne.getPhoto();
        ResultSet resultSet = statement.executeQuery("INSERT INTO personne (nom , prenom , age, image, comment VALUES 'nom','prenom','age','photo','comment';");

        resultSet.close();
        statement.close();
        connection.close();
    }
}

    
