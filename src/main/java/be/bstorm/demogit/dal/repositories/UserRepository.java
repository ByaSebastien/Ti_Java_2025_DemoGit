package be.bstorm.demogit.dal.repositories;

import be.bstorm.demogit.dl.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
