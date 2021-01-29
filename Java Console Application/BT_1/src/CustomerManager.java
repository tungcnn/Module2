import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerManager {
    static ArrayList<Room> rooms = new ArrayList<>();
    static int roomCount = 5;

    static {
        rooms.add(new Room(1, "Đơn", 60000));
        rooms.add(new Room(2, "Đôi", 100000));
        rooms.add(new Room(3, "Vip1", 150000));
        rooms.add(new Room(4, "Vip2", 200000));
        rooms.add(new Room(5, "Vip3", 250000));
    }

    static Scanner sc = new Scanner(System.in);

    public static void print() {
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

    public static Room chooseAvailableRoom() {
        System.out.println("Bạn muốn ở phòng mấy");
        for (Room room : rooms) {
            if (room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(sc.nextLine());
        Room room2 = null;
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public static Room chooseUnavailableRoom() {
        System.out.println("Khách trả phòng mấy");
        for (Room room : rooms) {
            if (!room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(sc.nextLine());
        Room room2 = null;
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public static void doAdd() {
        if (roomCount > 0) {
            System.out.println("Bao nhiêu khách thuê phòng?");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("Khách thuê trong bao nhiêu ngày");
            int days = Integer.parseInt(sc.nextLine());
            Room room = chooseAvailableRoom();
            room.setStayTime(days);
            for (int i = 0; i < number; i++) {
                System.out.println("Nhập tên khách hàng");
                String name = sc.nextLine();
                System.out.println("Nhập ngày sinh");
                String date = sc.nextLine();
                System.out.println("Nhập id");
                int id = Integer.parseInt(sc.nextLine());
                Customer c = new Customer(name, date, id);
                room.getCustomers().add(c);
                System.out.println("Thêm khách " + c.toString() + " vào phòng " + room.toString() + " trong " + room.getStayTime() + " ngày.");
            }
            room.setAvailable(false);
            roomCount--;
        } else {
            System.out.println("Hết phòng rồi");
        }

    }

    public static void doDelete() {
        if (roomCount < 5) {
            Room room = chooseUnavailableRoom();
            System.out.println("Số tiền phải trả là " + room.calculateFee());
            room.getCustomers().clear();
            System.out.println("Khách ở phòng " + room.getRoomNumber() + " đã trả phòng.");
            room.setAvailable(true);
            roomCount++;
        } else {
            System.out.println("Chưa có ai đặt phòng");
        }
    }

    public static void doUpdate() {
        if (roomCount > 0 && roomCount < 5) {
            System.out.println("Khách ở phòng nào muốn đổi ");
            Room fromRoom = chooseUnavailableRoom();
            System.out.println("Khách muốn chuyển sang phòng nào");
            Room toRoom = chooseAvailableRoom();
            for (int i = 0; i < fromRoom.getCustomers().size(); i++) {
                toRoom.getCustomers().add(fromRoom.getCustomers().get(i));
            }
            toRoom.setAvailable(false);
            fromRoom.setAvailable(true);
            fromRoom.getCustomers().clear();
            System.out.println("Đã chuyển khách sang phòng mới");
        } else if (roomCount == 0) {
            System.out.println("Không có phòng trống để chuyển");
        } else {
            System.out.println("Chưa có ai đặt phòng.");
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        do {
            try {
                System.out.println("/*---------------------------------------------*/\n1 - Thêm khách\n2 - Trả phòng\n3 - Hiển thị thông tin khách trọ\n4 - Đổi phòng\n5 - Thoát");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        doAdd();
                        break;
                    case 2:
                        doDelete();
                        break;
                    case 3:
                        print();
                        break;
                    case 4:
                        doUpdate();
                        break;
                    case 5:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ");
            } catch (NullPointerException e) {
                System.out.println("Nhập sai số phòng");
            }
        } while (choice != 5);
    }
}
