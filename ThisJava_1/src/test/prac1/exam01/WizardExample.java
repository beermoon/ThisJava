package test.prac1.exam01;

public class WizardExample {
    public static void main(String[] args) {

        // Wizard 객체 생성
//        Wizard firstWizard = new Wizard();

        // 객체 생성 시 값 전달
        Wizard firstWizard = new Wizard("마붕이","흑마법사",23);
        Wizard secondWizard = new Wizard("이붕이","빛마법사",52);


        // Wizard 객체의 필드값 읽기

        System.out.println("이름은 ?" + firstWizard.name);
        System.out.println("직업은 ?" + firstWizard.job);
        System.out.println("힘은 ?" + firstWizard.power);

        System.out.println("이름은 ?" + secondWizard.name);
        System.out.println("직업은 ?" + secondWizard.job);
        System.out.println("힘은 ?" + secondWizard.power);


    }



}
