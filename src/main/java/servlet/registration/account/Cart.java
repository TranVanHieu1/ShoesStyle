/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet.registration.account;

import java.util.HashMap;

/**
 *
 * @author Dell
 */
public class Cart {
    private String strCartID, strUserID;
    private final HashMap<Shoes, Integer> lstItems = new HashMap<>();

    public String getStrCartID() {
        return strCartID;
    }

    public void setStrCartID(String strCartID) {
        this.strCartID = strCartID;
    }

    public String getStrUserID() {
        return strUserID;
    }

    public void setStrUserID(String strUserID) {
        this.strUserID = strUserID;
    }
    
    public void addItem(Shoes i) {
       lstItems.putIfAbsent(i, 1);
    }
    
    public int getQuantity() {
        int quant = 0;
        for (HashMap.Entry<Shoes, Integer> k : lstItems.entrySet()) {
            quant += k.getValue();
        }
        return quant;
    }
    
    public HashMap<Shoes, Integer> getItemList() {
        return lstItems;
    }
}
