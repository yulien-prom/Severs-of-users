package com.User.Severs.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@Document
public class UserModel {
    @Id
    private String idUser;

 private String nameUser;

 private int yearsOfUser;
}
