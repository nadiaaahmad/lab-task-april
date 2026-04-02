public class Wizard extends GameCharecter{
private int points;
private int spellPower;
public Wizard(String name, int level, int health, int spellPower, int points){
super(name, level, health);
this. points = points;
this.spellPower = spellPower;
}
@Override
public int calculateattackStrength(){
return spellPower + (points/10);}
@Override
public String getAttackstyle(){
return "WarHammor Titan-Hardening ability";}
@Override
public String toString(){
return "Wizard: "+name+" level: "+getLevel()+" health: "+getHealth()+" points: "+points+" attack"+calculateAttackStrength();}
public int getPoints(){
return points;}
public void setPoints(int points){
this.points = points;}
}