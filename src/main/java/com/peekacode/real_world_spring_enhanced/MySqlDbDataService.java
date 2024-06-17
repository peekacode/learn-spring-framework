package com.peekacode.real_world_spring_enhanced;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDbDataService implements DataService {


    @Override
    public int[] retrieveData() {
        return new int[] { 1,2,3,4,5};
    }
}
