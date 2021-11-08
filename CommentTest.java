

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    
    /*
     * Creates Comment object and verifies its fields are correct
     */
    @Test
    public void commentConstructor_test()
    {
        Comment test_comment = new Comment("Nick", "hello", 3);
        assertSame("Nick", test_comment.getAuthor());
        assertSame("hello", test_comment.getText());
        assertSame(3, test_comment.getRating());
        assertSame(0, test_comment.getVoteCount());
    }

    @Test
    public void upvote_test()
    {
        Comment test_comment = new Comment("Nick", "hello", 3);
        test_comment.upvote();
        assertSame(1, test_comment.getVoteCount());
    }
    
    @Test
    public void downvote_test()
    {
        Comment test_comment = new Comment("Nick", "hello", 3);
        test_comment.downvote();
        assertSame(-1, test_comment.getVoteCount());
    }
    
    @Test
    public void getRating_test()
    {
        Comment test_comment = new Comment("Nick", "hello", 3);
        assertSame(3, test_comment.getRating());
    }
}

