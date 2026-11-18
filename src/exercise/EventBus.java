package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class EventBus {
    private final Map<String, List<Consumer<String>>> handlers = new HashMap<>();

    public void subscribe(String event, Consumer<String> handler) {
        handlers.computeIfAbsent(event, k -> new ArrayList<>()).add(handler);
    }

    public void publish(String event, String payload) {
        List<Consumer<String>> eventHandler = handlers.get(event);
        if (eventHandler != null) {
            for (Consumer<String> handler : eventHandler) {
                handler.accept(payload);
            }
        }
    }


}
