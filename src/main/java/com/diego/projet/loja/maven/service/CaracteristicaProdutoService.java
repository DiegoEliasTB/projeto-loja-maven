/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.projet.loja.maven.service;

import com.diego.projet.loja.maven.model.DAO.CaracteristicaProdutoDAO;
import com.diego.projet.loja.maven.model.bo.CaracteristicaProduto;

/**
 *
 * @author Diego
 */
public class CaracteristicaProdutoService {
    public CaracteristicaProduto buscarPorId(Long idCaracteristicaProduto) {
        CaracteristicaProdutoDAO dao = new CaracteristicaProdutoDAO();
        return dao.buscarPorId(idCaracteristicaProduto);
    }
}
