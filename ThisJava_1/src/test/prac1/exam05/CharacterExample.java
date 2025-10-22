package test.prac1.exam05;

public class CharacterExample {
    public static void main(String[] args) {
        Character ch1 = new Character("레그사","마법사",1,100,20);
        Character ch2 = new Character("잠방","전사",1,200,40);

        ch1.levelUp();
        ch2.attack();

    }
}
