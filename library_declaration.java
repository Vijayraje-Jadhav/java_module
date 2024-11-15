package librabry_management_system;


/* You are tasked with designing a Library Management System where there are two types of users: Students and Teachers. Both can borrow books, but with different rules. A Student can borrow a maximum of 3 books at a time, while a Teacher can borrow up to 5 books. Implement this system considering that the way books are borrowed should be managed efficiently and flexibly.

Question:

Which OOP concept should you apply to ensure that both Students and Teachers can borrow books while having different borrowing limits, and how would you implement it? */

public class library_declaration {

	
	int book_id;
	String book_name;
	
	public library_declaration() {
		super();
	}

	public library_declaration(int book_id, String book_name) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
	}

	@Override
	public String toString() {
		return " book_id=" + book_id + ", book_name=" + book_name ;
	}
	
}

