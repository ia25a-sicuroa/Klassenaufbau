package exercise2;

public class Main {
    public static void main(String[] args) {
        //Main Method
        Patient meinPatient = new Patient("1", "Bruno",24);
        Patient sachPatient = new Patient("2", "Ameli",17);

        meinPatient.getAge();
        meinPatient.setAge(44);
        System.out.println(meinPatient);
        System.out.println(sachPatient);

    }
}
