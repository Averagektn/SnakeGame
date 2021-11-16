
import com.JavaGame.Snake;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class SnakeTest {
    private Snake direction;
    Snake snake = new Snake();

    @Test
    public void isNotNull() {
        Assert.assertNotNull(Snake.getInstanceSnake());
    }

    @Test
    public void snakeGoTest() {


        snake.snakeGo(direction.TOP);

        snake.snakeHasCoord(5, 5);
        snake.addElementToTail(1);
        snake.goForSnakeHead(Snake.TOP);


    }
}
