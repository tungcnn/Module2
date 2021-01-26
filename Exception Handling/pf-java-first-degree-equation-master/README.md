# Fist Degree Equation Programming in Java

## Mục tiêu

Luyện tập sử dụng cấu trúc điều khiển if.

Mô tả
---

`Fist Degree Equation` là khái niệm toán học nói tới phương trình bậc nhất. Chương trình 
này cho phép người dùng nhập các hằng số của phương trình vào để tính ra giá trị của biến
chưa biết.

## Bước 1: Thông báo về form của hàm.

Chương trình cần hỏi giá trị của các hằng số và tính ra giá trị chưa biết. Các "tên" của
một hàm toán học có thể được đặt tùy ý, do đó chương trình cần thông báo cho người dùng 
"tên" của các giá trị mà nó sẽ hỏi và tính toán:

```java
System.out.println("First Degree Equation Computer");
System.out.println("Given a equation as 'a*x + b = c', please enter constants:");
```

Thực thi chương trình và quan sát kết quả.

## Bước 2: Hỏi giá trị của hằng số

Chương trình cần hỏi giá trị các hằng số trước khi tính toán. Ở đây sử dụng thư viện
`Scanner` trong gói `java.util` để đọc giá trị mà người dùng nhập vào console (luồng `in`):

```java
Scanner scanner = new Scanner(System.in);
```

Lưu ý: _sử dụng thư viện `Scanner` trong gói `java.util`, có nghĩa là cần `import` thư
viện `java.util.Scanner` để dòng lệnh trên có thể hoạt động._

Lần lượt chỉ dẫn người dùng và đọc các giá trị mà người dùng cung cấp vào các biến, do 
hằng số của hàm bậc nhất có thể là số nguyên hoặc số thực nên ta sử dụng hàm `nextDouble`:

```java
System.out.print("\ta: ");
double a = scanner.nextDouble();

System.out.print("\tb: ");
double b = scanner.nextDouble();

System.out.print("\tc: ");
double c = scanner.nextDouble();
```

Thực thi chương trình và quan sát kết quả.

## Bước 3: Tìm nghiệm của phương trình khi `a != 0`

Mặc dù việc viết mã tìm nghiệm khi `a == 0` trước là tự nhiên hơn, nhưng việc tìm nghiệm
khi `a != 0` là đơn giản hơn, giúp chương trình sẽ rất nhanh chóng có được một phần chức
năng hoạt động được ngay lập tức:

```java
if (a != 0) {
    double answer = (c - b) / a;
    System.out.printf("Equation pass with x = %f!\n", answer);
}
```

Thực thi chương trình và quan sát kết quả.

## Bước 4: Tìm nghiệm của phương trình khi `a == 0`

```java
if (a != 0) {
    double answer = (c - b) / a;
    System.out.printf("Equation pass with x = %f!\n", answer);
} else if (b == c) {
    System.out.print("Equation pass with any 'x'!");
} else {
    System.out.print("Equation has no root!");
}
```

Thực thi chương trình và quan sát kết quả.
<br />

Mã nguồn Fist Degree Equation Programming in Java được sử dụng để thực hành tại [CodeGym](https://codegym.vn)
