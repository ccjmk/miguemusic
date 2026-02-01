package com.data;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "SONGS")
@NoArgsConstructor
public class SongEntity implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    String title;
    int durationSeconds;
}