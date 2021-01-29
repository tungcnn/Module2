import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private String roomType;
    private int price;
    private int stayTime;
    private boolean isAvailable = true;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Room() {
    }

    public Room(int roomNumber, String roomType, int price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int getStayTime() {
        return stayTime;
    }

    public void setStayTime(int stayTime) {
        this.stayTime = stayTime;
    }

    public int calculateFee() {
        return price*stayTime;
    }

    @Override
    public String toString() {
        return "Phòng - " +
                " số phòng: " + roomNumber +
                ", loại phòng: " + roomType +
                ", giá phòng: " + price
                ;
    }
}
