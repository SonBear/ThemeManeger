/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themesmaneger.themes;

import java.awt.Color;

/**
 *
 * @author emman
 */
public class DarkTheme extends Theme {

    public DarkTheme() {
        this.setCOLOR_PANEL_BACKGROUND(Color.BLACK);
        this.setCOLOR_FILLER_BACKGROUND(Color.BLACK);
        this.setCOLOR_LABEL_FOREGROUND(Color.WHITE);
        this.setCOLOR_LABEL_BACKGROUND(new Color(59, 59, 59));
        this.setCOLOR_TEXTFIELD_BACKGROUND(new Color(99, 99, 99));
        this.setCOLOR_TEXTFIELD_FOREGROUND(Color.WHITE);
        this.setCOLOR_TABLE_BACKGROUND(new Color(34, 34, 34));
        this.setCOLOR_TABLE_FOREGROUND(Color.WHITE);

    }

}
