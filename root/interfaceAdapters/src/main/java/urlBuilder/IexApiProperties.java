package urlBuilder;

import org.springframework.stereotype.Component;

@Component
public class IexApiProperties {
	/*
	 * This class is specific to IEX financial
	 * data. How can I modify this class so that
	 * that I can be changed in the future if
	 * needed?
	 * 
	 * FUNTION: Store properties of a certain
	 * online data source.
	 */
	

	
	/*
	 * Base URL: Use Standard URL https://api.iex.cloud/v1/ or Workspace-branded URL 
	 * https://YOUR_WORKSPACE.iex.cloud/v1/
	 */
	public String getBaseUrl() {

		return "https://api.iex.cloud/v1/";
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
