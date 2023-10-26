package urlBuilder;

import org.springframework.stereotype.Component;

@Component
public interface UrlBuilder {
    String buildUrl(String symbol);
}

