package com.test.data;

import com.test.beans.Data;
import com.test.beans.User;

import java.util.List;

public interface DataService {
    public List<Data> getData(User user);
}
