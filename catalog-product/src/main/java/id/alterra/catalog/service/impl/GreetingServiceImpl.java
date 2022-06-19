package id.alterra.catalog.service.impl;

import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import id.alterra.catalog.config.ApplicationProperties;
import id.alterra.catalog.config.CloudProperties;
import id.alterra.catalog.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
	Logger log = LoggerFactory.getLogger(GreetingServiceImpl.class);


//	@Value("${welcome.text}")
//	private String welcomeText;
//	
//	@Value("${timezone}")
//	private String timezone;
//	
//	@Value("${currency}")
//	private String currency;
	
//	@Autowired
	private ApplicationProperties appProperties;
	private CloudProperties cloudProperties;
	
	
	
	public GreetingServiceImpl(ApplicationProperties appProperties, CloudProperties cloudProperties) {
		super();
		this.appProperties = appProperties;
		this.cloudProperties = cloudProperties;
	}


	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
//		log.trace("this is log TRACE");
//		log.debug("this is log DEBUG");
//		log.info("this is log INFO");
//		log.warn("this is log WARN");
//		log.error("this is log ERROR");
		TimeZone timezon = TimeZone.getTimeZone(appProperties.getTimezone());
		return appProperties.getWelcomeText()+ " timezone now is "+ timezon.getDisplayName() + " and currency "+ appProperties.getCurrency()+
				" "+ cloudProperties.getApiKey();
	}

}
