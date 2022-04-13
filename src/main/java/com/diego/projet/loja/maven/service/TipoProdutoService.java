/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.TipoProdutoDAO;
import com.diego.projet.loja.maven.model.bo.TipoProduto;

/**
 *
 * @author Diego
 */
public class TipoProdutoService {
    
    public TipoProduto buscarPorId(Long idTipoProduto) {
        TipoProdutoDAO tipoProdutoDAO = new TipoProdutoDAO();
        return tipoProdutoDAO.buscarPorId(idTipoProduto);
    }
}
