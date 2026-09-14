package com.learning.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("علی");
        names.add("سارا");
        names.add("رضا");

        // استفاده از Iterator استاندارد جاوا
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // حذف امن عناصر در حین پیمایش
            if (name.equals("سارا")) {
                iterator.remove();
            }
        }

        System.out.println("لیست نهایی: " + names);
    }
}
