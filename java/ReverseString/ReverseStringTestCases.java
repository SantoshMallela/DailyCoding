import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class  {
	
	@Test
	public void Strings() {
		String output[]=new String[]{ba,dba};
		String [] result = new String[] {ReverseString(2,new String[]{ab,abd})};
		assertEquals(output, result);
	}
	
	@Test
	public void UniquePairs() {
		String output[]=new String[]{nus,sub};
		String [] result = new String[] {ReverseString(2,new String[]{sun,bus})};
		assertEquals(output, result);
	}
	
	@Test
	public void EmptyValues() {
		String output[]=new String[]{};
		String [] result = new String[] {ReverseString.ReverseString(0,new String[]{})};
		assertEquals(output, result);
	}
	
	@Test
	public void NegativeValuePairs() {
		String output[]=new String[]{abba,bbaac,hell,hello};
		String [] result = new String[] {ReverseString.ReverseString(4,new String[]{abba,caabb,lleh,olleh})};
		assertEquals(output, result);
	}
	
	@Test
	public void SameMultiplePairs() {
		String output[]=new String[]{a,ba,cba,dcba,edcba};
		String [] result = new String[] {ReverseString.ReverseString(5,new String[]{a,ab,abc,abcd,abcde})};
		assertEquals(output, result);
	}
	
	


}
