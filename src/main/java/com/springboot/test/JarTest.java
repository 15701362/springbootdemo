package com.springboot.test;

import org.springframework.stereotype.Component;

@Component
public class JarTest {
    public void test(){
        System.out.println("=========this is a jarTest");
    }
    public static void main(String[] args){
        System.out.println("test jar success");
    }
}
