package interfaceAdapaters.url;

//@Component
public class StockUrlBuilder implements UrlBuilder {
    private final IexApiProperties apiProperties;

   // @Autowired
    public StockUrlBuilder(IexApiProperties apiProperties) {
        this.apiProperties = apiProperties;
    }

    @Override
    public String buildUrl(String symbol) {
        return apiProperties.getBaseUrl() + "/stock/" + symbol + "/quote?token=" + apiProperties.getKey();
    }
}

