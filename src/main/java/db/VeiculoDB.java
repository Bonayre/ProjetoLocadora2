package db;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VeiculoDB {
private static List<Veiculo> veiculos = new ArrayList<>();
public Veiculo cadastrarVeiculo(Veiculo veiculo){
    veiculos.add(veiculo);
    return veiculo;
    }

    public List<Veiculo> listVeiculos() {
        return veiculos;
    }

    public Veiculo encontrarVeiculo(Placa placa) {
    Optional<Veiculo> lista = veiculos.stream().filter(1 -> 1.getPlaca().equals(placa)).findFirst();
    if (lista.isPresent()){
        return lista.get();
    }
    return null;

    }
}
