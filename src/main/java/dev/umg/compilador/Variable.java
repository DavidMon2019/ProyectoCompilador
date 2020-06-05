/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.umg.compilador;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author poou
 */
public class Variable {
    
    protected String name;
    protected String type;
    protected String valor;
    String[] types = new String[]{"Integer", "Char", "String", "Boolean", "Real", "Int"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
