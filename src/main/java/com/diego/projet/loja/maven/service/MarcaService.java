/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.MarcaDAO;
import com.diego.projet.loja.maven.model.bo.Marca;

/**
 *
 * @author Diego
 */
public class MarcaService {
    public Marca buscarPorId(Long idMarca) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.buscarPorId(idMarca);
    }
}
