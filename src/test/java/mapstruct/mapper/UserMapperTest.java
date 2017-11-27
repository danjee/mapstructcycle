package mapstruct.mapper;

import mapstruct.domain.Attribute;
import mapstruct.domain.User;
import mapstruct.dto.UserDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UserMapperTest {


    @Test
    public void test(){
        User user = new User();
        user.setUserId(1l);
        Attribute attribute1 = new Attribute();
        attribute1.setAttributeId(1l);
        attribute1.setUser(user);
        Attribute attribute2 = new Attribute();
        attribute2.setAttributeId(2l);
        attribute2.setUser(user);
        user.setAttributes(Arrays.asList(attribute1, attribute2));

        UserMapper userMapper = UserMapper.MAPPER;
        UserDto userDto = userMapper.entity2dto(user, new NoCycleContext());
        Assert.assertEquals(2, userDto.getAttributes().size());
    }
}
