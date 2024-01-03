package Interface;

//数え上げスキャンを行う
public interface Iterator {
//ループの終了条件で使う
	public abstract boolean hasNext();

//	集合体の要素を１つ返す
	public abstract Object next();
}
