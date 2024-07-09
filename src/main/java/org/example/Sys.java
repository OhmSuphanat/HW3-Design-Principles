/**6510450976
 *Suphanat Sroyphet
 */
package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Sys {

    public static boolean register(User user) {
        ArrayList<Verificated> verificateds = new ArrayList<>(Arrays.asList(user, user.getEmail()));
        for (Verificated verificated : verificateds) {
            verificated.verify();
        }
        return true;
    }
}
