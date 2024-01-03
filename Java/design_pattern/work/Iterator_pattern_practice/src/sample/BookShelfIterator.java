package sample;

import Interface.Iterator;

//本棚をスキャンするクラス
public class BookShelfIterator implements  Iterator {

//	スキャン対象の本棚
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
//		bookShelfのインスタンスを受け取っている
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
