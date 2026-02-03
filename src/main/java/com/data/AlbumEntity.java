package com.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "ALBUMS")
@NoArgsConstructor
public class AlbumEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    int releaseYear;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    ArtistEntity artist;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    List<SongEntity> songs;
}
