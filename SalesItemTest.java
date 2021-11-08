

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (Tannia)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    private SalesItem setUpSalesItem;
    
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        setUpSalesItem = new SalesItem("TestSalesItem", 0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        setUpSalesItem = null;
    }

    @Test
    public void getName_test()
    {
        SalesItem test_item = new SalesItem("Nick", 123);
        assertSame("Nick", test_item.getName());
    }
    
    @Test
    public void getPrice_test()
    {
        SalesItem test_item = new SalesItem("Nick", 123);
        assertSame(123, test_item.getPrice());
    }
    
    /**
     * Tests the method getNumberOfComments in the SalesItem class.
     *
     * Tests the method with various comment cases.
     */
    @Test
    public void testGetNumberOfComments()
    {
        // Test the method without any comments.
        assertEquals(0, setUpSalesItem.getNumberOfComments());
        
        // Test the method with a comment added.
        setUpSalesItem.addComment("Author", "Comment", 2);
        assertEquals(1, setUpSalesItem.getNumberOfComments());
    }
    
    /**
     * Tests the method addComment in the SalesItem class.
     *
     * Tests the method with various comment cases.
     */
    @Test
    public void testAddComment()
    {
        // Test adding a normal valid comment.
        assertEquals(true, setUpSalesItem.addComment("Author", "Comment", 3));
        
        // Test adding comments that have an invalid rating.
        assertEquals(false, setUpSalesItem.addComment("Author2", "Comment", 0));
        assertEquals(false, setUpSalesItem.addComment("Author2", "Comment", 6));
        
        // Test adding a comment with the same author name.
        assertEquals(false, setUpSalesItem.addComment("Author", "Comment", 3));
    }
    
    /**
     * Tests the method removeComment in the SalesItem class.
     *
     * Tests the method with various comment cases.
     */
    @Test
    public void testRemoveComment()
    {
        // Add 3 valid comments.
        setUpSalesItem.addComment("Author1", "Comment1", 3);
        setUpSalesItem.addComment("Author2", "Comment2", 4);
        setUpSalesItem.addComment("Author3", "Comment3", 1);
        
        // Test removing 2 comments.
        setUpSalesItem.removeComment(0);
        assertEquals(2, setUpSalesItem.getNumberOfComments());
        setUpSalesItem.removeComment(1);
        assertEquals(1, setUpSalesItem.getNumberOfComments());
        
        // Test removing comments with an invalid index.
        setUpSalesItem.removeComment(-1);
        assertEquals(1, setUpSalesItem.getNumberOfComments());
        setUpSalesItem.removeComment(6);
        assertEquals(1, setUpSalesItem.getNumberOfComments());
    }
    /**
     * Tests the method upvoteComment in the SalesItem class.
     */

    @Test
    public void testUpvote()
    {
        assertEquals(true, setUpSalesItem.addComment("Tannia", "Nice", 4));
        assertEquals(0, setUpSalesItem.getVotesForIndex(0));
        setUpSalesItem.upvoteComment(0);
        assertEquals(1, setUpSalesItem.getVotesForIndex(0));
    }
    /**
     * Tests the method downvoteComment in the SalesItem class.
     */
    @Test
    public void testDownvote()
    {
        assertEquals(true, setUpSalesItem.addComment("Tannia", "Nice", 4));
        assertEquals(0, setUpSalesItem.getVotesForIndex(0));
        setUpSalesItem.downvoteComment(0);
        assertEquals(-1, setUpSalesItem.getVotesForIndex(0));
    }
    /**
     * Tests the method findMostHelpfulComment() in the SalesItem class.
     */
    @Test
    public void testMostHelpful()
    {
        assertEquals(true, setUpSalesItem.addComment("Tannia", "Nice", 4));
        assertEquals(true, setUpSalesItem.addComment("Nicole", "Not too bad", 4));
        setUpSalesItem.upvoteComment(0);
        setUpSalesItem.upvoteComment(0);
        setUpSalesItem.upvoteComment(1);
        Comment comment1 = setUpSalesItem.findMostHelpfulComment();
        assertEquals(comment1, comment1);
        assertEquals(comment1, setUpSalesItem.findMostHelpfulComment());
    }
    /**
     * Tests the constructor of the SalesItem class.
     */
    @Test
    public void testConstructor()
    {
        SalesItem salesIte1 = new SalesItem("Blue car", 6000);
        assertEquals("Blue car", salesIte1.getName());
        assertEquals(6000, salesIte1.getPrice());
        assertEquals(0, salesIte1.getNumberOfComments());
    }
    /**
     * Tests the method findCommentByAuthor() in the SalesItem class.
     */
    @Test
    public void testCommentByAuthor()
    {
        assertEquals(true, setUpSalesItem.addComment("Tannia", "nice", 4));
        Comment comment1 = setUpSalesItem.getCommentByAuthor("Tannia");
        assertEquals(comment1, comment1);
        assertEquals(comment1, setUpSalesItem.getCommentByAuthor("Tannia"));
    }
}






