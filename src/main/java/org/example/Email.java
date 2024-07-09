/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Email implements Verificated{
    String name;

    public Email(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void verify() {
        if (getName() == null || getName().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }

        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if( !validEmailPattern.matcher(getName()).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }

        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if(notAllowDomains.contains(getName().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }


}
