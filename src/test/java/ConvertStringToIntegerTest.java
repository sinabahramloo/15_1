import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class ConvertStringToIntegerTest {

    @Test
    public void convertorTestPass() {
        Assert.assertEquals("testconvertor1",0,ConvertStringToInteger.convertor("0").intValue() );
        Assert.assertEquals("testconvertor2",-100,ConvertStringToInteger.convertor("-100").intValue() );
        Assert.assertEquals("testconvertor1",200,ConvertStringToInteger.convertor("200").intValue() );
    }
    @Test(expected = NumberFormatException.class)
    public void convertorTestFail() {
        ConvertStringToInteger.convertor("4 56").intValue();
        ConvertStringToInteger.convertor("swe").intValue();
        ConvertStringToInteger.convertor("s232").intValue();
        ConvertStringToInteger.convertor(null).intValue();
    }

}
