package school.sptech.baralho;

public enum CartaNaipe {

    A(1,11),
    DOIS(2,2),
    TRES(3,3),
    QUATRO(4,4),
    CINCO(5,5),
    SEIS(6,6),
    SETE(7,7),
    OITO(8,8),
    NOVE(9,9),
    DEZ(10,10),
    Q(10,10),
    J(10,10),
    K(10,10),
    OUROS,
    ESPADAS,
    COPAS,
    PAUS;



    private int valor1;
    private int valor2;


    CartaNaipe(){}
    CartaNaipe(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Integer getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }
}
