package calculation;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner; 
public class calc
{

public static void main(String[] args) throws NumberFormatException, IOException
{
Scanner sc = new Scanner(System.in);
 sc.useLocale(Locale.ENGLISH); 
 double suma_credit = 0; 
 double stavka_credit = 0; 
 double srok_credit = 0; 

System.out.print("¬ведите сумму кредита(число больше нул€): ");
/////////////////////////////////////////////////////////////////
do {
while(!sc.hasNextDouble()) {

	sc.next();

}
suma_credit=sc.nextDouble();
}while(suma_credit <= 0);

/////////////////////////////////////////////////////////////////
System.out.print("¬ведите ставку кредита(число из интервала от 0 до 1): ");
/////////////////////////////////////////////////////////////////
do {
while(!sc.hasNextDouble()) {

	sc.next();

}
stavka_credit=sc.nextDouble();
}while((stavka_credit <= 0)||(stavka_credit > 1));
///////////////////////////////////////////////////////////////
System.out.print("¬ведите срок кредита(число больше нул€): ");
/////////////////////////////////////////////////////////////////

do {
while(!sc.hasNextDouble()) {

	sc.next();

}
srok_credit=sc.nextDouble();

}while(srok_credit <= 0);
////////////////////////////////////////////////////////////////

calc1 calcu_mounth = new calc1( suma_credit,  stavka_credit,  srok_credit);

System.out.println("≈жемес€чный платеж составл€ет: "+calcu_mounth.mes_plateg );

sc.close(); 
}
}