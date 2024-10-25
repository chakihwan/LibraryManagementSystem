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
            scanner.nextLine(); //

            switch (choice) {
                case 1:
                    bookService.addBook(); //서비스에 도서추가
                    break;
                case 2:
                    bookService.findBook(); //서비스에 도서 조회
                    break;
                case 3:
                    //추후 도서 정보 수정
                    System.out.println("수정 기능 미구현");
                    break;
                case 4:
                    bookService.deleteBook(); //서비스에 도서 삭제
                    break;
                case 5:
                    bookService.viewAllBooks(); //서비스에 모든 도서 조회
                    System.out.println();
                    break;
                case 0:
                    whileRun = false; //프로그램 종료
                    view.message("프로그램을 종료합니다.");
                    break;
            }
        }
    }

}