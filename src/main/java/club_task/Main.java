package club_task;

import club_task.model.Club;
import club_task.service.ClubService;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.net.URL;

public class Main {


    // https://matluniewski.smallhost.pl/club1.json club2, club3
    // wczytac je jako obiekty i znalezc najstarszy klub  + klasy serwisowe


    public static void main(String[] args) throws IOException, InterruptedException {

        ObjectMapper objectMapper = new ObjectMapper();

        URL url1 = new URL("https://matluniewski.smallhost.pl/club1.json");
        Club club1 = objectMapper.readValue(url1, Club.class);
        System.out.println(club1);

        URL url2 = new URL("https://matluniewski.smallhost.pl/club2.json");
        Club club2 = objectMapper.readValue(url2, Club.class);
        System.out.println(club2);

        URL url3 = new URL("https://matluniewski.smallhost.pl/club3.json");
        Club club3 = objectMapper.readValue(url3, Club.class);
        System.out.println(club3);


        Thread.sleep(1000);

//        System.out.println(club3.getYear());
//        System.out.println(Club.clubExtension);
//
//        System.out.println(ClubService.getOldestClub(Club.clubExtension));
//        System.out.println(ClubService.getSuperClubs(Club.clubExtension));

        System.out.println(ClubService.getListOfClubSortedByAgeDescending(Club.clubExtension));
    }

}

