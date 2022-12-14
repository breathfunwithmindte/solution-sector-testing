package com.perfectevoluton.solution.generictypes.sectortypes;

public class SectorPage {
    private final String name;
    private final String type; // one of table | form | graphs
    private final String server_script;
    private final String client_script;

    public SectorPage(String name, String type, String server_script, String client_script) {
        this.name = name;
        this.type = type;
        this.server_script = server_script;
        this.client_script = client_script;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getServer_script() {
        return server_script;
    }

    public String getClient_script() {
        return client_script;
    }
}
