package com.example.forumsite.model;



//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//To create an enum, use the enum keyword (instead of class/interface) and separate the constants with a comma.
//We use enums when we need a predefined list of values which represent some kind of numeric or textual data.
//We should use enums when a variable (especially a method parameter) can only take one out of a small possible set
//of values.
public enum VoteType {
    UPVOTE(1), DOWNVOTE(-1),
        ;
    VoteType(int direction){

    }
}
