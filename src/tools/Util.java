/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u42165518822
 */
public class Util {
    public static void habilitar(boolean estado, JComponent ... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(estado);
        }
    }
    public static void limpar(JComponent ... componentes){
        for (JComponent componente : componentes) {
            if(componente instanceof JTextField){
                ((JTextField) componente).setText("");
            }
            if(componente instanceof JComboBox){
                ((JComboBox) componente).setSelectedIndex(-1 );
            }
            if(componente instanceof JCheckBox){
                ((JCheckBox) componente).setSelected(false);
            }
        }
    }
    public static void mensagem(String mes) {
        JOptionPane.showMessageDialog(null, mes);
    }
    public static boolean perguntar(String mes) {
        JOptionPane.showConfirmDialog(null,mes, "Perguntar", JOptionPane.YES_NO_OPTION);
        return true;
    }
    public static int strToInt(String str){
        return Integer.valueOf(str);
    }
    
    public static double strToDouble(String str) {
        return Double.valueOf(str);
    }
    public static Date strToDate(String str) {
        SimpleDateFormat dateNascFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateNascFormat.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    public static String doubleToStr(double num) {
        return "";
    }
    public static String dateToStr(Date num) {
        return "";
    }
}
