public class PersonClient {
    public static void main(String[] args) {
        Person me = new Person("Jason", "Skeoch");
        System.out.println(me.doSomething());
        System.out.println(me);
        System.out.println(me.getFirstName());
        System.out.println(me.getLastName());
        me.setFirstName("Colby");
        me.setLastName("Milligan");
        System.out.println(me);
    }
}
