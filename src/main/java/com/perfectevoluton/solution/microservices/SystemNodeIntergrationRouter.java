package com.perfectevoluton.solution.microservices;

import com.perfectevoluton.solution.data_models.BasicResponse;
import com.perfectevoluton.solution.generictypes.Sector;
import com.perfectevoluton.solution.generictypes.sectortypes.SectorField;
import com.perfectevoluton.solution.generictypes.sectortypes.SectorPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class SystemNodeIntergrationRouter {

    @PostMapping("/api/v1/node/server.do/build/project")
    public BasicResponse buildProjectPOST ()
    {
        // will get the project and build it, using request body;
        return new BasicResponse();
    }

    @GetMapping("/api/v1/node/server.do/build/project")
    public BasicResponse buildProjectGET ()
    {
        // will get the project and build it, using query parameters;

        return new BasicResponse();
    }

    @PostMapping("/api/v1/node/server.do/build/sector")
    public BasicResponse buildSectorPOST ()
    {
        Sector s = new Sector("user");

        // will get the sector and build it, using request body;
        return new BasicResponse(200, "ok", new HashMap<>(){{
            put("sector", s);
        }});
    }

    @GetMapping("/api/v1/node/server.do/build/sector")
    public BasicResponse buildSectorGET ()
    {
        // will get the sector and build it, using query parameters;

        return new BasicResponse();
    }

}
