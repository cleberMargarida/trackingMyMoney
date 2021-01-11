package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.converter;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.dto.UserDto;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.UserRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.repository.UserRepositoryImpl;

import java.util.UUID;

public class UserConverter {
    public User Convert (UserDto dto){

        if (dto == null){
            return null;
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());

        return user;
    }

    public UserDto Convert (User user){

        if (user == null){
            return null;
        }

        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());

        return dto;
    }

    public User ConvertToPersisted (UserDto dto) throws Exception {

        if (dto == null){
            return null;
        }

        UserRepository repository = new UserRepositoryImpl();
        User persisted = repository.GetUser(dto.getUsername());

        if(persisted == null){
            User user = new User();
            user.setUsername(dto.getUsername());
            user.setPassword(dto.getPassword());

            return user;
        }

        persisted.setUsername(persisted.getUsername());
        persisted.setPassword(dto.getPassword());


        return persisted;
    }
}
