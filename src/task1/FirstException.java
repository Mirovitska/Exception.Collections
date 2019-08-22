package task1;

class FirstException extends Exception{
        public FirstException (String message) {
            super(message);
            System.out.println("ExceptionOne(String message)");
        }
    }
