package firstapp.com.sport_manage;



public class ProfileCheck {


    public ProfileCheck() {
    }

    public static boolean checkUser(String userName) {

            return (userName.chars().allMatch(Character::isAlphabetic) && userName.length() > 7);



    }

    public static boolean checkPassword(String password) {

          return password.matches("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$");

    }
}
