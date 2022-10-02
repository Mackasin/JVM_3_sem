package com.nki.dzhurynskyi.laboratorywork.lb3.part1;

public class Executor {
    public String modifyString(String s, String t, String text) {

        String[] stringArray = text.split("[,.:; ]+");
        StringBuilder stringB = new StringBuilder();

        for (String i : stringArray) {
          if (i.length() >= s.length()) {
                String substring = i.substring(i.length() - s.length());
                if (substring.contains(s)) {
                    stringB.append(i).append(" ").append(t).append(" ");
                    continue;
                }
            }
          stringB.append(i).append(" ");
        }
        return stringB.toString().trim();

    }
}
