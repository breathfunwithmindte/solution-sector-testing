package com.perfectevoluton.solution.system_models;

import com.perfectevoluton.solution.generictypes.Sector;
import com.perfectevoluton.solution.generictypes.sectortypes.SectorField;
import com.perfectevoluton.solution.generictypes.sectortypes.SectorPage;

import java.util.ArrayList;
import java.util.List;

public class User extends Sector {


    public User(List<SectorPage> pages, List<SectorField> fields, List<Sector> relative_sectors) {
        /**
         * @doc here will be created default sector for user
         * this will be a system sector can be access only by super-admins;
         */
        super("sys-user", new ArrayList<>(){{
            // pages for sys-user sector;
            // ...

        }}, new ArrayList<>(){{
            // fields for sys-user sector;
            // ...
        }}, new ArrayList<>(){{
            // relative_sectors for sys-user sector;
            // ...
        }});

    }
}
