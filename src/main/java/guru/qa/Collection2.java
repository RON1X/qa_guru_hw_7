package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class Collection2 {
    private Map<Integer, YouTubeChannel> channels = new HashMap<>();

    protected void searchChannelByName(String name) {
        for (var channel : channels.entrySet()) {
            if (channel.getValue().getName().equals(name)) {
                System.out.println("Канал " + channel.getValue().getName() + " найден под индексом " + channel.getKey());
                break;
            }
        }
        System.out.println("Канал не найден!");
    }

    protected void addChannel(YouTubeChannel channel) {
        channels.put(channels.size(), channel);
        System.out.println("Добавлен канал " + channel.getName());
    }

    protected void deleteChannel(YouTubeChannel channel) {
        channels.entrySet().removeIf(entry -> entry.getValue().equals(channel));
        System.out.println("Удален канал " + channel.getName());
    }

    protected void printAllChannels() {
        System.out.print("Список каналов: ");
        for (var channel : channels.entrySet()) {
            System.out.print(channel.getKey() + " - " + channel.getValue().getName() + "   ");
        }
        System.out.println();
    }
}
