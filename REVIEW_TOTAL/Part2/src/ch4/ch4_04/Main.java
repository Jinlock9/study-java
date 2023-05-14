package ch4.ch4_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class c1 = Class.forName("ch4.ch4_04.Person");

        Person person = (Person) c1.newInstance();

        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        /*
        Class[] parametersTypes = {String.class};
        Constructor cons = c2.getConstructors(parametersTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person) cons.newInstance(initargs);
        System.out.println(kimPerson);
         */
    }
}
