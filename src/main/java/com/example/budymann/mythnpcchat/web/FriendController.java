package com.example.budymann.mythnpcchat.web;

import com.example.budymann.mythnpcchat.domain.model.Person;
import com.example.budymann.mythnpcchat.domain.services.PersonService;
import com.example.budymann.mythnpcchat.domain.services.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {
    @Autowired
    SecurityService securityService;

    @Autowired
    PersonService personService;

    @GetMapping("/friend")
    @ResponseBody
    public List<Person> getFriends(){

        Person a = new Person();
        a.setEmail("a@gmail.com");
        a.setStatus("fucked");

        Person b = new Person();
        b.setEmail("b@gmail.com");
        b.setStatus("fked");

        a = personService.register(a);
        b = personService.register(b);

        personService.addFriend(a.getPersonId(),b.getPersonId());
        var auth = securityService.getSecurityContext().getAuthentication();

        return null;
    }

    @PostMapping("/friend")
    public Person addFriend(Person person){
        return null;
    }


    @DeleteMapping("/friend")
    public Person deleteFriend(Person person){
        return null;
    }

    @GetMapping("/friend/invite")
    @ResponseBody
    public List<Person> getFriendInvite(){
        return null;
    }

    @PostMapping("/friend/invite")
    public List<Person> processFriendInviteReply(){
        return null;
    }

}
