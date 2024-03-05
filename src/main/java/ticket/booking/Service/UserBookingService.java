package ticket.booking.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.Entity.User;
import ticket.booking.Util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;
    private List<User> userList;
    private ObjectMapper obejctMapper = new ObjectMapper();
    private static final String user_path = "src/main/java/ticket/booking/localDB/users.json";

    public UserBookingService(User user1) throws IOException {
        this.user = user1;

        File users = new File(user_path);
        userList = obejctMapper.readValue(users, new TypeReference<List<User>>(){});
    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getUserName().equals(user.getUserName()) && UserServiceUtil.checkPassword(user.getUserPassword(), user1.getUserHashPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

    public void saveUserListToFile() throws IOException{
        File userFile = new File(user_path);
        obejctMapper.writeValue(userFile,userList);
    }

    public void fetchTicket(){
        user.printTicket();
    }

    public Boolean cancelBooking(String tickedID){
        // Complete the logic to cancel ticket from list
        return Boolean.FALSE;
    }
}
