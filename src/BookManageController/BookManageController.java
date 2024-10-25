package BookManageController;

import BookService.BookService;
import BookManageView.BookManageView;

import java.util.Scanner;

public class BookManageController {
    private static BookService bookService = new BookService();
    private static BookManageView view = new BookManageView();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean whileRun = true;

        while (whileRun) {
            view.menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    bookService.addBook();
                    break;
                case 2:
                    bookService.findBook();
                    break;
                case 3:
                    System.out.println("수정 기능 미구현");
                    break;
                case 4:
                    bookService.deleteBook();
                    break;
                case 5:
                    bookService.viewAllBooks();
                    System.out.println();
                    break;
                case 0:
                    whileRun = false;
                    view.message("프로그램을 종료합니다.");
                    break;
            }
        }
    }

}