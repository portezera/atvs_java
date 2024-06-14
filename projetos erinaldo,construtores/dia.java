package natan3A;

public class Data {
	private int dia, mes, ano;
	
	//1
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
	
	//2
	public Data(int d) {
		if (dia < 0 || dia >31 )
			throw new IllegalArgumentException("o dia precisa estar entre 0  e 31");
	}
	
	//3
	//(abril, junho, setembro e novembro) com 30 dias,
	//sete (janeiro, março, maio, julho, agosto, outubro e dezembro) com 31 dias
	//e o único mês, fevereiro, com 28 dias (ou 29 dias, nos anos bissextos)
	public Data(int d,int m) {
		if (dia < 0 || dia >31 )
			throw new IllegalArgumentException("o dia precisa estar entre 0  e 31");
		if (mes < 1 || mes >12 )
			throw new IllegalArgumentException("o mes precisa estar entre 1 e 12");
		if (mes == 2 || dia == 29 )
			throw new IllegalArgumentException("mes de fevereiro");
	
	}
	
	//4
	public Data(int d,int m,int a) {
		if (dia < 0 || dia >31 )
			throw new IllegalArgumentException("o dia precisa estar entre 0  e 31");
		if (mes < 1 || mes >12 )
			throw new IllegalArgumentException("o mes precisa estar entre 1 e 12");
		if (mes == 2 || dia == 29 )
			throw new IllegalArgumentException("mes de fevereiro");
		if (dia == 366)
			throw new IllegalArgumentException("ano bisesto");
	}
}
