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
public abstract class Theme {

    public Color COLOR_LABEL_BACKGROUND;
    public Color COLOR_PANEL_BACKGROUND;
    public Color COLOR_LABEL_FOREGROUND;
    public Color COLOR_FILLER_BACKGROUND;
    public Color COLOR_TEXTFIELD_BACKGROUND;
    public Color COLOR_TEXTFIELD_FOREGROUND;
    public Color COLOR_TABLE_BACKGROUND;
    public Color COLOR_TABLE_FOREGROUND;

    protected void setCOLOR_LABEL_BACKGROUND(Color COLOR_LABEL_BACKGROUND) {
        this.COLOR_LABEL_BACKGROUND = COLOR_LABEL_BACKGROUND;
    }

    protected void setCOLOR_PANEL_BACKGROUND(Color COLOR_PANEL_BACKGROUND) {
        this.COLOR_PANEL_BACKGROUND = COLOR_PANEL_BACKGROUND;
    }

    protected void setCOLOR_LABEL_FOREGROUND(Color COLOR_LABEL_FOREGROUND) {
        this.COLOR_LABEL_FOREGROUND = COLOR_LABEL_FOREGROUND;
    }

    protected void setCOLOR_FILLER_BACKGROUND(Color COLOR_FILLER_BACKGROUND) {
        this.COLOR_FILLER_BACKGROUND = COLOR_FILLER_BACKGROUND;
    }

    protected void setCOLOR_TEXTFIELD_BACKGROUND(Color COLOR_TEXTFIELD_BACKGROUND) {
        this.COLOR_TEXTFIELD_BACKGROUND = COLOR_TEXTFIELD_BACKGROUND;
    }

    protected void setCOLOR_TEXTFIELD_FOREGROUND(Color COLOR_TEXTFIELD_FOREGROUND) {
        this.COLOR_TEXTFIELD_FOREGROUND = COLOR_TEXTFIELD_FOREGROUND;
    }

    protected void setCOLOR_TABLE_BACKGROUND(Color COLOR_TABLE_BACKGROUND) {
        this.COLOR_TABLE_BACKGROUND = COLOR_TABLE_BACKGROUND;
    }

    protected void setCOLOR_TABLE_FOREGROUND(Color COLOR_TABLE_FOREGROUND) {
        this.COLOR_TABLE_FOREGROUND = COLOR_TABLE_FOREGROUND;
    }

}
