package DAO;

 
import Conexao.Conexao;
import DTO.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 

public class AlunoDAO {

    final String NOMEDATABELA = "aluno";
    public boolean inserir(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf,datanasc,email,matricula) VALUES (?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getDanasc());
            ps.setString(4, aluno.getEmail());
            ps.setInt(5, aluno.getMatricula());
             
            
            
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    /*
    
    public boolean alterar(Marca marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET descricao = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
            ps.setInt(2, marca.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public boolean excluir(Marca marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
    }
    public Marca procurarPorCodigo(Marca marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, marca.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Marca obj = new Marca();
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    public Marca procurarPorDescricao(Marca marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE descricao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getDescricao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Marca obj = new Marca();
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    */
    public boolean existe(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
                 
             
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    /*
    public List<Marca> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Marca> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Marca> montarLista(ResultSet rs) {
        List<Marca> listObj = new ArrayList<Marca>();
        try {
            while (rs.next()) {
                Marca obj = new Marca();
                obj.setCodigo(rs.getInt(1));
                obj.setDescricao(rs.getString(2));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
           System.err.println("Erro: " + e.toString());
           e.printStackTrace();
            return null;
        }
    }*/
}