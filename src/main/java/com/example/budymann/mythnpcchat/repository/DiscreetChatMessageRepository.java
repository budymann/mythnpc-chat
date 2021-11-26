package com.example.budymann.mythnpcchat.repository;

import com.example.budymann.mythnpcchat.domain.model.DiscreetChatMessage;
import com.example.budymann.mythnpcchat.domain.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiscreetChatMessageRepository extends JpaRepository<DiscreetChatMessage, Integer> {
    List<DiscreetChatMessage> findBySenderIdAndRecipientId(int senderId, int recipientId);
}
