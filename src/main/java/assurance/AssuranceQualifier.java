package assurance;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import software.ISoftware;

@Controller("QA")
public class AssuranceQualifier {

	@Autowired
	@Qualifier("struts")
	private ISoftware struts;
	
	@Autowired
	@Qualifier("prosa")
	private ISoftware prosa;
	
	@Autowired
	@Qualifier("savia")
	private ISoftware savia;
	
	@Autowired
	@Qualifier("alfresco")
	private ISoftware alfresco;
	
	private List<ISoftware> software;
	
	@PostConstruct
	private void init() {
		software = Arrays.asList(struts, prosa, savia, alfresco);
	}
	
	public int getQualityAssuranceResult() {
		int total = 0;
		for (ISoftware s: software) {
        	total += s.quanlity();
        }
		return total;
	}
}
