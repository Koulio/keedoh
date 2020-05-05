package com.daalitoy.apps.keedoh.ui.util;

import com.google.common.collect.Maps;

import javax.swing.*;
import java.util.Map;

public class IconFactory {

    static Map<String, ImageIcon> iconsMap = Maps.newHashMap();

    public static Icon getIcon(String resourceName) {
        if (iconsMap.containsKey(resourceName)) {
            return (iconsMap.get(resourceName));
        } else {
            ImageIcon icon = new ImageIcon(
                    ClassLoader.getSystemResource("images/" + resourceName));
            iconsMap.put(resourceName, icon);
            return (icon);
        }
    }

}
