package assurance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import software.Framework;
import software.Tool;

@PropertySource({"classpath:framework.properties","classpath:tools.properties"})
@Configuration
public class Config {
	
	@Bean
	public static Framework struts(@Value("${struts.friendliness.value}") int friendliness, @Value("${struts.robustness.value}") int robustness) {
		Framework struts = new Framework();
		struts.setRobustness(robustness);
		struts.setFriendliness(friendliness);
		return struts;
	}
	
	@Bean
	public static Framework prosa(@Value("${prosa.friendliness.value}") int friendliness, @Value("${prosa.robustness.value}") int robustness) {
		Framework prosa = new Framework();
		prosa.setRobustness(robustness);
		prosa.setFriendliness(friendliness);
		return prosa;
	}
	
	@Bean
	public static Tool savia(@Value("${savia.robustness.value}") int friendliness, @Value("${savia.lookandfeel.value}") int lookandfeel) {
		Tool savia = new Tool();
		savia.setLookandfeel(lookandfeel);
		savia.setFriendliness(friendliness);
		return savia;
	}
	
	@Bean
	public static Tool alfresco(@Value("${alfresco.robustness.value}") int friendliness, @Value("${alfresco.lookandfeel.value}") int lookandfeel) {
		Tool alfresco = new Tool();
		alfresco.setLookandfeel(lookandfeel);
		alfresco.setFriendliness(friendliness);
		return alfresco;
	}

}
