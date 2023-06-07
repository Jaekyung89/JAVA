package posframe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class cart {
    String name;
    int num;
    int price;

    

	public cart(String name, int num, int price) {
        this.name = name;
        this.num = num;
        this.price = price;
    }
    
    public cart(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public cart() {
    }

    public void print(ArrayList<cart> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + "   " + list.get(i).num + "   " + list.get(i).price);
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
    	int pr = price(name);
        int num = list.get(i).num;
        list.get(i).setNum(num+1);
        list.get(i).setPrice(pr*(num+1));
    }

    public void sub_item(ArrayList<cart> list, int i) {
        int num = list.get(i).num;
        if(num == 1) {
            list.remove(i);
        }
        else list.get(i).setNum(num-1);
    }
    
    public int price(String name) {
        int p = 0;
        
        // Create a database object
        dataBase db = new dataBase();

        // Define the table names
        String[] tableNames = {"beverage", "snack", "bread", "milk", "ice_cream", "meal", "noodle", "quasi_drugs"};

        // Iterate over the tables
        for (String tableName : tableNames) {
            // Use db method to get ResultSet from the current table
            ResultSet rs = db.db(tableName);
            
            try {
                // Iterate over ResultSet
                while(rs.next()) {
                    if(rs.getString("NAME").equals(name)) {
                        p = rs.getInt("PRICE");  // If the names match, set p to the item's price
                        return p;  // Return the price immediately, no need to check other tables
                    }
                }
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        
        return p;
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
    
    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}