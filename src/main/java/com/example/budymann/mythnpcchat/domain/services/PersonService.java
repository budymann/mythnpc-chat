package com.example.budymann.mythnpcchat.domain.services;

import com.example.budymann.mythnpcchat.domain.model.Person;
import com.example.budymann.mythnpcchat.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person register(Person person){
        return personRepository.save(person);
    }

    public void addFriend(int inviterId, int inviteeId){
        var inviter = personRepository.findById(inviterId).get();
        var invitee = personRepository.findById(inviteeId).get();

        var inviterFriendList = inviter.getFriends();
        var inviteeFriendList = invitee.getFriends();

        inviteeFriendList.add(inviter);
        inviterFriendList.add(invitee);

        personRepository.save(invitee);
        personRepository.save(inviter);
    }

    public void deleteFriend(int deleterId, int deleteeId){
        var deleter = personRepository.findById(deleterId).get();
        var deletee = personRepository.findById(deleteeId).get();

        var deleterFriendList = deleter.getFriends();
        var deleteeFriendList = deletee.getFriends();

        deleterFriendList.remove(deleteeFriendList);
        deleteeFriendList.remove(deleterFriendList);

        personRepository.save(deleter);
        personRepository.save(deletee);
    }

    public Person getPersonInfo(int userId){
        var person = personRepository.findById(userId);
        if(!person.isEmpty()){
            return person.get();
        }

        return null;
    }
}
