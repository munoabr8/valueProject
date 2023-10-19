package dataAccess;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/*
 * THIS IS NOT A PART OF THE DOMAIN!
 * MOVEME
 */

public class IEXCloud {
	
   private static OkHttpClient client = new OkHttpClient();

	
    public static void main(String[] args) {
   
    	IEXCloud.getAdvancedStats();
          
     }
        
   
        
       public static void getAdvancedStats() {
        	
           String apiKey = "pk_98efb884f0f24f32865f94d044a55250"; // Replace with your IEX Cloud API key

                         //_BASE_URL/VERSION/ENDPOINT?token=TOKEN
             
            String url1 = "https://api.iex.cloud/v1/data/core/";
            //https://myworkspace.iex.cloud/v1/data/MYWORKSPACE/SAMPLE_AAPL_DATASET_M3RCT0SSX/AAPL?token="+apiKey+"&from=2019-02-13&to=2019-02-20";
            String url2 = url1+"advanced_stats/amzn/?token="+apiKey;
            
            Request advanced_stats = new Request.Builder()
                    .url(url2)
                    .get()
                    .build();
            
            try {
                Response response = client.newCall(advanced_stats).execute();
                String responseData = response.body().string();
                System.out.println(responseData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        	
        }
       
       
      public int testMe() {
    	   
    	  return 0;
       }
 
}
