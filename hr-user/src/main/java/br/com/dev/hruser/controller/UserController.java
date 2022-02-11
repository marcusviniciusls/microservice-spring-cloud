package br.com.dev.hruser.controller;

import br.com.dev.hruser.entity.User;
import br.com.dev.hruser.service.UserService;
import br.com.dev.hruser.service.response.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/search")
    public ResponseEntity<UserDto> findById(@RequestParam String email){
        UserDto userDto = userService.findByEmail(email);
        return ResponseEntity.ok(userDto);
    }
}
