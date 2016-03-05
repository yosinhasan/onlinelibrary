package onlinelibrary.objects;

/**
 * Book.
 * 
 * @author elpai
 *
 */
public class Book {
	/**
	 * Author.
	 */
	private Author author;
	/**
	 * Genre.
	 */
	private Genre genre;
	/**
	 * Publisher.
	 */
	private Publisher publisher;
	/**
	 * Name.
	 */
	private String name;
	/**
	 * Content.
	 */
	private byte[] content;
	/**
	 * Page count.
	 */
	private Integer pageCount;
	/**
	 * ISBN.
	 */
	private String isbn;
	/**
	 * Published date.
	 */
	private Integer publishYear;
	/**
	 * Image.
	 */
	private byte[] image;
	/**
	 * Description.
	 */
	private String descr;
	/**
	 * Rate.
	 */
	private Integer rating;
	/**
	 * Vote count.
	 */
	private Long voteCount;

	/**
	 * Constructor.
	 */
	public Book() {
	}

	/**
	 * Constructor with params.
	 * 
	 * @param author
	 *            author
	 * @param genre
	 *            genre
	 * @param publisher
	 *            publisher
	 * @param name
	 *            name
	 * @param content
	 *            content
	 * @param pageCount
	 *            page count
	 * @param isbn
	 *            isbn
	 * @param publishYear
	 *            publish year
	 * @param image
	 *            image
	 * @param descr
	 *            description
	 * @param rating
	 *            rating
	 * @param voteCount
	 *            vote count
	 */
	public Book(final Author author, final Genre genre, final Publisher publisher, final String name,
			final byte[] content, final Integer pageCount, final String isbn, final Integer publishYear,
			final byte[] image, final String descr, final Integer rating, final Long voteCount) {
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.name = name;
		this.content = content;
		this.pageCount = pageCount;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.image = image;
		this.descr = descr;
		this.rating = rating;
		this.voteCount = voteCount;
	}

	/**
	 * Get author.
	 * 
	 * @return Author
	 */
	public final Author getAuthor() {
		return this.author;
	}

	/**
	 * Set author.
	 * 
	 * @param author
	 */
	public final void setAuthor(final Author author) {
		this.author = author;
	}

	/**
	 * Get genre.
	 * 
	 * @return Genre
	 */
	public final Genre getGenre() {
		return this.genre;
	}

	/**
	 * Set genre.
	 * 
	 * @param genre
	 */
	public final void setGenre(final Genre genre) {
		this.genre = genre;
	}

	/**
	 * Get publisher.
	 * 
	 * @return Publisher
	 */
	public final Publisher getPublisher() {
		return this.publisher;
	}

	/**
	 * Set publisher.
	 * 
	 * @param publisher
	 *            publisher
	 */
	public final void setPublisher(final Publisher publisher) {
		this.publisher = publisher;
	}

	/**
	 * Get name.
	 * 
	 * @return String
	 */
	public final String getName() {
		return this.name;
	}

	/**
	 * Set name.
	 * 
	 * @param name
	 *            name
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get content.
	 * 
	 * @return byte[]
	 */
	public final byte[] getContent() {
		return this.content;
	}

	/**
	 * Set content.
	 * 
	 * @param content
	 *            content
	 */
	public final void setContent(final byte[] content) {
		this.content = content;
	}

	/**
	 * Get page count.
	 * 
	 * @return Integer
	 */
	public final Integer getPageCount() {
		return this.pageCount;
	}

	/**
	 * Set page count.
	 * 
	 * @param pageCount
	 *            page count
	 */
	public final void setPageCount(final Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * Get ISBN.
	 * 
	 * @return String
	 */
	public final String getIsbn() {
		return this.isbn;
	}

	/**
	 * Set ISBN.
	 * 
	 * @param isbn
	 *            isbn
	 */
	public final void setIsbn(final String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Get publisher year.
	 * 
	 * @return Integer
	 */
	public final Integer getPublishYear() {
		return this.publishYear;
	}

	/**
	 * Set publisher year.
	 * 
	 * @param publishYear
	 *            publisher year
	 */
	public final void setPublishYear(final Integer publishYear) {
		this.publishYear = publishYear;
	}

	/**
	 * Get image.
	 * 
	 * @return byte[]
	 */
	public final byte[] getImage() {
		return this.image;
	}

	/**
	 * Set image.
	 * 
	 * @param image
	 *            image
	 */
	public final void setImage(final byte[] image) {
		this.image = image;
	}

	/**
	 * Get description
	 * 
	 * @return String
	 */
	public final String getDescr() {
		return this.descr;
	}

	/**
	 * Set description
	 * 
	 * @param descr
	 *            description
	 */
	public final void setDescr(final String descr) {
		this.descr = descr;
	}

	/**
	 * Get rating.
	 * 
	 * @return Integer
	 */
	public final Integer getRating() {
		return this.rating;
	}

	/**
	 * Set rating.
	 * 
	 * @param rating
	 *            rating
	 */
	public final void setRating(final Integer rating) {
		this.rating = rating;
	}

	/**
	 * Get vote count.
	 * 
	 * @return Long
	 */
	public final Long getVoteCount() {
		return this.voteCount;
	}

	/**
	 * Set vote count.
	 * 
	 * @param voteCount
	 *            vote count
	 */
	public final void setVoteCount(final Long voteCount) {
		this.voteCount = voteCount;
	}

}
