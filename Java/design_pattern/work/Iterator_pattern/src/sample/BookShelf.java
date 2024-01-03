package sample;


import Interface.Aggregate;
import Interface.Iterator;

//本棚を表すクラス
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

//	本を取り出す
	public Book getBookAt(int index) {
		return books[index];
	}

//	本を追加する
	public void appendBook(Book book) {
		this.books[last] = book;
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
