/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

/**
 *
 * @author vf983
 */
public class Dados {
     private BibliotecaPoggers bibliotecaPoggers;
     

    public Dados() {
        initDados();
    }
    
    private void initDados(){
        // Inicializa biblioteca
        this.bibliotecaPoggers = new BibliotecaPoggers("Biblioteca do Vitin");
        
        // LIVROS VENDA
        this.bibliotecaPoggers.addLivroVenda(new LivrosVenda("BLEACH","Tite Kubo","Shonen","33,90"));
        this.bibliotecaPoggers.addLivroVenda(new LivrosVenda("Fire and Blood","George Martin","Fanatasia", "49,95"));
        this.bibliotecaPoggers.addLivroVenda(new LivrosVenda("Harry Potter","J.K. Rownling","Fantasia","30,90"));
        this.bibliotecaPoggers.addLivroVenda(new LivrosVenda("Dragon Ball","Akira Toriyama","Shonen","23,90"));
        this.bibliotecaPoggers.addLivroVenda(new LivrosVenda("Six of Crows"," Leigh Bardugo","Fantasia","25,90"));
        
        // LIVROS ALUGUEL
        this.bibliotecaPoggers.addLivroAluguel(new LivrosAluguel("BLEACH","Tite Kubo","Shonen"));
        this.bibliotecaPoggers.addLivroAluguel(new LivrosAluguel("Fire and Blood","George Martin","Fanatasia"));
        this.bibliotecaPoggers.addLivroAluguel(new LivrosAluguel("Harry Potter","J.K. Rownling","Fantasia"));
        this.bibliotecaPoggers.addLivroAluguel(new LivrosAluguel("Dragon Ball","Akira Toriyama","Shonen"));
        this.bibliotecaPoggers.addLivroAluguel(new LivrosAluguel("Six of Crows"," Leigh Bardugo","Fantasia"));
        
        // CLIENTES
        
        this.bibliotecaPoggers.addCliente(new Cliente("ronaldin","40028922","pedrogamer@gmail","1234"));
        this.bibliotecaPoggers.addCliente(new Cliente("ronaldao","40028922","robsongamer@gmail","1234"));
    }
    
    public BibliotecaPoggers getBiblioteca(){
        return this.bibliotecaPoggers;
    }
}
