import org.testng.Assert;
import org.testng.annotations.Test;

public class LogicTests 
{
	@Test
	public void printLogicTest()
	{
		Logic logic = new Logic();
		String expectedText = "logic text";
		String actualText = logic.printLogic();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void printLogicFailingTest()
	{
		Logic logic = new Logic();
		String unexpectedText = "not logic text";
		String actualText = logic.printLogic();
		Assert.assertEquals(actualText, unexpectedText);
	}
}
