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
public class WhiteTheme extends Theme {

    public WhiteTheme() {
        this.setCOLOR_PANEL_BACKGROUND(Color.WHITE);
        this.setCOLOR_FILLER_BACKGROUND(Color.WHITE);
        this.setCOLOR_LABEL_FOREGROUND(Color.BLACK);
        this.setCOLOR_LABEL_BACKGROUND(new Color(243, 240, 240));
        this.setCOLOR_TEXTFIELD_BACKGROUND(new Color(226, 216, 179));
        this.setCOLOR_TEXTFIELD_FOREGROUND(Color.BLACK);
        this.setCOLOR_TABLE_BACKGROUND(new Color(243, 240, 240));
        this.setCOLOR_TABLE_FOREGROUND(Color.BLACK);
    }

}
