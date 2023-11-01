package org.serratec.h2.aula06h2.heranca.model;

public class Funcionario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome deve ser obrigatorio.")
    @Size(max = 60, message = "O nome deve conter no Max {max} caracteres.")
    @Column
    private String nome;

    @CPF(message = "CPF invalido, digite novamente.")
    @Column
    private String cpf;

    @NotNull(message = "Salario obrigatorio, insira o valor do salario.")
    @Column
    private Double salario;

    @Enumerated(EnumType.ORDINAL)
    private Turno turno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
