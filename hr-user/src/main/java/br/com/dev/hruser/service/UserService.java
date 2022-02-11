package br.com.dev.hruser.service;

import br.com.dev.hruser.entity.User;
import br.com.dev.hruser.exception.ResourceNotFoundException;
import br.com.dev.hruser.repository.UserRepository;
import br.com.dev.hruser.service.businessrule.UserBusinessRule;
import br.com.dev.hruser.service.response.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto findByEmail(String email){
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isEmpty()){
            throw new ResourceNotFoundException("User Not Found");
        }
        User user = optionalUser.get();
        UserBusinessRule userBusinessRule = new UserBusinessRule();
        UserDto userDto = userBusinessRule.convertUserInUserDto(user);
        return userDto;
    }

}
