package com.joel;

import com.joel.DemoLexer;
import picocli.CommandLine;

import java.io.StringReader;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Hello world!
 *
 */
@CommandLine.Command(name = "lexer", mixinStandardHelpOptions = true, version = "0.0.1",
description = "Simple lexer that recognizes ID, NUM and EOF")
public class App implements Callable<Integer>
{


    @Override
    public Integer call() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            System.out.print("Por favor ingrese la cadena > ");
            input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            DemoLexer demoLexer = new DemoLexer(new StringReader(input));
            
        }
    }

    public static void main( String[] args )
    {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
