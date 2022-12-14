package com.perfectevoluton.solution.middlewares;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.HashMap;
import java.util.Map;

@Component
public class Passport implements HandlerInterceptor {


    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler
    ) throws Exception {
        String header = request.getHeader("authorization");
        if(request.getMethod().equals("OPTIONS")) {
            response.setStatus(200);
            return true;
        }
        if(header == null) {
            response.setStatus(402);
            return true;
        };
        try {
            Algorithm algorithm = Algorithm.HMAC256("my-secret");
            DecodedJWT jwt = JWT.require(algorithm).build().verify(header.split(" ")[1]);

            String project_id = jwt.getClaim("project_id").asString();
            String auth = jwt.getClaim("auth").asString();

            HashMap<String, Object> tokendata = new HashMap<>(){{
                put("project_id", project_id);
                put("auth", auth);
            }};

            request.setAttribute("tokendata", tokendata);

        } catch (JWTVerificationException exception){
            System.out.print("\n" + exception.getMessage());
//            response.setStatus(401);
            return true;
        }

        return true;
    }

    /**
     * @doc browser send options request for cors
     * this response should be 200 status and not check the authentication.
     */


}