package club_task.service;


import club_task.model.Club;

import java.util.*;
import java.util.stream.Collectors;

public class ClubService {

    public static Club getOldestClub(List<Club> clubs) {
        return Optional.ofNullable(clubs).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getYear() > 0)
                .min(Comparator.comparingInt(Club::getYear))
                .orElseThrow(IllegalArgumentException::new);
    }

    public static List<Club> getSuperClubs(List<Club> clubs) {
        return Optional.ofNullable(clubs).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(Club::getIsSuper)
                .collect(Collectors.toList());
    }

    public static List<Club> getListOfClubSortedByAgeDescending(List<Club> clubs) {
        return Optional.ofNullable(clubs).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getYear() > 0)
                .sorted(Comparator.comparingInt(Club::getYear))
                .toList();
    }

    public static List<Club> getListOfClubSortedByAgeAscending(List<Club> clubs) {
        return Optional.ofNullable(clubs).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(c -> c.getYear() > 0)
                .sorted(Comparator.comparingInt(Club::getYear).reversed())
                .toList();
    }

}

