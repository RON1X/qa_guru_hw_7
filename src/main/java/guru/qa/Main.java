package guru.qa;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel ixbtGames = new YouTubeChannel("IXBT games", 2388, 260040509, 446000);
        YouTubeChannel letsGo = new YouTubeChannel("Погнали!", 86, 236858553, 863000);
        YouTubeChannel hohSab = new YouTubeChannel("Хохлов Сабатовский", 870, 58862568, 548000);

        Collection1 collection1 = new Collection1();
        collection1.addChannel(ixbtGames);
        collection1.addChannel(letsGo);
        collection1.addChannel(hohSab);
        collection1.printAllChannels();
        collection1.searchChannelByName("IXBT games");
        collection1.deleteChannel(letsGo);
        collection1.printAllChannels();

        System.out.println("\n");

        Collection2 collection2 = new Collection2();
        collection2.addChannel(letsGo);
        collection2.addChannel(hohSab);
        collection2.addChannel(ixbtGames);
        collection2.printAllChannels();
        collection2.searchChannelByName("Погнали!");
        collection2.deleteChannel(hohSab);
        collection2.printAllChannels();

        System.out.println("\n");

        Collection3 collection3 = new Collection3();
        collection3.addChannel(letsGo);
        collection3.addChannel(hohSab);
        collection3.addChannel(ixbtGames);
        collection3.printAllChannels();
        collection3.searchChannel(ixbtGames);
        collection3.deleteChannel(ixbtGames);
        collection3.printAllChannels();

        System.out.println("\n");

        Collection4 collection4 = new Collection4();
        collection4.addChannel(ixbtGames);
        collection4.addChannel(hohSab);
        collection4.printAllChannels();
        collection4.searchChannel(ixbtGames);
        collection4.deleteChannel(hohSab);
        collection4.printAllChannels();

        System.out.println("\n");
    }
}