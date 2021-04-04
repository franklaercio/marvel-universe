package com.marvel.backend.global.insfrastructure;

import com.marvel.backend.global.domain.EntityDefaultResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntityDefaultResponseService {

    public static EntityDefaultResponse insertEntity(List<Object> objects) {
        EntityDefaultResponse entityDefaultResponse = new EntityDefaultResponse();
        entityDefaultResponse.setAvailable(objects.size());
        entityDefaultResponse.setItems(new ArrayList<>());

        if(!objects.isEmpty()) {
            objects.forEach(object -> entityDefaultResponse.getItems().add(object.toString()));
        }

        return entityDefaultResponse;
    }
}
