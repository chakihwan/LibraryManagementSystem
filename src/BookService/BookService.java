package BookService;

import BookDTO.BookDTO;
import BookManageView.BookManageView;
import java.util.ArrayList;
import java.util.Scanner;


public class BookService {
    private ArrayList<BookDTO> bookList = new ArrayList<>();
    private static BookManageView view = new BookManageView();
    Scanner scanner = new Scanner(System.in);

    public BookService() {
        imBookList();
    }
    private void imBookList() {
        bookList.add(new BookDTO( "0001","소년이 온다","한강","창비",13500));
        bookList.add(new BookDTO( "0002","채식주의자","한강","창비",13500));
        bookList.add(new BookDTO( "0003","작별하지 않는다","한강","문학동네",15120));
        bookList.add(new BookDTO( "0004","흰","한강","문학동네",13050));
        bookList.add(new BookDTO( "0005","서랍에 저녁을 넣어 두었다","한강","문학과지성사",10800));
        bookList.add(new BookDTO( "0006","희랍어 시간","한강","문학동네",11700));
        bookList.add(new BookDTO( "0007","디 에센셜: 한강(무선 보급판)","한강","문학동네",15300));
        bookList.add(new BookDTO( "0008","트렌드 코리아","김난도","미래의 창",18000));
        bookList.add(new BookDTO( "0009","넥서스","유발 하라리","김영사",258020));
        bookList.add(new BookDTO( "0010","다시, 역사의 쓸모","최태성","프런트페이지",16200));
    }

    public void addBook() {
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();
        System.out.print("도서명 : ");
        String title = scanner.nextLine();
        System.out.print("저자명 : ");
        String author = scanner.nextLine();
        System.out.print("출판사 : ");
        String publisher = scanner.nextLine();
        System.out.print("가격 : ");
        int price = scanner.nextInt();

        BookDTO newBook = new BookDTO(isbn, title, author, publisher, price);
        bookList.add(newBook);
        view.message("도서정보 추가 성공!");
    }

    public BookDTO findIsbn(String isbn) {
        for (BookDTO book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; //도서가 없을 경우
    }

    public void findBook() {
        System.out.print("찾는 도서 ISBN을 입력하세요 : ");
        String isbn = scanner.nextLine();
        BookDTO book = findIsbn(isbn);
        if (book != null) {
            view.displayBook(book);
        }
        else {
            view.message("입력하신 ISBN에 해당하는 도서가 없습니다.");
        }
    }


    public boolean deleteBook() {
        System.out.print("삭제할 도서의 ISBN을 입력하세요 ");
        String isbn = scanner.nextLine();
        BookDTO book = findIsbn(isbn);
        if (book != null) {
            bookList.remove(book);
            view.message("삭제 성공");
            return true;
        }
        else {
            view.message("해당 도서를 찾을 수 없습니다. \n삭제할 도서의 ISBN을 확인하세요 ");
        }
        return false;
    }
    public ArrayList<BookDTO> viewAllBooks() {
        view.displayAllBooks(bookList);
        return bookList;
    }

}
