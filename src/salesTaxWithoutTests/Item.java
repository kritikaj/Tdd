package salesTaxWithoutTests;

public class Item {
  private String name;
  private double price;
  private String itemType;
  private boolean isImported;
  private double amountOfSalesTax;
  private double amountOfImportDuty;
  private double finalPrice;

  private static final double BASIC_TAX = 0.10;
  private static final double IMPORT_DUTY = 0.05;

  public Item() {
  }

  public void calculateSalesTax() {
    if (isTaxable(itemType)) {
      amountOfSalesTax = Math.round(price * BASIC_TAX * 100.0) / 100.0;
    }
    if (isImported) {
      amountOfImportDuty = Math.round(price * IMPORT_DUTY * 100.0) / 100.0;
    }
    calculateFinalPrice();
  }

  private boolean isTaxable(String itemType) {
    if (itemType.equals("OTHER")) {
      return true;
    }
    return false;
  }

  private void calculateFinalPrice() {
    finalPrice = amountOfSalesTax + price;
    if (isImported) {
      finalPrice += amountOfImportDuty;
    }
    finalPrice = Math.round(finalPrice * 100.0) / 100.0;
  }

  @Override
  public java.lang.String toString() {
    return "name='" + name + '\'' + "\t\t" +
        ", price=" + price + "\t\t" +
        ", string=" + itemType + "\t\t" +
        ", amountOfSalesTax=" + amountOfSalesTax + "\t\t" +
        ", amountOfImportDuty=" + amountOfImportDuty + "\t\t" +
        ", finalPrice=" + finalPrice + "\t\t" + ", " +
        "Total Tax=" + amountOfSalesTax + amountOfImportDuty + "\t\t";
  }

  public double getFinalPrice() {
    return finalPrice;
  }
}
