package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Scanner;


public class Assignment3 
{
    public static void main(String[] args) 
    {
        boolean onoroff = true;
        while(onoroff)
        {
            int sum = 0;
            int product = 1;
            System.out.println("String?");
            Scanner scan = new  Scanner(System.in); //System.in is a standard input
            String [] TokensList = scan.nextLine().split(" ");
            System.out.println("Tokens:");
            for(String elms: TokensList)
            {
                //int position = TokensList[elms] =);
                int temp = elms.indexOf("Goodbye");
                if(temp < 0)
                {
                    break;
                }
                else
                {
                    System.out.println(elms);
                }
            }
            for(String elms: TokensList)
            {
                sum += Integer.parseInt(elms);
                product *= Integer.parseInt(elms);
            }
            System.out.println("Sum: "+sum);
            System.out.println("Product: "+product);
        }     
    }
} 