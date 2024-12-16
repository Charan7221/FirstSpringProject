package com.example.JobApp.model;

import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    private int postId;
    @Setter
    @Getter
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

}
