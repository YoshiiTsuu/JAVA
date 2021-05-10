package blaBla;

public class TestaPaciente {
	public static void main(String[] args) {
		// nome idade peso estado atual
		Paciente paciente01 = new Paciente();
		paciente01.setEstado("Morto");
		paciente01.setNome("Gabriel Mitsuki");
		paciente01.setIdade(10);
		paciente01.setPeso(34);

		System.out.println("O nome do paciente é: " + paciente01.getNome());
		System.out.println("O estado atual do paciente é: " + paciente01.getEstado());
		System.out.println("A idade do paciente é: " + paciente01.getIdade() + "anos.");
		System.out.println("O peso do paciente é: " + paciente01.getPeso());
	}
}
