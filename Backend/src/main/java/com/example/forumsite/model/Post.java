package com.example.forumsite.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;
//@Data generates the getters and setters of our class.
@Data

//@Entity specifies that this is an entity which is mapped to a database.
@Entity

//@Builder is used for using producing complex Builder APIs, or Builder pattern without writing the required boilerplate code.
@Builder

//@AllArgsConstructor and @NoArgsConstructor generates our constructors for our class.
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long postId;

    @NotBlank(message = "Post Name cannot be empty or Null")
    private String postName;

    @Nullable
    @Lob
    //@Lob annotation is used to specify that the currently annotated
    //entity attribute represents a large object type. LOB or Large OBject
    //refers to a variable length datatype for storing large objects.
    private String description;

    private Integer voteCount;

    //Default fetchtype for OneToMany and ManyToMany is LAZY, default for ManyToOne
    //and OneToOne is EAGER.
    //EAGER means we load all the data at once whereas with LAZY we load the data as needed.
    @ManyToOne(fetch = FetchType.LAZY)
    //JoinColumn is used to specify a column for joining an entity association or element collection. This annotation
    //indicates that the enclosing entity is the owner of the relationship and the corresponding table has
    //a foreign key column which references to the table of the non owning side.
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subreddit subreddit;

}
