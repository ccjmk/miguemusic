package com.data;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.domain.Album;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {ArtistEntityMapper.class, SongEntityMapper.class})
public interface AlbumEntityMapper extends Converter<Album, AlbumEntity> {
    AlbumEntity convert(Album source);
}
