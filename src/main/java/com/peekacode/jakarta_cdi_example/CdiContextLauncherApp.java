package com.peekacode.jakarta_cdi_example;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


//@Component
@Named
class BusinessService{

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }


    public DataService getDataService() {
        return dataService;
    }


    //@Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}


//@Component
@Named
class DataService {


}


@Configuration
@ComponentScan
public class CdiContextLauncherApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
