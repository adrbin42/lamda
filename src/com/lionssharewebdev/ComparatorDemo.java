package com.lionssharewebdev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.sun.tools.doclint.Entity.lambda;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by gilpratte on 7/26/17.
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("115 Howell Mill Rd", "Atlanta", "GA", "30318"));
        addresses.add(new Address("1050 Covington Hwy", "Macon", "GA", "30018"));
        addresses.add(new Address("1618 Sydenham St", "Philadelphia","PA","19141"));
                addresses.add(new Address("36 Deep Sea Way", "Boca Raton", "FL", "33433"));

        //Feel free to add in more addresses if you would like

        System.out.println("Before sorting");
        print(addresses);

        // !! - Write an anonymous class to sort by state (alphabetically)
        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                return o1.getState().compareTo(o2.getState());
            }
        });

        System.out.println("\nAfter sorting by state");
        print(addresses);

        // !! - Write a lambda to sort by city alphabetically
//        Collections.sort(addresses, /* lambda here */);
        Collections.sort(addresses, (o1, o2) -> o1.getCity().compareTo(o2.getCity()));
        System.out.println("\nAfter sorting by city");
        print(addresses);
    }

    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}