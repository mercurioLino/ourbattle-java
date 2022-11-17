/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import excecoes.ErroDeGravacaoException;

/**
 *
 * @author Luiz Henrick
 */
public class Gravador {
   /*Recebe como parâmetro alguma classe que implementa a interface LeituraGravacao, o objeto que quer gravar e um path que seria
    o nome do arquivo, esté método chama o método gravarDados implementado dentro da classe que implemtenta LeituraGravacao passando
    o objeto e o path para assim fazer a gravaçao de acordo como definido no método.*/
   public static void gravarDados(LeituraGravacao arq, Object objeto, String path) throws ErroDeGravacaoException{
       arq.gravarDados(objeto, path);
   } 
}
