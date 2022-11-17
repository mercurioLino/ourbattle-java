/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import excecoes.ErroDeGravacaoException;
import excecoes.ErroDeLeituraException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Luiz Henrick
 */
public class LeitorGravadorObj implements LeituraGravacao {
    /*Esté método recebe um Objeto qualquer e uma String path sendo o nome do arquivo, primeiramente é verificado se a pasta
    dados ja existe, caso não existe a mesma é criada, após isso o objeto é gravado dentro da pasta dados no arquivo path*/
    @Override
    public void gravarDados(Object objeto, String path) throws ErroDeGravacaoException {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/" + path));
            out.writeObject(objeto);
        } catch (IOException ex) {
            throw new ErroDeGravacaoException();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new ErroDeGravacaoException();
            }
        }
    }
    
    /*Esté método recebe uma String path sendo o nome do caminho onde está o arquivo para ser lido, primeiramente é verificado se esse
    caminho existe, caso não existir é retornado nulo para o Objeto, caso existe o objeto é lido e retornado.*/
    @Override
    public Object lerDados(String path) throws ErroDeLeituraException, ClassNotFoundException {
        File dados = new File(path);
        if (!dados.exists()) {
            return null;
        }
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(dados));
            Object objeto = in.readObject();
            return objeto;
        } catch (IOException ex) {
            throw new ErroDeLeituraException();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                throw new ErroDeLeituraException();
            }
        }
    }
}

    