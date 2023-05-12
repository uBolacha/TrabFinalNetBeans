/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import java.util.Objects;

/**
 *
 * @author vf983
 */
public class LivrosAluguel {
    private int LivroAluguelid;
    private final String titulo;
    private final String autor;
    private final String genero;
    private boolean disponivel;

    public LivrosAluguel(
            String titulo,
            String autor,
            String genero
                 ) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public int getId() {
        return LivroAluguelid;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }
    
    public void setId(int id) {
        this.LivroAluguelid = id;
    }
    
     public boolean isDisponivel() {
        return disponivel;
    }
      
     public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LivrosAluguel other = (LivrosAluguel) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

}
