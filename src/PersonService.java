public class PersonService {
    public void setAgeToEighteen(Person person) {
        person.setAge(18);
        person.child = new Person(null, 30);
    }

    public void changePersonToDani(Person person) {
        person = new Person("Dani", 26);
        Person padme = new Person("Padme", 26);
        Person luck = new Person("Luke", 19);
        padme.child = luck;
        luck.parent = padme;
    }
}
