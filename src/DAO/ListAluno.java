package DAO;


import DTO.Aluno;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class ListAluno {
  
	public ArrayList<Aluno> lista = new ArrayList<Aluno>();
	 
	public void inserir(Aluno alu){
	//	lista.add(alu);
                
                if (lista.isEmpty()) {

 		alu.setCodigo(1);
		} else {
 			alu.setCodigo(lista.get(lista.size() - 1).getCodigo() + 1);
		}
		this.lista.add(alu);


	}
	
	public List<Aluno> getLista(){
		return lista;
	}
	
	
         
	

}

 