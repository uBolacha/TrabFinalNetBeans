/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author vf983
 */
public class LivrosVenda {
    private int LivroVendaid;
    private final String titulo;
    private final String autor;
    private final String genero;
    private final String preço;

    public LivrosVenda(
            String titulo,
            String autor,
            String genero,
            String preço
                 ) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preço = preço;
    }

    public int getId() {
        return LivroVendaid;
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
    
    public String getPreço(){
        return preço;
    }
        
    public void setId(int id) {
        this.LivroVendaid = id;
    }
}
