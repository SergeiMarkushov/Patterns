package ru.markush.listnerRealisation;

public class CustomSpringEventListener {
    @Component
    public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
        @Override
        public void onApplicationEvent(CustomSpringEvent event) {
            //Кладём спать - для тестов..
            Long seconds = 5000L;
            try {
                Thread.sleep(seconds);
                System.out.println("Received spring custom async event - " + event.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}