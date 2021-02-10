package functionalInterfaces.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OldApproachUtil {

    //Filter by specialty
    public static List<User> filterBySpecialty(List<User> userList,Specialty specialty){
        List<User> result = new ArrayList<>();
        for (int i = 0; i <userList.size(); i++){
            if (userList.get(i).getSpecialty().equals(specialty)){
                result.add(userList.get(i));
            }
        }
        return result;
    }

    //Get All Developers
    public static boolean allDevelopers(List<User> userList){
        for (User user : userList) {
            if (!user.getSpecialty().equals(Specialty.DEVELOPER)){
                return false;
            }
        }
        return true;
    }

    //Any Developers
    public static boolean anyDevelopers(List<User> userList){
        for (User user : userList){
            if (user.getSpecialty().equals(Specialty.DEVELOPER)){
                return true;
            }
        }
        return false;
    }

    //All user names
    public static List<String> userNamesList(List<User> userList){
        List<String> names = new ArrayList<>();
        for (User user : userList) {
            if (user != null){
                names.add(user.getName());
            }
        }
        return names;
    }

    // Get All Users Phone Number
    public static List<Integer> allPhoneNumbers(List<User> userList){
        List<Integer> allPhoneNumbers = new ArrayList<>();
        for (User user : userList) {
            if (user != null){
                List<Integer> phoneNumber = user.getPhoneNumber();
                for (Integer number : phoneNumber) {
                    if (number != null){
                        allPhoneNumbers.add(number);
                    }
                }
            }
        }
        return allPhoneNumbers;
    }


}
