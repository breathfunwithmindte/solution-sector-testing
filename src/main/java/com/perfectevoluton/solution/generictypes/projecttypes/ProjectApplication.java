package com.perfectevoluton.solution.generictypes.projecttypes;

import com.perfectevoluton.solution.generictypes.projecttypes.ApplicationNavigation;

import java.util.List;

/**
 * @name Project Application generic type;
 * @author Mike Karypidis;
 * @version 1.0.0
 * @docs - ...
 */
public class ProjectApplication {

    /** unique value */
    private final String name;
    /** used on right navigation section */
    private final String icon;

    /**
     * @docs
     * list of navigations for current application
     * user base on role can
     * 1. have access to whole application or not
     * 2. have access to all application navigations or the list should be filtered base on user's role.
     */
    private final List<ApplicationNavigation> applicationNavigation;

    /**
     * @doc
     * this field will contain information to validate if user can access current application.
     */
    private final Object visibilityRule;

    public ProjectApplication(String name, String icon, List<ApplicationNavigation> applicationNavigation, Object visibilityRule) {
        this.name = name;
        this.icon = icon;
        this.applicationNavigation = applicationNavigation;
        this.visibilityRule = visibilityRule;
    }

    public ProjectApplication(String name, List<ApplicationNavigation> applicationNavigation, Object visibilityRule) {
        this.name = name;
        this.icon = "default";
        this.applicationNavigation = applicationNavigation;
        this.visibilityRule = visibilityRule;
    }

}
