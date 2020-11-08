/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themesmaneger.themes;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author emman
 */
public class DefaultTheme extends Theme {

    public DefaultTheme() {
        Color defaultColor = UIManager.getColor("Button.background");
        Color defaultColorForeground = UIManager.getColor("TextArea.foreground");
        Color defaultColorBackground = UIManager.getColor("TextArea.background");
        this.setCOLOR_FILLER_BACKGROUND(defaultColor);
        this.setCOLOR_LABEL_BACKGROUND(defaultColor);
        this.setCOLOR_LABEL_FOREGROUND(defaultColorForeground);
        this.setCOLOR_PANEL_BACKGROUND(defaultColor);
        this.setCOLOR_TABLE_BACKGROUND(defaultColorBackground);
        this.setCOLOR_TABLE_FOREGROUND(defaultColorForeground);
        this.setCOLOR_TEXTFIELD_BACKGROUND(defaultColorBackground);
        this.setCOLOR_TEXTFIELD_FOREGROUND(defaultColorForeground);

    }

}
