class Main{
    static String login="user1234_4";
    static String password="ai123456";//login and confirmPassword должны быть равны
    static String confirmPassword="ai123456";
    public static class WrongLoginException extends Exception {
        //Не правильный логин , ошибка логина
        public WrongLoginException() {
            super("Wrong login");
        }

         public WrongLoginException(String message) {
            super(message);
        }


    }

    public static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
            super("Wrong password");
        }

        public WrongPasswordException(String message) {
            super(message);
        }


    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            // проверяем соответствует ли условию
            if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException();
            }

            if (!password.matches("[A-Za-z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    public  static void main(String[] args){
        if (validate(login, password, confirmPassword)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }



}