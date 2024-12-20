public class TorreHanoi {
    long contador;
    void hanoi (int qntDiscos, char origem, char auxiliar, char destino){
        if(qntDiscos > 0){
            hanoi(qntDiscos - 1, origem, destino, auxiliar);
            //System.out.println("Move de "+origem+ " para "+ destino);
            contador++;
            hanoi(qntDiscos - 1, auxiliar, origem, destino);

        }
    }

}
