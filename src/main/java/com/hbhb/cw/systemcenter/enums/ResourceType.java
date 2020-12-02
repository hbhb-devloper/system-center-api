package com.hbhb.cw.systemcenter.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 资源类型
 *
 * @author xiaokang
 * @since 2020-06-22
 */
public enum ResourceType {
    /**
     * 导航栏目录
     */
    NAVIGATION_CONTENT("NC"),
    /**
     * 导航栏菜单
     */
    NAVIGATION_MENU("NM"),
    /**
     * 侧边栏目录
     */
    SIDE_CONTENT("SC"),
    /**
     * 侧边栏菜单
     */
    SIDE_MENU("SM"),
    /**
     * 按钮
     */
    BUTTON("B"),
    ;

    private final String value;

    ResourceType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

    public static List<String> getAll() {
        List<String> values = new ArrayList<>();
        for (ResourceType resourceType : values()) {
            values.add(resourceType.value());
        }
        return values;
    }

    public static Boolean isMenu(String value) {
        return value.equals(NAVIGATION_MENU.value()) || value.equals(SIDE_MENU.value());
    }

    public static Boolean isContent(String value) {
        return value.equals(NAVIGATION_CONTENT.value()) || value.equals(SIDE_CONTENT.value());
    }
}
