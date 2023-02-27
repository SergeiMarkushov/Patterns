package ru.markush.listnerRealisation;

public class CustomSpringEvent {
    public class CustomSpringEvent extends ApplicationEvent {
        private String message;

        public CustomSpringEvent(Object source, String message) {
            super(source);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}