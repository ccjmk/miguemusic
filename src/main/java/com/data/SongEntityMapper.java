package com.data;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.domain.Song;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SongEntityMapper extends Converter<Song, SongEntity> {
    @Mapping(target = "durationSeconds", source = "durationInSeconds")
    SongEntity convert(Song source);
}
