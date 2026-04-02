public class Archer extends GameCharecter{
private int arrowsLeft;
private int points2;
public Archer(String name, int level, int health, int points2, int arrowsLeft){
super(name, level, health);
this.points2 = points2;
this.arrowsLeft = arrowsLeft;}
@Override
public int calculateAttackStrength(){
return points2 *3+(arrowsLeft > 0 ? 10 : 0);}
@Override
public String getAttackStyle(){
return "Collosal Titan = Explosion attack";}
@Override 
public String toString(){
return "Archer: "+ name + " level: " + getLevel() + " health " + getHealth() + " Arrows " + arrowsLeft + "Attack: " + calculateattackStrength();}
public int getArrowsLeft();{
return arrowsLeft;}
public void setArrowsLeft(int arrowsLeft){
this.arrowsLeft = arrowsLeft;}
}