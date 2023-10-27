package urlBuilder;

import org.springframework.stereotype.Component;

@Component
public class IexApiProperties {

	
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
