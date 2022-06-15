/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joel;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 *
 * @author jsem_
 */
public class DemoLexerTest {
    @Test
    public void matchId() throws IOException{
        String testString = "hoal";
        Reader stringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(stringReader);
        Token token = lexer.yylex();
        assertEquals(TokenConstant.ID, token.getTokenType());
        

    }

    @Test
    public void matchNum() throws IOException{
        String testString = "123";
        Reader stringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(stringReader);
        Token token = lexer.yylex();
        assertEquals(TokenConstant.NUM,token.getTokenType());


    }

    @Test
    public void noMatch() throws IOException{

        String testString = "@";
        Exception exception = assertThrows(IOException.class, () -> {
            Reader stringReader = new StringReader(testString);
            DemoLexer lexer = new DemoLexer(stringReader);
            Token token = lexer.yylex();
        });




    }
}
