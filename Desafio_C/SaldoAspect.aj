import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class SaldoAspect {
    
    @AfterThrowing(pointcut = "execution(* Conta.sacar(..))", throwing = "ex")
    public void logSaldoInsuficiente(RuntimeException ex) {
        System.out.println("ERRO: " + ex.getMessage());
    }
}
