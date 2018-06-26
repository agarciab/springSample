package assurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	@Autowired
	@Qualifier("QA")
	private AssuranceQualifier qa;
	
    @RequestMapping("/")
    public String index() {
        return "QA:" + qa.getQualityAssuranceResult();
    }
    
}
