/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author DRUVA S S
 */
public class OpenPdf {
    public static  void openById(String id){
        try{
            if(new File("E:\\"+id+".pdf").exists()){
             Process p =Runtime
                     .getRuntime()
                     .exec("rund1132 url.dll,FileProtocol E:\\"+id+".pdf");
        }
            else
                JOptionPane.showMessageDialog(null, id);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"File saved");
        }
    }
    
}
