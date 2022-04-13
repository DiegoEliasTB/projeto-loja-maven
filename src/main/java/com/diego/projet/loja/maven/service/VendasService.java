package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.service.InterfaceService;
import java.util.List;
import com.diego.projet.loja.maven.model.DAO.CidadeDAO;
import com.diego.projet.loja.maven.model.DAO.VendasDAO;
import com.diego.projet.loja.maven.model.bo.Venda;

public class VendasService implements InterfaceService<Venda> {

    @Override
    public void salvar(Venda objeto) {
        VendasDAO vendasDAO = new VendasDAO();
        vendasDAO.create(objeto);
    }

    @Override
    public List<Venda> buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Venda buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Venda buscar(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Venda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void apagar(Venda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

  

}
