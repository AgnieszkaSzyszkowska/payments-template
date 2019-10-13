package com.javatutorial.payments.user;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody User addUser(@RequestBody final User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{userId}")
    public @ResponseBody User getUser(@PathVariable final Long userId) {
        final Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else throw new IllegalArgumentException();
    }
}
