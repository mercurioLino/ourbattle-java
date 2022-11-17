/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import excecoes.ErroDeLeituraException;

/**
 *
 * @author Luiz Henrick
 */
public class Carregador {
    /*Recebe como parâmetro alguma classe que implementa a interface LeituraGravacao e um path que seria o caminho do arquivo, 
    esté método chama o método lerDados implementado dentro da classe que implemtenta LeituraGravacao passando
    o path para assim fazer a leitura de acordo como definido no método.*/
    public static Object carregarDados(LeituraGravacao arq, String path) throws ErroDeLeituraException, ClassNotFoundException {
        return arq.lerDados(path);
    }

}
