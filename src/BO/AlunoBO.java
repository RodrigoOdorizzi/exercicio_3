package BO;

 
 
import DAO.AlunoDAO;
import DTO.Aluno;
import java.util.List;

public class AlunoBO implements Dados{

    public void inserir(Aluno aluno){
        
            AlunoDAO alunosDAO = new AlunoDAO();
            alunosDAO.inserir(aluno);
       
        
    }
    /*
    public boolean alterar(Aluno aluno){
        AlunoDAO alunosDAO = new AlunoDAO();
        return alunosDAO.alterar(aluno);
    }
    public boolean excluir(Aluno aluno){
        AlunoDAO alunosDAO = new AlunoDAO();
        return alunosDAO.excluir(aluno);
    }
    public Aluno procurarPorCodigo(Aluno aluno){
        AlunoDAO alunosDAO = new AlunoDAO();
        return alunosDAO.procurarPorCodigo(aluno);
    }
    public Aluno procurarPorDescricao(Aluno aluno){
        AlunoDAO alunosDAO = new AlunoDAO();
        return alunosDAO.procurarPorDescricao(aluno);
    }

*/
    public void existe(Aluno aluno){
        AlunoDAO alunosDAO = new AlunoDAO();
        alunosDAO.existe(aluno);
    }
  /*  public List<Aluno> pesquisarTodos(){
        AlunoDAO alunosDAO = new AlunoDAO();
        return alunosDAO.pesquisarTodos();
    }*/
}