package db;

import model.Aluguel;

import java.util.ArrayList;
import java.util.List;

public class AluguelDB {
    private static final List<Aluguel> alugueis = new ArrayList<>();
    public Aluguel encontrarAluguel(Aluguel aluguel) {
        aluguel.add(aluguel);
        return aluguel;

    }

    public Aluguel encontrarAluguel(Aluguel aluguel) {
        optional<Aluguel> aluguel = alugueis.stream().filter(1 ->1. getVeiculo().equals(Veiculo)).findFirst();

        if (aluguel.isPresent()) {
            return aluguel.get();
        }
        return null;
    }
}


