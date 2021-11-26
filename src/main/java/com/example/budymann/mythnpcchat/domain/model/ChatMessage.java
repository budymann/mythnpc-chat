package com.example.budymann.mythnpcchat.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MESSAGE_ID")
    public int MessageId;
    @Column(name="SENDER_ID")
    public int senderId;
    @Column(name="TIMESTAMP")
    public Date timestamp;
    @Column(name="MESSAGE_STATUS")
    public String messageStatus;
}
