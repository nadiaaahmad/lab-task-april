public class Warrior extends GameCharecter{
private int rageLevel;
private int weaponDamage;
public Warrior(String name, int level, int health, int weaponDamage, int rageLevel){
super(name, level, health);
this.weaponDamage = weaponDamage;
this.rageLevel = rageLevel;}
@Override
public int calculateAttackStrength(){
return weaponDamage + (rageLevel *5);
}
@Override
public String getAttackStyle(){
return "Attack Titan Style- RUMBLING";}
@Override
public String toString(){
return "Warrior: "+name+ "Level: "+getLevel()+" Health: "+getHealth()+" Rage: "+rageLevel+" Attack: "+calculateAttackStrength();}
public int getRageLevel(){
return rageLevel;}
public void setRageLevel(int rageLevel){
this.rageLevel = rageLevel;}

}