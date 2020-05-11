package Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isl.versioning.EmployeeV1;
import com.isl.versioning.EmployeeV2;
import com.isl.versioning.Name;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/rest")
@Api(value = "REST API", description = "REST API")
public class EmployeeVersioningController {
	 @GetMapping("v1/employee")
	  public EmployeeV1 empV1() {
	    return new EmployeeV1("Bob Charlie");
	  }
	  @GetMapping("v2/employee")
	  public EmployeeV2 empV2() {
	    return new EmployeeV2(new Name("Bob", "Charlie"));
	  }
	  @GetMapping(value = "/employee/param", params = "version=1")
	  public EmployeeV1 paramV1() {
	    return new EmployeeV1("Bob Charlie");
	  }
	  @GetMapping(value = "/employee/param", params = "version=2")
	  public EmployeeV2 paramV2() {
	    return new EmployeeV2(new Name("Bob", "Charlie"));
	  }
	  @GetMapping(value = "/employee/header", headers = "X-API-VERSION=1")
	  public EmployeeV1 headerV1() {
	    return new EmployeeV1("Bob Charlie");
	  }
	  @GetMapping(value = "/employee/header", headers = "X-API-VERSION=2")
	  public EmployeeV2 headerV2() {
	    return new EmployeeV2(new Name("Bob", "Charlie"));
	  }
	  @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v1+json")
	  public EmployeeV1 producesV1() {
	    return new EmployeeV1("Bob Charlie");
	  }
	  @GetMapping(value = "/employee/produces", produces = "application/vnd.company.app-v2+json")
	  public EmployeeV2 producesV2() {
	    return new EmployeeV2(new Name("Bob", "Charlie"));
	  }
}
