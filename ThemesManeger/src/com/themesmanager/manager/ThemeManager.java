package com.themesmanager.manager;

import com.themesmanager.themes.ColorPalette;
import com.themesmanager.themes.ColorPalette.ColorKey;
import com.themesmanager.themes.Theme;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Component> components = getAllComponents(window);

        components.forEach(comp -> {
            if (comp instanceof JPanel) {
                JPanel panel = (JPanel) comp;
                panel.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_PANEL_BACKGROUND));
            } else if (comp instanceof JLabel) {
                JLabel label = (JLabel) comp;
                label.setOpaque(true);
                label.setForeground(colorPalette.getSpecificColor(ColorKey.COLOR_LABEL_FOREGROUND));
                label.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_LABEL_BACKGROUND));
            } else if (comp instanceof Box.Filler) {
                Box.Filler filler = (Box.Filler) comp;
                filler.setOpaque(true);
                filler.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_FILLER_BACKGROUND));
            } else if (comp instanceof JTextField) {
                JTextField text = (JTextField) comp;
                text.setOpaque(true);
                text.setForeground(colorPalette.getSpecificColor(ColorKey.COLOR_TEXTFIELD_FOREGROUND));
                text.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_TEXTFIELD_BACKGROUND));
            } else if (comp instanceof JTable) {
                JTable table = (JTable) comp;
                table.setForeground(colorPalette.getSpecificColor(ColorKey.COLOR_TABLE_FOREGROUND));
                table.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_TABLE_BACKGROUND));
            }
            comp.setForeground(colorPalette.getSpecificColor(ColorKey.COLOR_FOREGROUND));
            comp.setBackground(colorPalette.getSpecificColor(ColorKey.COLOR_BACKGROUND));
        });

        window.revalidate();
    }

    private static List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<>();

        for (Component comp : comps) {
            compList.add(comp);
            if (comp instanceof Container)
                compList.addAll(getAllComponents((Container) comp));
        }

        return compList;
    }

}
