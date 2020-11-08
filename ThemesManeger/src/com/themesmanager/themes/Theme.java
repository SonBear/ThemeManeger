package com.themesmanager.themes;

/**
 *
 * @author emman
 */
public enum Theme {

    DARK_THEME("Dark Theme", ColorPalette.DARK_COLOR_PALETTE),
    WHITE_THEME("White Theme", ColorPalette.WHITE_COLOR_PALETTE),
    DEFAULT_THEME("Default Theme", ColorPalette.DEFAULT_COLOR_PALETTE);

    private final String name;
    private final ColorPalette colorPalette;

    private Theme(String name, ColorPalette colorPalette) {
        this.name = name;
        this.colorPalette = colorPalette;
    }

    public String getName() {
        return name;
    }

    public ColorPalette getColorPalette() {
        return colorPalette;
    }

    @Override public String toString() {
        return name;
    }

}
