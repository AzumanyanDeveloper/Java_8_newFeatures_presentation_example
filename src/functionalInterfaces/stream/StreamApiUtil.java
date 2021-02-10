package functionalInterfaces.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiUtil {

    public static List<User> getUserList() {
       return List.of(
                new User("Poxos",Specialty.DEVELOPER,25,500L,List.of(545454,545454)),
                new User("Petros",Specialty.DEVELOPER,30,1000L,List.of(877787,87878787)),
                new User("Martiros",Specialty.ENGINEER,35,1500L,List.of(545454,4445454)),
                new User("Hamo",Specialty.MANAGER,20,2000L,List.of(21212121))
        );
    }

    //Filter by specialty
    public static List<User> filterBySpecialty(List<User> userList,Specialty specialty){
        return userList.stream()
                .filter(user -> user.getSpecialty().equals(specialty))
                .collect(Collectors.toList());
    }



    //Sorted by age
    public static List<User> sortedByAge(List<User> userList){
       return userList.stream()
               .sorted(Comparator.comparing(User::getAge))
               .collect(Collectors.toList());
    }

    //Sorted reversed
    public static List<User> sortedByAgeReversed(List<User> userList){
        return userList.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .collect(Collectors.toList());
    }

    //Min Salary
    public static User getWithMinSalary(List<User> userList){
       return userList.stream()
               .min(Comparator.comparing(User::getSalary)).orElse(null);
    }

    //Max Salary
    public static User getWithMaxSalary(List<User> userList){
        return userList.stream()
                .max(Comparator.comparing(User::getSalary)).orElse(null);
    }

    //All Developers
    public static boolean allDevelopers(List<User> userList){
       return userList.stream()
               .allMatch(user -> user.getSpecialty().equals(Specialty.DEVELOPER));
    }

    //Any Developers
    public static boolean anyDevelopers(List<User> userList){
       return userList.stream()
               .anyMatch(user -> user.getSpecialty().equals(Specialty.DEVELOPER));
    }

    //All user names
    public static List<String> userNamesList(List<User> userList){
        return userList.stream()
                .map(User::getName).collect(Collectors.toList());
    }

    //All Users phoneNumbers
    public static List<Integer> userPhoneNumber(List<User> userList){
      return userList.stream()
                .flatMap(user -> user.getPhoneNumber().stream())
                .collect(Collectors.toList());

    }


}
