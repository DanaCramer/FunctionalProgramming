package PatternsButFunctional.Iterator;

import FunProgramInDepth.Chaining.Consumer;

public class MyArrayList {

    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements){
        this.elements = elements;
    }

    public void forEach(Consumer action){
        for(int i = 0 ; i < elements.length; i++){
           action.accept(elements[i]);
        }
    }
}
