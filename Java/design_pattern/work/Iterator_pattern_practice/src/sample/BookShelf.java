package sample;


import java.util.ArrayList;
import java.util.List;

import Interface.Aggregate;
import Interface.Iterator;

//本棚を表すクラス
public class BookShelf implements Aggregate {

	private List<Book> books;
	private int last;

	public BookShelf() {
		this.books = new ArrayList<Book>();
	}

//	本を取り出す
	public Book getBookAt(int index) {
		return books.get(index);
	}

//	本を追加する
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator iterator() {
//		bookShelfのインスタンスを渡している
		return new BookShelfIterator(this);
	}
}
