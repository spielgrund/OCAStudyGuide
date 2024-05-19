package Aufgaben_04;

public class OutOfRangeException extends RuntimeException{

        public OutOfRangeException(String message) {
            super(message);
        }


        public OutOfRangeException(String message, Throwable cause) {
            super(message, cause);
        }

}
