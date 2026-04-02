public abstract class GameCharecter{
protected String name;
private int level;
private int health;
public GameCharecter(String name, int level, int health){
this.name = name;
this.level = level;
this.health = health;}
public abstract int calculateAttackStrength();
public abstract String getAttackStyle();
public void displayStatus(){
System.out.println(name + "Level: "+level+" Health: "+health);}
public void takeDamage(int damage){
this.health -= damage;
System.out.println(name + "took "+damage + "remaining health: "+health);}
public final void revive(){
System.out.println(name + "cannot be revived");}
public String getName(){
return name;}
public int getLevel(){
return level;}
public int getHealth(){
return health;}
public void setHealth(int health){
this.health = health;}
}
