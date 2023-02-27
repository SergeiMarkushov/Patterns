package ru.markush.listnerRealisation;

public class EventController {
    @RestController
    @RequestMapping("/api/v1/listener_test")
    public class EventController {
        @Autowired
        private CustomSpringEventPublisher customEventPublisher;

        @GetMapping
        public String root() {
            System.out.println("Entered into controller.");
            customEventPublisher.publishCustomEvent("publishCustomEvent event is OK");
            System.out.println("Finished.");
            return "!!!!!!!!!!!Hello World!!!!!!!!!!!!!!!!!";
        }


    }
}
