package com.praveenvarma;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }
private ArrayList<String> myAL = new ArrayList<String>();

public void addALItem(String item){
    myAL.add(item);
}
public void printAL(){
    System.out.println("AL size is: "+ myAL.size());
    for (int i = 0; i < myAL.size() ; i++) {
        System.out.println(i+1+": "+myAL.get(i));
    }

}
public void modifyALItem(int pos, String newItem){

    myAL.set(pos, newItem);
}
public void removeALItem(int pos){
    String item = myAL.get(pos);
myAL.remove(pos);


}
}
