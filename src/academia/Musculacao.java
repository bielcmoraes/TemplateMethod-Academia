package academia;

public abstract class Musculacao {
	
	final void treinos(){
		
		peito();
		triceps();
		costas();
		biceps();
		antebraco();
		pernas();
		ombro();
		trapezio();
		aquecimento();
	}


	protected abstract void biceps();


	protected abstract void trapezio();

	protected abstract void ombro();

	protected abstract void pernas();

	protected abstract void antebraco();

	protected abstract void costas();

	protected abstract void triceps();

	protected abstract void peito();
	
	protected final void aquecimento() {
		System.out.println("10 minutos de aquecimento");
	}
}
