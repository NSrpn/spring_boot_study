package com.nsrpn.spring_boot_study.app.storage;

import com.nsrpn.spring_boot_study.app.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookStorage extends JpaRepository<Book, Long> {
  List<Book> findBookByAuthorsNameContaining(String authorFirstName);

  List<Book> findBookByTitleContaining(String title);

  List<Book> findBookByPriceOldBetween(Integer min, Integer max);

  List<Book> findBookByPriceIs(Integer price);

  @Query("from Book where is_bestseller=true")
  List<Book> getBestsellers();

  @Query(value = " select * from books where discount = (select MAX(discount) from books)", nativeQuery=true)
  List<Book> getBooksWithMaxDiscount();

/*
  private static BookStorage bookStorage;
  private List<Book> allBooks;

  public static BookStorage getInstance() {
    if (bookStorage == null)
      bookStorage = new BookStorage();
    return bookStorage;
  }

  public BookStorage() {
    super(Book.class, );
    rereadBooks();
  }

  public synchronized void rereadBooks() {
    allBooks = getAll();
  }

  @Override
  public List<Book> findAll() {
    return allBooks;
  }

  @Override
  public String getAllQuery() {
    return "select b FROM Book b";
  }

/*
  @Override
  public boolean save(Book obj) {
    boolean res = IStorage.super.save(obj);
    if (res)
      rereadBooks();
    return res;
  }

  @Override
  public boolean remove(List<Book> objs) {
    boolean res = IStorage.super.remove(objs);
    if (res)
      rereadBooks();
    return res;
  }

*/

}
