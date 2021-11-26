package com.example.budymann.mythnpcchat.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Person")
@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_ID")
    public int personId;
    @Column(name="EMAIL")
    public String email;
    @Column(name="STATUS")
    public String status;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="UserRel",
            joinColumns={@JoinColumn(name="PersonId")},
            inverseJoinColumns={@JoinColumn(name="ParentId")})
    private Set<Person> friends = new HashSet<Person>();

    @ManyToMany
    @JoinTable(
            name = "PERSON_CHATROOM",
            joinColumns = @JoinColumn(name = "PersonId"),
            inverseJoinColumns = @JoinColumn(name = "ChatroomId"))
    private Set<Chatroom> chatroomParticipated = new HashSet<>();
}
