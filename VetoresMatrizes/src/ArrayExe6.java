import java.math.BigInteger;

public class ArrayExe6 {
	public static void main(String[] args) {
	
		BigInteger[][] tabuleiro = new BigInteger[8][8];
		BigInteger qtd_feijao = BigInteger.ONE;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				tabuleiro[i][j] = qtd_feijao;
				qtd_feijao = qtd_feijao.multiply(BigInteger.valueOf(2));
			}
		}
		System.out.println(qtd_feijao);

	}
}
