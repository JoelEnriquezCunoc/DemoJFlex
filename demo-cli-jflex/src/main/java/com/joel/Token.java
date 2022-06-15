/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joel;

/**
 *
 * @author jsem_
 */
public class Token {
    private TokenConstant tokenType;
    private String lexeme;

    public Token(TokenConstant tokenType, String lexeme) {
        this.tokenType = tokenType;
        this.lexeme = lexeme;
    }

    public TokenConstant getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenConstant tokenType) {
        this.tokenType = tokenType;
    }

    public String getLexeme() {
        return lexeme;
    }

    public void setLexeme(String lexeme) {
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        return "Token{" + "tokenType=" + tokenType + ", lexeme=" + lexeme + '}';
    }
    
    
}
