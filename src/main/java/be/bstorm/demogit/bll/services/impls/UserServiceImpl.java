package be.bstorm.demogit.bll.services.impls;

import be.bstorm.demogit.bll.services.UserService;
import be.bstorm.demogit.dal.repositories.UserRepository;
import be.bstorm.demogit.dl.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
        
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
