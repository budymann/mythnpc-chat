package com.example.budymann.mythnpcchat.domain.model.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageStatusNotification extends Notification{
    public int messageId;
    public String messageStatus;
}
