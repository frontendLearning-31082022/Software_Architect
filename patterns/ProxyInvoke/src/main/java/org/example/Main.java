package org.example;

public class Main {
    public static void main(String[] args) {
        WebPortal logined = new WebPortal(new UserAccount("Vitya", "99"));

        String nameEx= logined.getName("Петр");
        assert nameEx.equals("Петр");
        nameEx=logined.getName("NotEx");
        assert nameEx==null;

        boolean succ= logined.setDescription("Vitya","my description");
        assert succ;
        succ=logined.setDescription("Петр","cant do this");
        assert !succ;
    }
}