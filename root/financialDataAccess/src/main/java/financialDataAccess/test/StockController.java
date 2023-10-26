package financialDataAccess.test;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;

import interfaceAdapaters.url.UrlBuilder;


import org.springframework.http.ResponseEntity;
 
 
@RestController
//@RequestMapping("/api/stocks")
public class StockController {
    private final UrlBuilder urlBuilder;
    //private final RestTemplate restTemplate;

    @Autowired
    public StockController(UrlBuilder urlBuilder){//, RestTemplate restTemplate) {
        this.urlBuilder = urlBuilder;
        //this.restTemplate = restTemplate;
    }

    //@GetMapping("/{symbol}")
    public ResponseEntity<String> getStockInfo(@PathVariable String symbol) {
      //  HttpHeaders headers = new HttpHeaders();
       // headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String url = urlBuilder.buildUrl(symbol);

       // ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        return null;
    }
}
