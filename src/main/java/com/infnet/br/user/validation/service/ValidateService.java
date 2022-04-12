package com.infnet.br.user.validation.service;

import com.infnet.br.user.validation.dto.UserDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.infnet.br.user.validation.repository.UseDtoEntities.*;
import static com.infnet.br.user.validation.repository.UseDtoEntities.userId1;

@Service
@RequiredArgsConstructor
public class ValidateService {


    //todo config banco
    public UserDto findUser(@NonNull Long id){

        if(id.equals(1L))
            return userId1;
        if(id.equals(2L))
            return userId2;
        if(id.equals(3L))
            return userId3;
        else
            return null;
    }

    public Boolean validateUser(Long id) {
        this.findUser(id);
        //busca em uma black list
        // valida os dados em um banco
        return true;
    }
}
