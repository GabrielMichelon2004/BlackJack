package school.sptech.baralho;

import java.util.ArrayList;
import java.util.List;

public class BaralhoCompleto {


    private List<CartaNaipe> deck = new ArrayList<>();
    private List<CartaNaipe> listaCarta = List.of(
            CartaNaipe.A, CartaNaipe.DOIS, CartaNaipe.TRES, CartaNaipe.QUATRO, CartaNaipe.CINCO,
            CartaNaipe.SEIS, CartaNaipe.SETE, CartaNaipe.OITO, CartaNaipe.NOVE, CartaNaipe.DEZ,
            CartaNaipe.Q, CartaNaipe.J, CartaNaipe.K
            );
    private List<CartaNaipe> listaNaipe = List.of(
            CartaNaipe.OUROS,CartaNaipe.ESPADAS,
            CartaNaipe.COPAS,CartaNaipe.PAUS
    );





    public void criandoDeck(){
        for (int i = 0; i < 8; i++) {
            for (CartaNaipe cartaDaVez: listaCarta) {
                for (CartaNaipe naipeDaVez: listaNaipe) {
                    deck.add(cartaDaVez);
                    deck.add(naipeDaVez);
                }
            }
        }
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BaralhoCompleto{");
        sb.append("deck=").append(deck);
        sb.append('}');
        return sb.toString();
    }
}
