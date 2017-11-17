package RestaurantModule;


import java.io.Serializable;

public class Item implements Serializable {
  private static int nextNumber = 1;
  private String itemName;
  private int itemNumber;
  private String itemCategory;
  private double itemPrice;
  private int finishPosition;

  public Item(int number) {
    this.itemNumber = number;
  }
  
  public Item(String name,String category,double price) {
    this.itemName = name;
    this.itemCategory = category;
    this.itemPrice = price;
    this.itemNumber = nextNumber++;

  }

  public String getName() {
    return itemName;
  }

  public void setName(String name) {
    this.itemName = name;
  }
  
   public String getCategory() {
    return itemCategory;
  }

  public void setCategory(String category) {
    this.itemCategory = category;
  }
  
   public double getPrice() {
    return itemPrice;
  }

  public void setPrice(double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public int getNumber() {
    return itemNumber;
  }

  public void setNumber(int number) {
    this.itemNumber = number;
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public static void setNextNumber(int nextNumber) {
    Item.nextNumber = nextNumber;
  }

  public int getFinishPosition() {
    return finishPosition;
  }

  public void setFinishPosition(int finishPosition) {
    this.finishPosition = finishPosition;
  } 

  @Override
  public int hashCode() {
    int hash = 7;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Item other = (Item) obj;
    if (this.itemNumber != other.itemNumber) {
      return false;
    }
    return true;
  }
  
  
      
  @Override
  public String toString() {
    return String.format("      %-20s %-20s %.2f\n", itemName , itemCategory, itemPrice);
  }
  
  
}