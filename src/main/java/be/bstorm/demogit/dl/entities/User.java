package be.bstorm.demogit.dl.entities;

import jakarta.persistence.*;

@Entity @Table(name = "user_")
public class User {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
