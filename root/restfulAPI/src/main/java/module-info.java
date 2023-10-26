module restfulAPI {
	exports financialData.iex;
 
	requires transitive interfaceAdapters;
	requires transitive spring.beans;
	requires transitive spring.web;
	requires    spring.core;
	requires    spring.boot.autoconfigure;
	requires    spring.boot;
	requires    spring.context;

  opens financialData.iex to  spring.core;
}