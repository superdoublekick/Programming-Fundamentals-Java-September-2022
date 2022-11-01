import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n ; i++) {
            String inputLine = sc.nextLine();
            String[] inputSongArr = inputLine.split("_");

            Song song = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            songs.add(song);
        }
        String command = sc.nextLine();
        if(command.equals("all")) {
            for (Song item:songs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item:songs) {
                if(item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
