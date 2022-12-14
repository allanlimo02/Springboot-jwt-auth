package io.cellulant.springsecurity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Collection;

import static jakarta.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name = "user_table")
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToAny(fetch = FetchType.EAGER)
    private Collection<Role> roles;
}
