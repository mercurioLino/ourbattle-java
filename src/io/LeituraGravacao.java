/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import excecoes.ErroDeGravacaoException;
import excecoes.ErroDeLeituraException;

/**
 *
 * @author Luiz Henrick
 */
public interface LeituraGravacao {
   public abstract void gravarDados(Object objeto, String path) throws ErroDeGravacaoException; 
   
   public abstract Object lerDados(String path) throws ErroDeLeituraException, ClassNotFoundException;
}
