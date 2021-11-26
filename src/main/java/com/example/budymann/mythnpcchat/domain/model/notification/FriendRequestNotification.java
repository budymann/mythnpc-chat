package com.example.budymann.mythnpcchat.domain.model.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FriendRequestNotification extends Notification{
    int senderId;
    int recipientId;
}
