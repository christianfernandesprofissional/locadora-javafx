/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atendimentolocalhost.exceptions;

import java.sql.SQLException;

/**
 * Classe de exceção destinada a todos os problemas relacionados a validações
 * na camada de acesso a dados (Classes DAO).
 * 
 * @author Fabio
 */
public class DBException extends Exception {
    
    public DBException(String mensagem){
        super(mensagem);
    }
}
