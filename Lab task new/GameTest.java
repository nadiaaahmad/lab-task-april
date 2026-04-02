public class GameTest {
    public static void main(String[] args) {
        System.out.println("=== GAME CHARECTER SYSTEM ===\n");
  
        GameCharecter char1 = new Warrior("Conan", 10, 100, 45, 8);
        GameCharecter char2 = new Wizard("Merlin", 12, 80, 60, 120);
        GameCharecter char3 = new Archer("Legolas", 8, 85, 25, 30);
        
        GameCharecter[] charecters = {char1, char2, char3};
        
        
        System.out.println("=== BEFORE MODIFICATION ===");
        for (GameCharecter charecter : charecters) {
            System.out.println(charecter.toString());
            System.out.println("Attack Style: " + charecter.getAttackStyle());
            System.out.println("Attack Strength: " + charecter.calculateAttackStrength());
            System.out.println("------------------------");
        }
        
        System.out.println("\n=== APPLYING BUFFS (Loop 1) ===");
        for (int i = 0; i < charecters.length; i++) {
            if (charecters[i] instanceof Warrior) {
                Warrior w = (Warrior) charecters[i];
                w.setRageLevel(w.getRageLevel() + 5);
                System.out.println(w.getName() + "'s rage increased to " + w.getRageLevel());
            }
            else if (charecters[i] instanceof Wizard) {
                Wizard wz = (Wizard) charecters[i];
                wz.setManaPoints(wz.getManaPoints() + 20);
                System.out.println(wz.getName() + "points increased to " + wz.getPoints());
            }
        }
        
   
        System.out.println("\n=== APPLYING SPECIAL BUFFS (Loop 2) ===");
        for (GameCharecter charecter : charecters) {
            if (charecter instanceof Archer && charecter.getHealth() > 50) {
                Archer a = (Archer) charecter;
                a.setArrowsLeft(a.getArrowsLeft() + 15);
                System.out.println(a.getName() + " gained arrows! Now has: " + a.getArrowsLeft());
            }
            else if (charecter instanceof Warrior && charecter.getHealth() > 50) {
                Warrior w = (Warrior) charecter;
                w.setRageLevel(w.getRageLevel() + 3);
                System.out.println(w.getName() + "'s rage boosted! Now: " + w.getRageLevel());
            }
        }
        
       
        System.out.println("\n=== AFTER MODIFICATION ===");
        for (GameCharecter charecter : charecters) {
            System.out.println(charecter.toString());
            System.out.println("Attack Strength: " + charecter.calculateAttackStrength());
            System.out.println("------------------------");
        }
        
    
        System.out.println("\n=== DOWNCASTING DEMONSTRATION ===");
        for (GameCharecter charecter : charecters) {
            if (charecter instanceof Warrior) {
                Warrior warrior = (Warrior) character;
                System.out.println(warrior.getName() + " is a Warrior with rage level: " + warrior.getRageLevel());
            }
            else if (charecter instanceof Wizard) {
                Wizard wizard = (Wizard) charecter;
                System.out.println(wizard.getName() + " is a Wizard with mana: " + wizard.getPoints());
            }
            else if (charecter instanceof Archer) {
                Archer archer = (Archer) charecter;
                System.out.println(archer.getName() + " is an Archer with arrows: " + archer.getArrowsLeft());
            }
        }
      
        System.out.println("\n=== FINAL METHOD DEMONSTRATION ===");
        char1.revive();
    } 
    
} 
