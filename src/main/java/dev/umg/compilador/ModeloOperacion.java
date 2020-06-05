/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.umg.compilador;

import java.util.ArrayList;

/**
 *
 * @author poou
 */
public class ModeloOperacion {
    
    protected String operation;
    protected boolean valitade;
    protected ArrayList<Token> tokens;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isValitade() {
        return valitade;
    }

    public void setValitade(boolean valitade) {
        this.valitade = valitade;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

    public void setTokens(ArrayList<Token> tokens) {
        this.tokens = tokens;
    }
}
