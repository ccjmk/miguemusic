package com.data;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.core.convert.converter.Converter;

import com.domain.Artist;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ArtistEntityMapper extends Converter<Artist, ArtistEntity> {
    ArtistEntity convert(Artist source);
}
