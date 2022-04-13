/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.CondicaoPagamentoDAO;
import com.diego.projet.loja.maven.model.bo.CondicaoPagamento;

/**
 *
 * @author Diego
 */
public class CondicaoPagamentoService {
    public CondicaoPagamento buscarPorId(Long idCondicaoPagamento) {
        CondicaoPagamentoDAO dao = new CondicaoPagamentoDAO();
        return dao.buscarPorId(idCondicaoPagamento);
    }
}
