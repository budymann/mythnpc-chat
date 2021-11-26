package com.example.budymann.mythnpcchat.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="DISCREET_CHAT_MESSAGE")
@Entity
public class DiscreetChatMessage extends ChatMessage{
    @Column(name="RECIPIENT_ID")
    public int recipientId;
}
