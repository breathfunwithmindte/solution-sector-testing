package com.perfectevoluton.solution.microservices;

import com.perfectevoluton.solution.data_models.BasicResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRouter {

    @GetMapping("/api/v1/jwt-token/authenticated")
    public BasicResponse authenticatedToken ()
    {

        return new BasicResponse();
    }

}
