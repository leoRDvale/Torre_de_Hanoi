import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*Quantidade de discos sugeridas pelo exercício
         *1, 10, 20, 30, 40, 41
         */


        TorreHanoi torreHanoi = new TorreHanoi();
        String s;
        int qntDiscos;
        s = JOptionPane.showInputDialog(null, "--- Torre de Hanoi ---\nDigite a quantidade de discos:");
        qntDiscos = Integer.parseInt(s);

        long starTime = System.currentTimeMillis();

        torreHanoi.hanoi(qntDiscos, 'A', 'B', 'C');

        long endTime = System.currentTimeMillis();
        long durationMillis = endTime - starTime;
        long horas = durationMillis / 3600000;
        long minutos = (durationMillis % 3600000) / 60000;
        long segundos = (durationMillis % 60000) / 1000;
        long milisegundos = durationMillis % 1000;


        String mensagem = String.format("Quantidade de movimentos: %d\nTempo gasto para a execução: %02d:%02d:%02d:%02d", torreHanoi.contador, horas, minutos, segundos, milisegundos);

        JOptionPane.showMessageDialog(null, mensagem);


    }
}
