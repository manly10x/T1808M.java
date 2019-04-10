package assignment2;

import java.util.ArrayList;

public class PersonModel<T> {
    public ArrayList<T> arrList = new ArrayList<>();

    public void addInfo(T person){
        if (person instanceof Student){
            arrList.add(person);
        }
        else if (person instanceof Employee){
            arrList.add(person);
        }
    }
    public void showInfo(){
        for (T obj: arrList) {
            if (obj instanceof Student){
                System.out.println(obj.toString());
            }else if (obj instanceof Employee){
                System.out.println(obj.toString());
            }
        }
    }

}