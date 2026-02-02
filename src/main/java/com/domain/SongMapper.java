package com.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.data.SongEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SongMapper extends Converter<SongEntity, Song> {
    @Mapping(target = "durationInSeconds", source = "durationSeconds")
    Song convert(SongEntity source);
}