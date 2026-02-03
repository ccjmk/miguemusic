package com.domain;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.data.AlbumEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = { ArtistMapper.class, SongMapper.class })
public interface AlbumMapper extends Converter<AlbumEntity, Album> {
    Album convert(AlbumEntity source);
}
