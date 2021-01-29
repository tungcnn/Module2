import entities.Customer;
import entities.Room;

import java.util.ArrayList;

public class Method {
    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(1, "Đơn", 60000));
        rooms.add(new Room(2, "Đôi", 100000));
        rooms.add(new Room(3, "Vip1", 150000));
        rooms.add(new Room(4, "Vip2", 200000));
        rooms.add(new Room(5, "Vip3", 250000));
    }

    public void print() {
        boolean found = false;
        for (Room room : rooms) {
            if (!room.getCustomers().isEmpty()) {
                found = true;
                System.out.println("Phòng " + room.getRoomNumber() + " có " + room.getCustomers().size() + " khách.");
                for (int i = 0; i < room.getCustomers().size(); i++) {
                    System.out.println(room.getCustomers().get(i).toString());
                }
            }
        }
        if (!found) System.out.println("Chưa có khách nào.");
    }

    public  Room chooseAvailableRoom() {
        Room room2 = null;
        System.out.println("Bạn muốn ở phòng mấy");
        for (Room room : rooms) {
            if (room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(Program.sc.nextLine());
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public Room chooseUnavailableRoom() {
        Room room2 = null;
        System.out.println("Khách trả phòng mấy");
        for (Room room : rooms) {
            if (!room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(Program.sc.nextLine());
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public Customer createCustomer() {
        System.out.println("Nhập tên khách hàng");
        String name = Program.sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = Program.sc.nextLine();
        System.out.println("Nhập id");
        int id = Integer.parseInt(Program.sc.nextLine());
        return new Customer(name, date, id);
    }

    public void add(Room room, Customer c) {
        room.getCustomers().add(c);
        System.out.println("Thêm khách " + c.toString() + "\nVào phòng " + room.toString() + " trong " + room.getStayTime() + " ngày.");
    }

    public void delete(Room room) {
        System.out.println("Số tiền phải trả là " + room.calculateFee());
        room.getCustomers().clear();
        System.out.println("Khách ở phòng " + room.getRoomNumber() + " đã trả phòng.");
        room.setAvailable(true);
    }

    public void doUpdate(Room fromRoom, Room toRoom) {
        for (int i = 0; i < fromRoom.getCustomers().size(); i++) {
            toRoom.getCustomers().add(fromRoom.getCustomers().get(i));
        }
        toRoom.setAvailable(false);
        fromRoom.setAvailable(true);
        fromRoom.getCustomers().clear();
        System.out.println("Đã chuyển khách sang phòng mới");
    }
}
