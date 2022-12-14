package com.perfectevoluton.solution.generictypes;


import com.perfectevoluton.solution.generictypes.projecttypes.ProjectApplication;

/**
 * @name Project generic type;
 * @author Mike Karypidis;
 * @version 1.0.0
 * @docs - ...
 */
public class Project {

    protected final String name;
    protected final ProjectApplication applications;

    public Project(String name, ProjectApplication applications) {
        this.name = name;
        this.applications = applications;
    }
}
