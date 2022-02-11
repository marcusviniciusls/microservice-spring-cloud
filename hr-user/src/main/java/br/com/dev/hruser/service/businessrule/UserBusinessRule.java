package br.com.dev.hruser.service.businessrule;

import br.com.dev.hruser.entity.User;
import br.com.dev.hruser.service.response.UserDto;
import org.modelmapper.ModelMapper;

public class UserBusinessRule {

    private ModelMapper modelMapper;

    public UserBusinessRule() {
        this.modelMapper = new ModelMapper();
    }

    public UserDto convertUserInUserDto(User user){
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }
}
