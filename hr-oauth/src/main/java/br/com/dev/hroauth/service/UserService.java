package br.com.dev.hroauth.service;

import br.com.dev.hroauth.entity.User;
import br.com.dev.hroauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;
    private static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public User findByEmail(String email){
        User user = userFeignClient.findById(email).getBody();
        if (user == null){
            LOGGER.error("E-mail Not Found");
            throw new IllegalArgumentException("Email not Found");
        }
        LOGGER.error("E-mail Found: " + email);
        return user;
    }
}