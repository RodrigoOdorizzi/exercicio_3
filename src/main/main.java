
import BO.AlunoBO;
import BO.Dados;
import DAO.DadosCSV;
import DAO.DadosJSON;
import DAO.DadosXML;
import DAO.EmitirDados;
import DAO.ListAluno;
import DTO.Aluno;
import java.io.IOException;
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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
 
    
        
        Aluno a = new Aluno();
        a.setCpf("111.111.111-11");
        a.setDanasc("12/12/2001");
        a.setMatricula(123456789);
        a.setEmail("rodrigo@gmail.com");
        a.setNome("rodrie1o");
            
       
        //salvar banco de dados
          Dados d = new AlunoBO();
        EmitirDados e = new EmitirDados(d);
        e.emitirinserir(a);
    
     
        //para salvar em JSON
         d = new DadosJSON();
        e = new EmitirDados(d);
        e.emitirinserir(a);
        
        //Para salvar em CSV
         d = new DadosCSV();
           e = new EmitirDados(d);
        e.emitirinserir(a);
         
        //para salvar em XML
        d = new DadosXML();
        e = new EmitirDados(d);
        e.emitirinserir(a);
     /*
    */
        
        
      
    
    }
    
}
