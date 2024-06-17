package com.peekacode.bean_scope_examples;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//bean_scope_examples.NormalClass@865dd6
//bean_scope_examples.NormalClass@865dd6
//bean_scope_examples.NormalClass@865dd6
//Same instance being called for Normal Class Scope: Singleton
// Reuse Same instance across Spring Container
@Component
class NormalClass {

}

//bean_scope_examples.PrototypeClass@4da4253
//bean_scope_examples.PrototypeClass@3972a855
//bean_scope_examples.PrototypeClass@62e7f11d
//New instance is being called for Prototype Class Scope: Prototype
// New instance everytime you ask for a bean.
//bean_scope_examples.PrototypeClass@4da4253
//bean_scope_examples.PrototypeClass@3972a855
//Other Scopes are which are new instance are -
/*  Request, Session, Application, Websocket - One Object instance per request/session/web app/websocket
* */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApp {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

        }
    }
}
