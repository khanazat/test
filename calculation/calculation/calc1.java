package calculation;

public class calc1 
{
private double suma_credit = 0; 
private double stavka_credit = 0; 
private double srok_credit = 0;
public double mes_plateg; 
public double s;
public calc1(double suma_credit, double stavka_credit, double  srok_credit)
{

this.suma_credit = suma_credit;
this.stavka_credit = stavka_credit;
this.srok_credit = srok_credit;
Calculate();
}

private void Calculate() 
{
	s=1;
	for(int i=0;i<srok_credit;i++) {
		s=s*(stavka_credit/12+1);
	}
	mes_plateg = suma_credit*(stavka_credit*s/12)/(s-1);

}
}