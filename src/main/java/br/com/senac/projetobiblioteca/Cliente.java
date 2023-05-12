/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author vf983
 */
public class Cliente {
 private int userid;
 private final String nomecompleto; 
 private final String celular;
 private final String email;
 private final String senha;


    public Cliente( 
            String nomecompleto,
            String celular, 
            String email,
            String senha
           
                   ) {
       this.nomecompleto = nomecompleto;
       this.celular = celular;
       this.email = email;
       this.senha = senha;
       
                   
    }
    public int getUserId(){
        return userid;
    }
    public String getNome(){
        return nomecompleto;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
       public void setUserId(int id) {
        this.userid = id;
    }


}
