package com.example.budymann.mythnpcchat.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Person")
@Getter
@Setter
@Entity
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CHATROOM_ID")
    public int chatroomId;

    @Column(name="CHATROOM_NAME")
    public String chatroomName;

    @ManyToMany(mappedBy = "chatroomParticipated")
    Set<Person> participants = new HashSet<>();
}
