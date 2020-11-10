package com.themesmanager.manager;

import com.themesmanager.themes.ColorPalette;
import com.themesmanager.themes.ColorPalette.ColorKey;
import com.themesmanager.themes.Theme;
import java.awt.Container;
import java.util.Arrays;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author emman
 */
public class ThemeManager {

    public static void applyTheme(String name, Container window) throws ThemeDoesNotExistException {
        Theme themeToApply = Arrays.asList(Theme.values())
                .stream()
                .filter(theme -> theme.toString().equals(name))
                .findAny()
                .orElseThrow(() -> new ThemeDoesNotExistException(name));

        applyTheme(themeToApply, window);
    }

    public static void applyTheme(Theme theme, Container window) {
        applyTheme(theme.getColorPalette(), window);
    }

    public static void applyTheme(ColorPalette colorPalette, Container window) {
        UIManager.put("Panel.background", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_PANEL_BACKGROUND)));
        UIManager.put("Label.foreground", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_LABEL_FOREGROUND)));
        UIManager.put("Button.foreground", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_FOREGROUND)));
        UIManager.put("Button.background", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_BACKGROUND)));
        UIManager.put("TextField.background", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_TEXTFIELD_BACKGROUND)));
        UIManager.put("TextField.foreground", new ColorUIResource(colorPalette.getSpecificColor(ColorKey.COLOR_TEXTFIELD_FOREGROUND)));
        SwingUtilities.updateComponentTreeUI(window);
    }

}
