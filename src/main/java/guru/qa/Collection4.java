package guru.qa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Collection4 {
    private Queue<YouTubeChannel> channels = new LinkedList<>();

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
        if(i.hasNext()){
            do{
                System.out.print(i.next().getName() + "   ");
            }
            while (i.hasNext());
        }
        System.out.println();
    }
}
