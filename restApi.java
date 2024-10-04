import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class restApi {
	public static int getDiscountedPrice(int barcode) throws ParseException, IOException {
	    URL url = new URL("https://jsonmock.hackerrank.com/api/inventory?barcode="+barcode);

	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");
	            conn.connect();

	            //Getting the response code
	            int responsecode = conn.getResponseCode();

	            if (responsecode != 200) {
	                throw new RuntimeException("HttpResponseCode: " + responsecode);
	            } else {

	                String inline = "";
	                Scanner scanner = new Scanner(url.openStream());

	                //Write all the JSON data into a string using a scanner
	                while (scanner.hasNext()) {
	                    inline += scanner.nextLine();
	                }

	                //Close the scanner
	                scanner.close();

	                //Using the JSON simple library parse the string into a json object
	                JSONParser parse = new JSONParser();
	                JSONObject data_obj = (JSONObject) parse.parse(inline);
	                JSONArray dataArray = (JSONArray) data_obj.get("data");
	                System.out.println(dataArray);
	                JSONObject dataValues = (JSONObject) dataArray.get(0);
	                System.out.println(dataValues.get("price"));
	                 long price = (long)(dataValues.get("price"));
	                 long discount = (long)(dataValues.get("discount"));
	                 float discountedPrice= price - ((((float)discount/100))*price);
	              return (int)discountedPrice;
	            }
	              
	                
	}
 public static void main(String []args) throws ParseException, IOException {
	 int discountedPrice =getDiscountedPrice(74002314);
	 System.out.println(discountedPrice);
	 MultipartFile 
	 
 }
}
