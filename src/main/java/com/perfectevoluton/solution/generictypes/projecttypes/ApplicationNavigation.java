package com.perfectevoluton.solution.generictypes.projecttypes;

import com.perfectevoluton.solution.generictypes.subtypes.UIText;

import java.util.List;

/**
 * @name Project Application generic type;
 * @author Mike Karypidis;
 * @version 1.0.0
 * @docs - ...
 */
public class ApplicationNavigation {

    /** unique value */
    private final String name;
    /** label will be shown on the UI */
    private final List<UIText> label;
    /** unique value */
    private final String path;
    /** unique value */
    private final String visibilityRule;

    public ApplicationNavigation(String name, List<UIText> label, String path, String visibilityRule) {
        this.name = name;
        this.label = label;
        this.path = path;
        this.visibilityRule = visibilityRule;
    }

    public ApplicationNavigation (String name, List<UIText> label) {
        this.name = name;
        this.label = label;
        this.path = "/" + name;
        this.visibilityRule = "only-admin";
    }

    public String getName() {
        return name;
    }

    public List<UIText> getLabel() {
        return label;
    }

    public String getPath() {
        return path;
    }

    public String getVisibilityRule() {
        return visibilityRule;
    }
}
