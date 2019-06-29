package com.weichuang.annotation;

import com.weichuang.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Component(value = "person")
//@Repository
//@Controller
@Scope("singleton")
public class Person {

    //@Value("lucy")
    private String name;
    //@Value("22")  : 反射的方式，破坏了封装性
    private int no;

    /*@Autowired
    @Qualifier("car1")*/
    @Resource(name = "car2")
    private Car car;

    public String getName() {
        return name;
    }
    @Value("lily") //set方式注入 ， 推荐使用此种方式注入
    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    @Value("10001")
    public void setNo(int no) {
        this.no = no;
    }

  /*  @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", car=" + car +
                '}';
    }
}
