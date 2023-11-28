package guru.qa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection3 {
    private Set<YouTubeChannel> channels = new HashSet<>();

    protected void searchChannel(YouTubeChannel channel) {
        if (channels.contains(channel)) {
            System.out.println("Канал " + channel.getName() + " найден");
        } else {
            System.out.println("Канал не найден!");
        }
    }

    protected void addChannel(YouTubeChannel channel) {
        channels.add(channel);
        System.out.println("Добавлен канал " + channel.getName());
    }

    protected void deleteChannel(YouTubeChannel channel) {
        channels.remove(channel);
        System.out.println("Удален канал " + channel.getName());
    }

    protected void printAllChannels() {
        System.out.print("Список каналов: ");
        Iterator<YouTubeChannel> i = channels.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().getName() + "   ");
        }
        System.out.println();
    }
}
