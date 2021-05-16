package DAO;


import BO.Dados;
import DTO.Aluno;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class DadosJSON implements Dados {
    
       public ArrayList<Aluno> lista = new ArrayList<Aluno>();
	 
        
    public void inserir(Aluno aluno) throws IOException {
   
    
        
     GsonBuilder builder = new GsonBuilder();
           // Classe base do GSON
           Gson gson = builder.create();
           // Classe para escrita de arquivo
         
          try {
             FileWriter  writer = new FileWriter("json/arquivo.json");
             writer.write(gson.toJson(aluno));
           writer.close();
           
              
          } catch (IOException ex) {
              Logger.getLogger(DadosJSON.class.getName()).log(Level.SEVERE, null, ex);
          }
    
    
    }
	 
}
 