package edu.dosw.parcial.mapper;

import edu.dosw.parcial.entity.ComputerEntity;
import edu.dosw.parcial.model.ComputerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PeripheralMapper.class})
public interface ComputerMapper {

    @Mapping(source = "computerId", target = "id")
    @Mapping(source = "registeredBy.collaboratorId", target = "registeredById")
    ComputerModel toModel(ComputerEntity entity);

    @Mapping(source = "id", target = "computerId")
    @Mapping(target = "registeredBy", ignore = true)
    @Mapping(target = "peripherals", ignore = true)
    ComputerEntity toEntity(ComputerModel model);
}