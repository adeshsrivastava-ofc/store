package com.adeshsrivastava.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {

        System.out.println("=================================");

        if (userRepository.findByEmail(user.getEmail()) != null){
//            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
            System.out.println("Not saving this user: " + user);
            System.out.println("Reason : User with email " + user.getEmail() + " already exists");
        }
        else {
            userRepository.save(user);
            notificationService.send("You registered successfully!", user.getEmail());
        }
    }

}
