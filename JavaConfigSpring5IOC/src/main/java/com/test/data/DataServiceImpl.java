package com.test.data;

import com.test.beans.Data;
import com.test.beans.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DataServiceImpl implements DataService{
    public List<Data> getData(User user) {
        return Arrays.asList(new Data(10), new Data(40));
    }
}
