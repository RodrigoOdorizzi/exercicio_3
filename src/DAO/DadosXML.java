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
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
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
public class DadosXML implements Dados {
    
       public ArrayList<Aluno> lista = new ArrayList<Aluno>();
	 
         
    public void inserir(Aluno aluno) throws IOException {
   
     
       FileOutputStream fos = new FileOutputStream(new File("xml/arquivo2.xml"));
       XMLEncoder encoder = new XMLEncoder(fos);
       encoder.writeObject(aluno);
       encoder.close();
       fos.close();
    
    
    }
}