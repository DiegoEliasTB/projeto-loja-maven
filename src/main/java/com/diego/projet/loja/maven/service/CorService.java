/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.CorDAO;
import com.diego.projet.loja.maven.model.bo.Cor;

/**
 *
 * @author Diego
 */
public class CorService {
    public Cor buscarPorId(Long idCor) {
        CorDAO dao = new CorDAO();
        return dao.buscarPorId(idCor);
    }
}
