package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class Company {
  private Map<String,String> employees = new HashMap<>();
  
  public Company() {
    employees.put("a1234", "Harry Hacker");
    employees.put("a1235", "Codie Coder");
    employees.put("a1236", "Polly Programmer");
  }
  
  public Map<String,String> getEmployees() {
    return(employees);
  }

}
