package ru.markush.listnerRealisation;

public class CustomSpringEventPublisher {
    @Component
    public class CustomSpringEventPublisher {
        @Autowired
        private ApplicationEventPublisher applicationEventPublisher;

        public void publishCustomEvent(final String message) {
            System.out.println("publishCustomEvent()");
            CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
            applicationEventPublisher.publishEvent(customSpringEvent);
        }
    }
}