package com.example.bookmyshow.models;


import com.example.bookmyshow.models.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    private String userName;
    private String pswd;
    private String pno;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Role> roles;

    @OneToMany(mappedBy = "bookedBy")
    private List<Ticket> tickets;
}
