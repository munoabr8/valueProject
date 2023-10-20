module domain {
	exports dataAccess;
	
	//exports domain;
	
	exports dataPrep.loading;
	exports dataPrep.transformation;

	requires java.xml;
	requires okhttp3;
}