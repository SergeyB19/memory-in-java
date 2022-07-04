public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (sarah.child != null) {
            System.out.println("sarah.child.getName() = " + sarah.child.getName());
        } else {
            System.out.println("No child");
        }
        Person john = new Person("John", 13);
        sarah.child = john;

        personService.setAgeToEighteen(sarah);
        if (sarah.child != null) {
            if (sarah.child.getName() != null) {
                System.out.println("sarah.child.getName().length() = " + sarah.child.getName().length());
            } else {
                System.out.println(0);
            }
        }
        System.out.println("sarah.getAge() = " + sarah.getAge());
        System.out.println("sarah.child.getName() = " + sarah.child.getName());
        System.out.println("john.getName() = " + john.getName());
        john = new Person("Alternative John", 30);
        john = null;
        personService.changePersonToDani(sarah);
        System.out.println("sarah.getAge() = " + sarah.getAge());

    }
}