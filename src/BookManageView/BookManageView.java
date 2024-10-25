package BookManageView;

import BookDTO.BookDTO;

import java.util.ArrayList;


public class BookManageView {
    public void displayBook(BookDTO book) {
        System.out.println(book);
    }

    public void displayAllBooks(ArrayList<BookDTO> books) {
        for (BookDTO book : books) {
            displayBook(book);
        }
    }

    public void message(String message) {
        System.out.println(message);
    }
    public static void menu(){
        System.out.println("===== 도서관리 시스템 =====");
        System.out.println("1. 도서정보 추가");
        System.out.println("2. 도서정보 조회");
        System.out.println("3. 도서정보 수정");
        System.out.println("4. 도서정보 삭제");
        System.out.println("5. 도서리스트 출력");
        System.out.println("0. 프로그램 종료");
        System.out.print("번호를 선택하세요. (0번은 프로그램 종료): ");
    }
}