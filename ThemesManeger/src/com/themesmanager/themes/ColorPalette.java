package com.themesmanager.themes;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.UIManager;

/**
 *
 * @author HikingCarrot7
 */
public class ColorPalette {

    public static ColorPalette DARK_COLOR_PALETTE = new ColorPalette.ColorPaletteBuilder()
            .addColor(ColorKey.COLOR_FOREGROUND, Color.white)
            .addColor(ColorKey.COLOR_BACKGROUND, Color.black)
            .addColor(ColorKey.COLOR_LABEL_FOREGROUND, Color.white)
            .addColor(ColorKey.COLOR_LABEL_BACKGROUND, new Color(59, 59, 59))
            .addColor(ColorKey.COLOR_TEXTFIELD_FOREGROUND, Color.white)
            .addColor(ColorKey.COLOR_TEXTFIELD_BACKGROUND, new Color(99, 99, 99))
            .addColor(ColorKey.COLOR_TABLE_FOREGROUND, Color.white)
            .addColor(ColorKey.COLOR_TABLE_BACKGROUND, new Color(34, 34, 34))
            .addColor(ColorKey.COLOR_PANEL_BACKGROUND, Color.black)
            .addColor(ColorKey.COLOR_FILLER_BACKGROUND, Color.black)
            .build();

    public static ColorPalette WHITE_COLOR_PALETTE = new ColorPalette.ColorPaletteBuilder()
            .addColor(ColorKey.COLOR_FOREGROUND, Color.black)
            .addColor(ColorKey.COLOR_BACKGROUND, Color.white)
            .addColor(ColorKey.COLOR_LABEL_FOREGROUND, Color.black)
            .addColor(ColorKey.COLOR_LABEL_BACKGROUND, new Color(243, 240, 240))
            .addColor(ColorKey.COLOR_TEXTFIELD_FOREGROUND, Color.black)
            .addColor(ColorKey.COLOR_TEXTFIELD_BACKGROUND, new Color(226, 216, 179))
            .addColor(ColorKey.COLOR_TABLE_FOREGROUND, Color.black)
            .addColor(ColorKey.COLOR_TABLE_BACKGROUND, new Color(243, 240, 240))
            .addColor(ColorKey.COLOR_PANEL_BACKGROUND, Color.white)
            .addColor(ColorKey.COLOR_FILLER_BACKGROUND, Color.white)
            .build();

    public static ColorPalette DEFAULT_COLOR_PALETTE = new ColorPalette.ColorPaletteBuilder()
            .addColor(ColorKey.COLOR_FOREGROUND, UIManager.getColor("TextArea.foreground"))
            .addColor(ColorKey.COLOR_BACKGROUND, UIManager.getColor("TextArea.background"))
            .addColor(ColorKey.COLOR_LABEL_FOREGROUND, UIManager.getColor("TextArea.foreground"))
            .addColor(ColorKey.COLOR_LABEL_BACKGROUND, UIManager.getColor("Button.background"))
            .addColor(ColorKey.COLOR_TEXTFIELD_FOREGROUND, UIManager.getColor("TextArea.foreground"))
            .addColor(ColorKey.COLOR_TEXTFIELD_BACKGROUND, UIManager.getColor("TextArea.background"))
            .addColor(ColorKey.COLOR_TABLE_FOREGROUND, UIManager.getColor("TextArea.foreground"))
            .addColor(ColorKey.COLOR_TABLE_BACKGROUND, UIManager.getColor("TextArea.background"))
            .addColor(ColorKey.COLOR_PANEL_BACKGROUND, UIManager.getColor("Button.background"))
            .addColor(ColorKey.COLOR_FILLER_BACKGROUND, UIManager.getColor("Button.background"))
            .build();

    public static enum ColorKey {
        COLOR_FOREGROUND,
        COLOR_BACKGROUND,
        COLOR_LABEL_FOREGROUND,
        COLOR_LABEL_BACKGROUND,
        COLOR_TEXTFIELD_FOREGROUND,
        COLOR_TEXTFIELD_BACKGROUND,
        COLOR_TABLE_FOREGROUND,
        COLOR_TABLE_BACKGROUND,
        COLOR_PANEL_BACKGROUND,
        COLOR_FILLER_BACKGROUND,
    }

    public static class ColorPaletteBuilder {

        Map<ColorKey, Color> palette;

        public ColorPaletteBuilder() {
            palette = new HashMap<>();
        }

        public ColorPaletteBuilder addColor(ColorKey key, Color color) {
            palette.put(key, color);
            return this;
        }

        public ColorPalette build() {
            return new ColorPalette(palette);
        }

    }

    private final Map<ColorKey, Color> colorCatalog;

    public ColorPalette(Map<ColorKey, Color> colors) {
        this.colorCatalog = colors;
    }

    public Color getSpecificColor(ColorKey key) {
        return colorCatalog.get(key);
    }

    public Map<ColorKey, Color> getColorCatalog() {
        return colorCatalog;
    }

}
