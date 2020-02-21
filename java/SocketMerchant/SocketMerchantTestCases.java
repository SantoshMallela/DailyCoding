import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SocketMerchantTestCases {
	
	@Test
	public void PositiveValuePairs() {
		int result = SocketMerchant.socketmerchant(7, new int[]{1,2,1,2,1,3,2});
		assertEquals(2, result);
	}
	
	@Test
	public void UniquePairs() {
		int result = SocketMerchant.socketmerchant(6, new int[]{1,2,1,2,3,3});
		assertEquals(3, result);
	}
	
	@Test
	public void EmptyValues() {
		int result = SocketMerchant.socketmerchant(0, new int[]{});
		assertEquals(0, result);
	}
	
	@Test
	public void NegativeValuePairs() {
		int result = SocketMerchant.socketmerchant(5, new int[]{-1,-2,0,0,-1});
		assertEquals(2, result);
	}
	
	@Test
	public void SameMultiplePairs() {
		int result = SocketMerchant.socketmerchant(5, new int[]{-1,-2,-1,-1,-1});
		assertEquals(2, result);
	}
	
	@Test
	public void SamePairs() {
		int result = SocketMerchant.socketmerchant(6, new int[]{1,1,1,1,1,1});
		assertEquals(3, result);
	}


}
