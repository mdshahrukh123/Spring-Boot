package com.geekster.restaurantApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private Integer postId;
    private String createDate;
    private String updatedDate;
    private String postdate;

}
