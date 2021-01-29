import entities.Customer;
import entities.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static int roomCount = 5;
    public static void main(String[] args) {
        Method m = new Method();
        int choice = 0;
        do {
            try {
                System.out.println("/*---------------------------------------------*/\n1 - Thêm khách\n2 - Trả phòng\n3 - Hiển thị thông tin khách trọ\n4 - Đổi phòng\n5 - Thoát");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        if (roomCount > 0) {
                            System.out.println("Bao nhiêu khách thuê phòng?");
                            int number = Integer.parseInt(sc.nextLine());
                            System.out.println("Khách thuê trong bao nhiêu ngày");
                            int days = Integer.parseInt(sc.nextLine());
                            Room room = m.chooseAvailableRoom();
                            room.setStayTime(days);
                            for (int i = 0; i < number; i++) {
                                Customer c = m.createCustomer();
                                m.add(room, c);
                            }
                            room.setAvailable(false);
                            roomCount--;
                        } else {
                            System.out.println("Hết phòng rồi");
                        }
                        break;
                    case 2:
                        if (roomCount < 5) {
                            Room room = m.chooseUnavailableRoom();
                            m.delete(room);
                            roomCount++;
                        } else {
                            System.out.println("Chưa có ai đặt phòng");
                        }
                        break;
                    case 3:
                        m.print();
                        break;
                    case 4:
                        if (roomCount > 0 && roomCount < 5) {
                            System.out.println("Khách ở phòng nào muốn đổi ");
                            Room fromRoom = m.chooseUnavailableRoom();
                            System.out.println("Khách muốn chuyển sang phòng nào");
                            Room toRoom = m.chooseAvailableRoom();
                            m.doUpdate(fromRoom, toRoom);
                        } else if (roomCount == 0) {
                            System.out.println("Không có phòng trống để chuyển");
                        } else {
                            System.out.println("Chưa có ai đặt phòng.");
                        }
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
