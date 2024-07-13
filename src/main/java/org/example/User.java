/**6510450976
 *Suphanat Sroyphet
 */
package org.example;



public class User implements Verificated{
    private String name;
    private Email email;
    private int age;

    public User(String name, Email email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    @Override
    public void verify() {
        if (getName() == null || getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
        if ( !getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
        if( getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
