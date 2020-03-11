package com.test.business;

import com.test.beans.Data;
import com.test.beans.User;
import com.test.data.DataService;
import com.test.data.DataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private DataService dataService;

    public BusinessServiceImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }
    public long calculate(User user) {
        DataServiceImpl dataService = new DataServiceImpl();
        long sum = 0;
        for(Data data: dataService.getData(user)) {
            sum += data.getValue();
        }
        return sum;
    }

    public void setDataService(DataServiceImpl dataService) {
        this.dataService = dataService;
    }
}
