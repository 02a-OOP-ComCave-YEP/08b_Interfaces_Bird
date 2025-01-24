package com.cc.java;

public class Bird implements Flyable,iFeathers{

    @Override
    public String fly() {
      return "I'm fast as fuck boiii";

    }

    @Override
    public String feathers() {
        return "Look at my faboulus feathers";
    }

  
}