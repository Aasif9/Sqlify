package com.example.SQL_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    //First part in <> : with whom to connect, what is the data type of primary key


    //Generally in interface : you have to write custom queries, for Eg:
    //@Query(select * from user_info where id="
}
