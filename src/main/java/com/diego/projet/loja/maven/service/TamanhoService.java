/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.TamanhoDAO;
import com.diego.projet.loja.maven.model.bo.Tamanho;

/**
 *
 * @author Diego
 */
public class TamanhoService {
    
    public Tamanho buscarPorId(Long idTamanho) {
        TamanhoDAO tamanhoDAO = new TamanhoDAO();
        return tamanhoDAO.buscarPorId(idTamanho);
    }
}
