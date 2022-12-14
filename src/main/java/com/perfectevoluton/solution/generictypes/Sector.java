package com.perfectevoluton.solution.generictypes;

import com.perfectevoluton.solution.generictypes.sectortypes.SectorField;
import com.perfectevoluton.solution.generictypes.sectortypes.SectorPage;

import java.util.ArrayList;
import java.util.List;

/**
 * @name Sector generic type;
 * @author Mike Karypidis;
 * @version 1.0.0
 * @docs - basically sector belong to application but in most cases it will be used as standalone;
 * for performance we will create a project::applications without sector inside...
 */
public class Sector {

    private final String name;
    private final List<SectorPage> pages;
    private final List<SectorField> fields;
    private final List<Sector> relative_sectors;

    public Sector(String name, List<SectorPage> pages, List<SectorField> fields, List<Sector> relative_sectors) {
        this.name = name;
        this.pages = pages;
        this.fields = fields;
        this.relative_sectors = relative_sectors;
    }

    public Sector(String name) {
        this.name = name;
        this.pages = new ArrayList<>(){{}};
        this.fields = new ArrayList<>(){{}};
        this.relative_sectors = new ArrayList<>(){{}};

    }

    public String getName () { return name; }

    public List<SectorPage> getPages() {
        return pages;
    }

    public List<SectorField> getFields() {
        return fields;
    }

    public List<Sector> getRelative_sectors() {
        return relative_sectors;
    }

    public void addField (SectorField newField) {
        this.fields.add(newField);
    }

    public void addPage (SectorPage newPage) {
        this.pages.add(newPage);
    }

    public void addRelativePage (Sector newSector) {
        this.relative_sectors.add(newSector);
    }

}
