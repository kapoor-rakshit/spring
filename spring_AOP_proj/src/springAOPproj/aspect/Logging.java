package springAOPproj.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect                                                                         // notify java class as ASPECT
public class Logging {
	
//1.
//	@Before("execution(public String getName())")                           // run this advice(ASPECT) before execution of method specified for getName() of any object in MainClass()
//	public void loggingAdvice() {
//		System.out.println("ASPECT called and ran...");
//	}
	
	

//2.
//	@Before("execution(public String PACKAGENAME.CLASSNAME.getName())")     // run this RESTRICTED advice(ASPECT) of package/method specified here only and not for object of MainClass() 
//	public void loggingAdvice() {
//		System.out.println("ASPECT called and ran...");
//	}
	
	
//3.	
//	@Before("execution(public * get*())")                    // run this advice(ASPECT) irrespective of return type and METHODname 
//	public void loggingAdvice() {
//		System.out.println("ASPECT called and ran...");
//	}
//	
//	@Before("execution(public * get*())")                    // run this advice(ASPECT) also for same method
//	public void SecondloggingAdvice() {
//		System.out.println("SECOND ASPECT called and ran...");
//	}
	
	
//4.  USE OF POINTCUT for situation 3 above
	
	@Pointcut("execution(public * get*(..))")
	public void get_wale_method() {}
	
	@Before("get_wale_method()")                                    // Specify POINTCUT, instead of complete statement
	public void loggingAdvice() {
		System.out.println("ASPECT called and ran...");
	}
	
	@Before("get_wale_method()")       
	public void SecondloggingAdvice() {
		System.out.println("Second ASPECT called and ran...");
	}
	
}
