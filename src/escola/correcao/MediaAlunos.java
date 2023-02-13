package escola.correcao;

public class MediaAlunos {

	private Aluno aluno; // INSTANCIA DA CLASSE ALUNO
	private double media; // VARIAVEL MEDIA

	// construtor inicializa vari�veis de inst�ncia
	public MediaAlunos(Aluno aluno, double media) {
		this.aluno = aluno;
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor padr�o da m�dia da vari�vel de inst�ncia (0.0)
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; // atribui � vari�vel de inst�ncia

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
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor atual da m�dia da vari�vel de inst�ncia
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
