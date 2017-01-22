package salesTaxWithoutTests;

import com.google.gson.Gson;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

  public static final String FILENAME = "/Users/jkritika/pip/tdd/resources/shoppingCart.json";

  public static void main(String args[]) throws IOException, ParseException {

    Gson gson = new Gson();

    try (Reader reader = new FileReader(FILENAME)) {
      Item[] items = gson.fromJson(reader, Item[].class);

      Receipt receipt = new Receipt(items);
      receipt.printItemisedReceipt();

    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
