/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author vf983
 */
public class BibliotecaPoggers {
    private final String nome;
    private final List<Cliente> clientes;
    private final List<LivrosVenda> livrosVendas;
    private final List<LivrosAluguel> livrosAluguel;
    private int idCounter = 0;
    
    public BibliotecaPoggers (String nome){
        this.nome = nome ;
        this.clientes = new ArrayList<>();
        this.livrosVendas = new ArrayList<>();
        this.livrosAluguel = new ArrayList<>();
        
    
        //metodos de cliente
}
        public BibliotecaPoggers getBiblioteca(){
        return this;
    }
        public void addCliente(Cliente cliente){
        cliente.setUserId(++this.idCounter);
        this.clientes.add(cliente);
    }
            public void editCliente(Cliente cliente){
        if(cliente.getUserId()> 0){
            int index = this.clientes.indexOf(cliente);
            if(index >= 0)
                this.clientes.set(index, cliente);
        } else {
            addCliente(cliente);
        }
    }
        public void removeCliente(Cliente cliente){
        this.clientes.remove(cliente);
    }
         public List<Cliente> findClientes(String nomecompleto, String celular, String email){
        List<Cliente> resultadoClientes = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            if(cliente.getNome().equals(nomecompleto))
                resultadoClientes.add(cliente);
            else if(cliente.getCelular().equals(celular))
                resultadoClientes.add(cliente);
            else if(cliente.getEmail().equals(email))
                resultadoClientes.add(cliente);
        }
        return resultadoClientes;
    }
    
    public String getNomeCliente() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    };
                
                //metodos de compra
                
               public void addLivroVenda(LivrosVenda livrosVenda){
        livrosVenda.setId(++this.idCounter);
        this.livrosVendas.add(livrosVenda);
    }
            public void editLivroVenda(LivrosVenda livrosVenda){
        if(livrosVenda.getId()> 0){
            int index = this.livrosVendas.indexOf(livrosVenda);
            if(index >= 0)
                this.livrosVendas.set(index, livrosVenda);
        } else {
            addLivroVenda(livrosVenda);
        }
    }
                public void removeLivroVenda(LivrosVenda livrosVenda){
        this.livrosVendas.remove(livrosVenda);
    }
         public List<LivrosVenda> findLivroVenda(String titulo, String autor, String genero){
        List<LivrosVenda> resultadoVendas = new ArrayList<>();
        for (LivrosVenda livrosvenda : this.livrosVendas) {
            if(livrosvenda.getTitulo().equals(titulo))
                resultadoVendas.add(livrosvenda);
            else if(livrosvenda.getAutor().equals(autor))
                resultadoVendas.add(livrosvenda);
            else if(livrosvenda.getGenero().equals(genero))
                resultadoVendas.add(livrosvenda);
        }
        return resultadoVendas;
    }
    
    public String getNomeVenda() {
        return nome;
    }

    public List<LivrosVenda> getLivrosVenda() {
        return livrosVendas;
    };
                
                // metodos de aluguel 
                
        public void addLivroAluguel(LivrosAluguel livrosAluguel){
        livrosAluguel.setId(++this.idCounter);
        this.livrosAluguel.add(livrosAluguel);
    }
            public void editLivroAluguel(LivrosAluguel livrosAluguel){
        if(livrosAluguel.getId()> 0){
            int index = this.livrosAluguel.indexOf(livrosAluguel);
            if(index >= 0)
                this.livrosAluguel.set(index, livrosAluguel);
        } else {
            addLivroAluguel(livrosAluguel);
        }
    }
                public void removeLivroAluguel(LivrosAluguel livrosAluguel){
        this.livrosAluguel.remove(livrosAluguel);
    }
        public List<LivrosAluguel> findLivroAluguel(String titulo, String autor, String genero){
        List<LivrosAluguel> resultadoAluguel = new ArrayList<>();
        for (LivrosAluguel livrosaluguel : this.livrosAluguel) {
            if(livrosaluguel.getTitulo().equals(titulo))
                resultadoAluguel.add(livrosaluguel);
            else if(livrosaluguel.getAutor().equals(autor))
                resultadoAluguel.add(livrosaluguel);
            else if(livrosaluguel.getGenero().equals(genero))
                resultadoAluguel.add(livrosaluguel);
        }
        return resultadoAluguel;
    }
    
    public String getNomeAluguel() {
        return nome;
    }

    public List<LivrosAluguel> getLivrosAluguel() {
        return livrosAluguel;
    }
    
    
    

}
