package com.yash;
 
import java.util.Arrays;
 
public class MyArray {
 
     private Object[] elementData;
     private int actualSize = 0;
 
     public MyArray() {
           elementData = new Object[1];
     }
     // add element inside array
     public void add(Object obj) {
 
           increaseListSize();
           elementData[actualSize++] = obj;
     }
    
     public Object get(int index) {
           if (index < actualSize) {
                return elementData[index];
           } else {
                throw new ArrayIndexOutOfBoundsException();
           }
     }
     public int size() {
           return actualSize;
     }
     private void increaseListSize() {
           elementData = Arrays.copyOf(elementData, elementData.length + 1);
 
     }
}