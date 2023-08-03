package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//YourBusinessClass
//Dependency1
//Dependency2


@Component
class YourBusinessClass {

//    @Autowired -> Field-based Dependency injection
    private Dependency1 dependency1;

//    @Autowired -> Field-based Dependency injection
    private Dependency2 dependency2;

//    @Autowired -> Spring framework does a default Constructor-based Dependency injection if a Constructor is created:
//    We do not need to add @Autowired on a Constructor as it is done automatically
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired -> Setter-based Dependency injection
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter injection - setDependency1");
        this.dependency1 = dependency1;
    }

//    @Autowired -> Setter-based Dependency injection
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter injection - setDependency2");
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " +dependency2;
    }


}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {


    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));

        }
    }
}
