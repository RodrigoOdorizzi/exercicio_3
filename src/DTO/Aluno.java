package DTO;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodri
 */
public class Aluno extends Pessoa {

    
    
    
    private int matricula;
    private String cpf;
    private String danasc;
    private String email;
    
    
    
    public Aluno() {
    }

     

    public Aluno(int matricula, String cpf, String danasc, String email, String nome) {
        super(nome);
        this.matricula = matricula;
        this.cpf = cpf;
        this.danasc = danasc;
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDanasc() {
        return danasc;
    }

    public void setDanasc(String danasc) {
        this.danasc = danasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" +  super.getNome() + ", matricula=" + matricula + ", cpf=" + cpf + ", danasc=" + danasc + ", email=" + email + '}';
    }
    
    
}
