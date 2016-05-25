/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import fr.manastria.codex.Controller.BDController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import BD.ConnectionBD;

/**
 *
 * @author Matthieu
 */
public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String comment;
    private int id;
    private String photo;


    public Personne(){
        
    }
    
    public Personne(int id,String nom,String prenom,int age,String comment,String photo){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.comment=comment;
        this.photo=photo;
    }
        public int getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getComment() {
        return comment;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return nom +" "+ prenom +" "+ age +"an(s)" ;
    }
    public static ArrayList<Personne> findAll() throws ClassNotFoundException, SQLException{
        Connection connection;
        ConnectionBD connectionBD = null;
        ArrayList<Personne> coWorker = new ArrayList();
        connection=connectionBD.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM personne ORDER BY nom;");
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
        resultSet.close();
        statement.close();

       
        return coWorker;
    }

    public void save() throws ClassNotFoundException, SQLException {
        Connection connection;
        ConnectionBD connectionBD = null;
        connection=connectionBD.getConnection();
        if(this.id == -1){
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("INSERT INTO personne (nom , prenom , age, image, comment VALUES '"+this.nom+"','"+this.prenom+"','"+this.age+"','"+this.photo+"','"+this.comment+"';");
        resultSet.close();
        statement.close();
        }else{
           Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("UPDATE personne SET (nom = '"+this.nom+"',prenom = '"+this.prenom+"',age = "+this.age+"',image = '"+this.photo+"', comment = '"+this.comment+"' WHERE id="+this.id+";");
        resultSet.close();
        statement.close(); 
        }
    }
    
}


