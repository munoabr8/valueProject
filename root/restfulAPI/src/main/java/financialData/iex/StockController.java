package financialData.iex;

import urlBuilder.UrlBuilder;

public class StockController {
	
    private final UrlBuilder urlBuilder;

   // @Autowired
    public StockController(UrlBuilder urlBuilder) {
        this.urlBuilder = urlBuilder;
     }

}
