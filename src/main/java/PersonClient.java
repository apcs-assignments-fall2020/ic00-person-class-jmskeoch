public class PersonClient {
    public static void main(String[] args) {
        //Create person
        Person me = new Person("Jason", "Skeoch");
        //Check doSomething method
        System.out.println(me.doSomething());
        //Check toString method
        System.out.println(me);
        //Check getters
        System.out.println(me.getFirstName());
        System.out.println(me.getLastName());
        //Check setters
        me.setFirstName("Colby");
        me.setLastName("Milligan");
        System.out.println(me);
    }
}
