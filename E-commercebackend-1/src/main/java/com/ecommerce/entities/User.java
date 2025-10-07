package com.ecommerce.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

    private String provider = "LOCAL"; // LOCAL, GOOGLE, GITHUB

    @Column(unique = true, length = 15)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    private Date dob;   // Date of Birth

    public enum Role {
        USER, ADMIN
    }

    // --- Constructors ---
    public User() {}

    public User(String username, String email, String password, Role role, String provider, String phoneNumber, Date dob) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.provider = provider;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    // --- Getters & Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }
}
