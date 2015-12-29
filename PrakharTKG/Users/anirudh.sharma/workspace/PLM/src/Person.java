
public class Person {
	private int id;
	private String name;
	private int haveMaxBook;

	public Person() {
		this(0,"Unknown",2);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHaveMaxBook() {
		return haveMaxBook;
	}
	public void setHaveMaxBook(int haveMaxBook) {
		this.haveMaxBook = haveMaxBook;
	}
	public Person(int id, String name, int haveMaxBook) {
		//super();
		this.id = id;
		this.name = name;
		this.haveMaxBook = haveMaxBook;
	}
	public Person(int id2, String name2) {
		this(id2,name2,2);
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == other.id)
			return true;
		return false;
	}

}
