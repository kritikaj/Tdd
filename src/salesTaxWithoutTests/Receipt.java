package salesTaxWithoutTests;

public class Receipt {
  private Item[] items;
  private double totalBillAmount;

  public Receipt(Item[] items) {
    this.items = items;
    this.totalBillAmount = 0.0;
  }

  public void printItemisedReceipt() {
    for (Item item : items) {
      item.calculateSalesTax();
      System.out.println(item.toString());
    }
    calculateTotalBillAmount();
    System.out.println("\n" + "Total : " + totalBillAmount);
  }

  private void calculateTotalBillAmount() {
    for (Item item : items) {
      totalBillAmount += item.getFinalPrice();
    }
    totalBillAmount = Math.round(totalBillAmount * 100.0) / 100.0;
  }
}
