public class TesteFatura {

    public static void main(String[] args) {
        Fatura F1 = new Fatura();
	
        F1.valor=100;
        F1.pontuacao=60;

        Fatura F2, F3, F4;

        F2 = F1.somaCom(4);
        F3 = F1.somaCom(F2);
        F4 = F1.somaCom(3000,6530f);
        F4.somaCom(F1);
        F4.somaCom(4);
        F4.somaCom(4, 400);
        

        F1.print();
        F2.print();
        F3.print();
        F4.print();
    }    
}
