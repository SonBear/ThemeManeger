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

        components.forEach(component -> {
            component.setBackground(theme.COLOR_FILLER_BACKGROUND);
            component.setForeground(theme.COLOR_LABEL_FOREGROUND);
        });

        return true;
    }

    private List<Component> getAllComponents(final Container container) {
        Component[] comps = container.getComponents();
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
