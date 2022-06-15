package com.joel;
import java.io.*;

%%

%public
%class DemoLexer
%type Token

digit = [0-9]
letter = [a-zA-Z]
whitespace = [ \t\r]
newLine = [\n]

%eofval{
    return new Token(TokenConstant.EOF, null);
%eofval}

%%

{letter}({digit}|{letter})* {return new Token(TokenConstant.ID, yytext());}
{digit}+ {return new Token(TokenConstant.NUM, yytext());}

[^] {throw new IOException("La cadena es ilegal >"+yytext());}

