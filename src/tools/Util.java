/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
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
            ((JTextField) componente).setText("");
        }
    }
}
