package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    private List<YouTubeChannel> channels = new ArrayList<>();

    protected void searchChannelByName(String name) {
        for (int i = 0; i < channels.size(); i++) {
            if (channels.get(i).getName().equals(name)) {
                System.out.println("Канал " + channels.get(i).getName() + " найден под индексом " + i);
                break;
            }
        }
        System.out.println("Канал не найден!");
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
        for (YouTubeChannel channel : channels) {
            System.out.print(channel.getName() + "   ");
        }
        System.out.println();
    }
}
