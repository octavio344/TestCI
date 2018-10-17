/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoinfo3.Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author octavio
 */
public class lectura {
    public String[] LevantarTxt(String txt) throws FileNotFoundException{
        Scanner f = new Scanner(new File(txt));
        String aux  =f.useDelimiter("\\A").next();
        String []a = aux.split("\n");
        return a;
    }
}
