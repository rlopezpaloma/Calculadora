package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 2;
        int b = 3;
        Calculadora calculadora = new Calculadora(a,b);
        System.out.println( "El resultado de sumar "+a+" + "+b+" es igual a "+calculadora.suma());
    }
}
