package com.domain;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.data.ArtistEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArtistMapper extends Converter<ArtistEntity, Artist> {
    Artist convert(ArtistEntity source);
}
