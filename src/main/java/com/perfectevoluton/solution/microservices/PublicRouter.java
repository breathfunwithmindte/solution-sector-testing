package com.perfectevoluton.solution.microservices;

import com.perfectevoluton.solution.data_models.BasicResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicRouter {

    @PostMapping("/api/v1/jwt-auth/login")
    public BasicResponse loginHandler ()
    {
        return new BasicResponse();
    }

    @PostMapping("/api/v1/jwt-auth/register")
    public BasicResponse registerHandler ()
    {
        return new BasicResponse();
    }

}
