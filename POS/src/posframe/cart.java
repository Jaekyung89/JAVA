package posframe;

import java.util.ArrayList;

public class cart {
    String name;
    int num;

    public cart(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public cart() {
    }

    public void print(ArrayList<cart> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + "   " + list.get(i).num);
        }
        System.out.println("--------------------------------------------------");
    }

    public int search(ArrayList<cart> list, String s_name) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).name.equals(s_name)) {
                return i;
            }
        }
        return -1;
    }

    public void add_item(ArrayList<cart> list, int i) {
        int num = list.get(i).num;
        list.get(i).setNum(num+1);
    }

    public void sub_item(ArrayList<cart> list, int i) {
        int num = list.get(i).num;
        if(num == 1) {
            list.remove(i);
        }
        else list.get(i).setNum(num-1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}