/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetobiblioteca;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vf983
 */
public class ClienteTableModel  extends AbstractTableModel { 
    private List<Cliente> itens;
    private Class[] types = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class
    };
    private String[] columns = new String[] {
        "Código",
        "nome",
        "celular",
        "email",
        "senha"
    };
    private boolean[] canEdit = new boolean [] {
        false, 
        false, 
        false, 
        false, 
        false
    };
    
    public ClienteTableModel(List<Cliente> items) {
        this.itens = items;
        this.addTableModelListener(null);
    }
      @Override
    public int getRowCount() {
        return itens.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente item = itens.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getUserId();
            case 1: return item.getNome();
            case 2: return item.getCelular();
            case 3: return item.getEmail();
            case 4: return item.getSenha();
        }
        return null;
    }
       @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
    
    public void add(Cliente item) {
        itens.add(item);
        int row = itens.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove(Cliente item) {
        if (itens.contains(item)) {
            int row = itens.indexOf(item);
            itens.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
}
