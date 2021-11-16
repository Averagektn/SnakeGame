
import com.JavaGame.MouseInput;
import org.junit.Assert;
import org.junit.Test;

import java.awt.event.MouseEvent;

public class MouseInputTest {
    @Test
    public void isNotNull() {
        Assert.assertNotNull(MouseInput.getInstance());
    }

}