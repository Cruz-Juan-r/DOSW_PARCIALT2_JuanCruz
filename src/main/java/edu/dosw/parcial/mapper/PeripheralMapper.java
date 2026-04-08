package edu.dosw.parcial.mapper;

import edu.dosw.parcial.entity.PeripheralEntity;
import edu.dosw.parcial.model.PeripheralModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PeripheralMapper {

    @Mapping(source = "peripheralId", target = "id")
    @Mapping(source = "computer.computerId", target = "computerId")
    @Mapping(source = "registeredBy.collaboratorId", target = "registeredById")
    PeripheralModel toModel(PeripheralEntity entity);

    @Mapping(source = "id", target = "peripheralId")
    @Mapping(target = "computer", ignore = true)
    @Mapping(target = "registeredBy", ignore = true)
    PeripheralEntity toEntity(PeripheralModel model);
}