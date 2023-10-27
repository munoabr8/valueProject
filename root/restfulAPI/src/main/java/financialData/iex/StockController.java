package financialData.iex;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;

 import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import urlBuilder.UrlBuilder;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
    private final UrlBuilder urlBuilder;
    private final RestTemplate restTemplate;

    
    
    @Autowired
    public StockController(UrlBuilder urlBuilder,RestTemplate restTemplate ) {
        this.urlBuilder = urlBuilder;
        this.restTemplate= restTemplate;
     }
    
    
    @GetMapping("/{symbol}")
    public ResponseEntity<String> getStockInfo(@PathVariable String symbol) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String url = urlBuilder.buildUrl(symbol);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        return response;
    }
}


