import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countHeroes = Integer.parseInt(sc.nextLine());
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        for (int i = 1; i <= countHeroes ; i++) {
            String heroInfo = sc.nextLine();
            String[] heroData = heroInfo.split("\\s+");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);

            if(hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            if(mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }
        String command = sc.nextLine();
        while (!command.equals("End")) {


            if(command.contains("CastSpell")) {
                String name = command.split("\\s+-\\s+")[1];
                int neededMP = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String spellName = command.split("\\s+-\\s+")[3];
                int currentMP = heroesMP.get(name);
                if(currentMP >= neededMP) {
                    int mpLeft = currentMP - neededMP;
                    heroesMP.put(name,mpLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",name, spellName,mpLeft);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
                }

                
            } else if (command.contains("TakeDamage")) {
                String heroName = command.split("\\s+-\\s+")[1];
                int damage = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attacker = command.split("\\s+-\\s+")[3];
                int currentHP = heroesHP.get(heroName);
                currentHP -= damage;
                if(currentHP <= 0) {
                    heroesHP.remove(heroName);
                    heroesMP.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n",heroName, attacker);
                } else {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName, damage, attacker,currentHP);
                    heroesHP.put(heroName, currentHP);

                }
                
            } else if (command.contains("Recharge")) {
                String heroName = command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                int currentMP = heroesMP.get(heroName);
                currentMP += amount;
                if(currentMP > 200) {
                    currentMP = 200;
                }
                System.out.printf("%s recharged for %d MP!%n",heroName, currentMP - heroesMP.get(heroName));
                heroesMP.put(heroName, currentMP);
                
            } else if (command.contains("Heal")) {
                String heroName = command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                int currentHP = heroesHP.get(heroName);
                currentHP += amount;
                if(currentHP > 100) {
                    currentHP = 100;
                }
                System.out.printf("%s healed for %d HP!%n",heroName, currentHP - heroesHP.get(heroName));
                heroesHP.put(heroName, currentHP);
            }
            command = sc.nextLine();
        }
        heroesHP.entrySet()
                .forEach(entry -> {
                    String heroName =entry.getKey();
                    System.out.println(heroName);
                    System.out.println(" HP: " + entry.getValue());
                    System.out.println(" MP: " + heroesMP.get(heroName));
                });
    }
}
