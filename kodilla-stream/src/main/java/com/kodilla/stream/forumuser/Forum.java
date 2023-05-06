package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

   public ArrayList<ForumUser> forumUserList = new ArrayList<>();

   public Forum(){
       forumUserList.add(new ForumUser(1,"Dylan",'m', LocalDate.of(1955,5,22),1111));
       forumUserList.add(new ForumUser(2,"Morgan ",'f', LocalDate.of(1990,1,2),123));
       forumUserList.add(new ForumUser(3,"Aimee ",'f', LocalDate.of(1966,7,19),211));
       forumUserList.add(new ForumUser(4,"Giancarlo ",'m', LocalDate.of(1974,12,22),2323));
       forumUserList.add(new ForumUser(5,"Madelynn",'f', LocalDate.of(1999,4,16),3534));
       forumUserList.add(new ForumUser(6,"Ryan",'m', LocalDate.of(1988,6,2),54));
   }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUserList) ;
    }

}
