package escola.correcao;

public class MediaAlunos {

	private Aluno aluno; // INSTANCIA DA CLASSE ALUNO
	private double media; // VARIAVEL MEDIA

	// construtor inicializa variáveis de instância
	public MediaAlunos(Aluno aluno, double media) {
		this.aluno = aluno;
		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor padrão da média da variável de instância (0.0)
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; // atribui à variável de instância

	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor atual da média da variável de instância
		if (media > 0.0)
			if (media <= 100.0)
		this.media = media;
	}
	
	// determina e retorna a letra da nota de Student
	public String getCalcularMedia() {
		String letterGrade = "";
		if (media >= 90.0) 
		 letterGrade = "A" + aluno.getNome(); 
		else if (media>= 80.0)
		 letterGrade = "B" + aluno.getNome();  
		 else if (media >= 70.0)
		 letterGrade = "C" + aluno.getNome(); 
		else if (media >= 60.0)
		 letterGrade = "D" + aluno.getNome(); 
		else 
		 letterGrade = "F" + aluno.getNome(); 
		
		 return letterGrade;
		
	}
	
}
