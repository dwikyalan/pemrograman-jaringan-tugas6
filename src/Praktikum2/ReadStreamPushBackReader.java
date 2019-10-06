/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win10
 */
public class ReadStreamPushBackReader {
    public static void main(String[]args) throws FileNotFoundException{
        String filepath = "E:\\Kuliah\\Semester 5\\PerJarkom\\Pertemuan6\\coba.txt";
        File path = new File (filepath);
            PushbackReader reader = new PushbackReader (new InputStreamReader(new FileInputStream(path)));
            char[] words = new char[(int)path.length()];
            try {
                reader.read(words);
                reader.unread(words[2]);
                System.out.println("" + new String(words));
                reader.read(words);
                System.out.println("" + new String(words));

            }catch(IOException ex){
            Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);	
            }
    
}


}