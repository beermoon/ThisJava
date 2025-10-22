package test.prac1.exam05;

public class Character {
    String name;
    String job;
    int level;
    int hp;
    int dmg;


    public Character(String name, String job, int level, int hp, int dmg) {
        this.name = name;
        this.job = job;
        this.level = level;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void attack()
    {
        System.out.println(name + "이 공격합니다");
    }

    public void levelUp()
    {
        level++;
        hp += 10;
        System.out.println(name + "의 레벨이 " + level + "이 되었습니다!");
        System.out.println(name + "의 공격력이 " + dmg + "이 되었습니다!");
    }




}
