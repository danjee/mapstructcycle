package mapstruct.mapper;

import mapstruct.domain.Attribute;
import mapstruct.domain.User;
import mapstruct.dto.AttributeDto;
import mapstruct.dto.UserDto;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper( UserMapper.class );

    User dto2entity(UserDto value, @Context NoCycleContext cycleContext);

    UserDto entity2dto(User value, @Context NoCycleContext cycleContext);

    Attribute dto2entity(AttributeDto value, @Context NoCycleContext cycleContext);

    AttributeDto entity2dto(Attribute value, @Context NoCycleContext cycleContext);

}
