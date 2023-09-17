package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumPhoto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> index = new ArrayList<>();
        List<Integer> identity = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            index.add(scanner.nextInt());
        }
        
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            identity.add(scanner.nextInt());
        }
        
        List<Integer> result = photoAlbum(index, identity);
        
        for (int photo : result) {
            System.out.println(photo);
        }
        
        scanner.close();
    }

    public static List<Integer> photoAlbum(List<Integer> index, List<Integer> identity) {
        int n = index.size();
        List<Integer> album = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int position = index.get(i);
            int photoId = identity.get(i);

            if (position == album.size()) {
                album.add(photoId);
            } else {
                album.add(position, photoId);
            }
        }

        return album;
    }
}
