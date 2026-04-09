package edu.dosw.parcial.mapper;

import edu.dosw.parcial.entity.CollaboratorEntity;
import edu.dosw.parcial.model.CollaboratorModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CollaboratorMapper {

    @Mapping(source = "collaboratorId", target = "id")
    CollaboratorModel toModel(CollaboratorEntity entity);

    @Mapping(source = "id", target = "collaboratorId")
    CollaboratorEntity toEntity(CollaboratorModel model);
}