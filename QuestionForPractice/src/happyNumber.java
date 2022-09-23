import java.util.Scanner;

public class happyNumber {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
int level=4;
int armour=0;
int health=0;
int damage=0;
int count=0;

for (int i=0;i<level;i++)
{
	System.out.println("input the damage at level"+" "+i);
	damage=sc.nextInt();

	if(i==2)
	{
		health=health+(damage-damage);
		damage=0;
	}
		health= health+damage;

	count=count+damage;
	

}
if(count==health)
{
	health=health+1;
}
if(health<count)
{
	health=count+1;
}
System.out.println(health);
}
}
