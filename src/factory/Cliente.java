/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Date;

/**
 *
 * @author matheus.almeida
 */
public abstract class Cliente {
    public String nome;
    public String rg;
    public Long cpf;
    public Date dataNascimento;
    
    public void ValidarCpf() {
//        ...
    }
    
    //Outros métodos
}
