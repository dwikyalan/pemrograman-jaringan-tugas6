/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.PushbackInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author win10
 */
public class ReadStreamPushBackInputStream {
    public static void main(String[]args){
//     PushbackInputStream stream = new PushbackInputStream(System.in);
//                 System.out.print("Masukan karakter apapun: ");
                 try {
                     PushbackInputStream stream = new PushbackInputStream (new FileInputStream("coba.txt"));
                     int read = stream.read();
                     stream.unread(read);
                     int read2 = stream.read();
                     System.out.print("" + (char) read);
                     System.out.print("" + (char) read2);
                 } catch (IOException ex) {
                     Logger.getLogger(ReadStreamPushBackInputStream.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }

  
    
}
