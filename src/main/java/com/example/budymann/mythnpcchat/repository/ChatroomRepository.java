package com.example.budymann.mythnpcchat.repository;

import com.example.budymann.mythnpcchat.domain.model.Chatroom;
import com.example.budymann.mythnpcchat.domain.model.DiscreetChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatroomRepository extends JpaRepository<Chatroom, Integer> {
}
