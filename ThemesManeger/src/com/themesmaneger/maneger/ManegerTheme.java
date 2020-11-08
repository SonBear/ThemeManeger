/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themesmaneger.maneger;

import com.themesmaneger.themes.DarkTheme;
import com.themesmaneger.themes.DefaultTheme;
import com.themesmaneger.themes.Theme;
import com.themesmaneger.themes.WhiteTheme;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author emman
 */
public class ManegerTheme {

    public void aplyTheme(String name, Container window) throws ThemeDoesntExistException {
        switch (name) {
            case "DarkTheme":
                aplyTheme(new DarkTheme(), window);
                break;

            case "WhiteTheme":
                aplyTheme(new WhiteTheme(), window);
                break;
            case "DefaultTheme":
                aplyTheme(new DefaultTheme(), window);
                break;
            default:
                throw new ThemeDoesntExistException("The theme doesn't exists");

        }
    }

    private boolean aplyTheme(Theme theme, Container window) {
        List<Component> components = getAllComponents(window);

        for (Component comp : components) {
            System.out.println(comp.getClass());

            if (comp instanceof JPanel) {
                JPanel panel = (JPanel) comp;
                panel.setBackground(theme.COLOR_PANEL_BACKGROUND);
                System.out.println("black");
            } else if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                label.setOpaque(true);
                label.setBackground(theme.COLOR_LABEL_BACKGROUND);
                label.setForeground(theme.COLOR_LABEL_FOREGROUND);
            } else if (comp instanceof Box.Filler) {
                Box.Filler filler = (Box.Filler) comp;
                filler.setOpaque(true);
                filler.setBackground(theme.COLOR_PANEL_BACKGROUND);
            } else if (comp instanceof JTextField) {
                JTextField text = (JTextField) comp;
                text.setOpaque(true);
                text.setBackground(theme.COLOR_TEXTFIELD_BACKGROUND);
                text.setForeground(theme.COLOR_TEXTFIELD_FOREGROUND);
            } else if (comp instanceof JTable) {
                JTable table = (JTable) comp;
                table.setForeground(theme.COLOR_TABLE_FOREGROUND);
                table.setBackground(theme.COLOR_TABLE_BACKGROUND);
            }
        }

        return true;
    }

    private List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<Component>();
        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container) {
                compList.addAll(getAllComponents((Container) comp));
            }
        }
        return compList;
    }

}
