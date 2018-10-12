package com.stackroute.moviecruizer.dbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Document(collection = "model")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @NonNull
    Integer imdbId;
    @NotBlank
    String title;
    String posterUrl;
    BigDecimal rating;
    Integer yearOfRelease;
    String comment;
}
