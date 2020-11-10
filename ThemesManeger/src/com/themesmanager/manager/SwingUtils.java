package com.themesmanager.manager;

import com.themesmanager.themes.ColorPalette;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HikingCarrot7
 */
public class SwingUtils {

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

    private static void changeBorder(Border border, JLabel label, ColorPalette palette) {
        if (border instanceof TitledBorder) {
            String tittle = ((TitledBorder) border).getTitle();
            Border bdr = BorderFactory.createLineBorder(palette.getSpecificColor(ColorPalette.ColorKey.COLOR_FOREGROUND), 2, true);
            TitledBorder titledBorder = BorderFactory.createTitledBorder(bdr, tittle);
            titledBorder.setTitleColor(palette.getSpecificColor(ColorPalette.ColorKey.COLOR_FOREGROUND));
            label.setBorder(titledBorder);
        }
    }

    private static void changeBorder(Border border, JTextField textField, ColorPalette palette) {
        if (border instanceof TitledBorder) {
            String tittle = ((TitledBorder) border).getTitle();
            Border bdr = BorderFactory.createLineBorder(palette.getSpecificColor(ColorPalette.ColorKey.COLOR_FOREGROUND), 2, true);
            TitledBorder titledBorder = BorderFactory.createTitledBorder(bdr, tittle);
            titledBorder.setTitleColor(palette.getSpecificColor(ColorPalette.ColorKey.COLOR_FOREGROUND));
            textField.setBorder(titledBorder);
        }
    }
}
