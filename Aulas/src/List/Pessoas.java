package List;

public class Pessoas {
    private Integer id;
    private String nome;
    private Double salary;

    public Pessoas(){}

    public Pessoas(int id, String nome, Double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumento(double percent){
        salary +=  salary * percent /100;
    }
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salary);
    }
}
