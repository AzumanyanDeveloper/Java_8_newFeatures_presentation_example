package functionalInterfaces.stream;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<User> userList = StreamApiUtil.getUserList();


        //Filter
//        List<User> developers = OldApproachUtil.filterBySpecialty(userList,Specialty.DEVELOPER);
//        List<User> developers = StreamApiUtil.filterBySpecialty(userList,Specialty.DEVELOPER);
//        developers.forEach(System.out::println);

        // ---------------------------------------------------------------------------------------------

        //Sort
//        List<User> sortedUsers = StreamApiUtil.sortedByAge(userList);
//        sortedUsers.forEach(System.out::println);


        // ---------------------------------------------------------------------------------------------


        //Sorted reversed
//        List<User> sortedUsersReversed = StreamApiUtil.sortedByAgeReversed(userList);
//        sortedUsersReversed.forEach(System.out::println);

        // ---------------------------------------------------------------------------------------------

        //Min
//        User withMinSalary = StreamApiUtil.getWithMinSalary(userList);
//        System.out.println(withMinSalary);
//
//        //Max
//        User withMaxSalary = StreamApiUtil.getWithMaxSalary(userList);
//        System.out.println(withMaxSalary);

        // ---------------------------------------------------------------------------------------------



        //All Developers
//        boolean allDevelopers = OldApproachUtil.allDevelopers(userList);
//        boolean allDevelopers = StreamApiUtil.allDevelopers(userList);
//        System.out.println(allDevelopers);


        // ---------------------------------------------------------------------------------------------

        //Any Developers
//        boolean anyDevelopers = OldApproachUtil.anyDevelopers(userList);
//        boolean anyDevelopers = StreamApiUtil.anyDevelopers(userList);
//        System.out.println(anyDevelopers);


        // ---------------------------------------------------------------------------------------------



        // Get All Users names
//        List<String> userNamesList = OldApproachUtil.userNamesList(userList);
//        List<String> userNamesList = StreamApiUtil.userNamesList(userList);
//        System.out.println(userNamesList);


        // ---------------------------------------------------------------------------------------------


        //Get All Users Phone Number
//        List<Integer> allPhoneNumbers = OldApproachUtil.allPhoneNumbers(userList);
//        List<Integer> allPhoneNumbers = StreamApiUtil.userPhoneNumber(userList);
//        System.out.println(allPhoneNumbers);



    }

}
