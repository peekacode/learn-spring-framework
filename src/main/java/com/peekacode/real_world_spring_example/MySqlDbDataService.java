package com.peekacode.real_world_spring_example;

import org.springframework.stereotype.Component;

@Component
public class MySqlDbDataService implements DataService{


    @Override
    public int[] retrieveData() {
        return new int[] { 1,2,3,4,5};
    }
}
