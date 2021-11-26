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
@Table(name="GROUP_CHAT_MESSAGE")
@Entity
public class GroupChatMessage extends ChatMessage {
    @Column(name = "CHATROOM_ID")
    public int chatroomId;
}

