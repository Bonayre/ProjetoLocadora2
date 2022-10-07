package service;

import model.Aluguel;
import model.Veiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AluguelService {
    private static List<Aluguel> alugueis = new ArrayList<>();
    private VeiculoService veiculoService = new VeiculoService();

    public Aluguel cadastrarAluguel (String Placa) {
        Veiculo veiculo = veiculoService(Placa);
        if (veiculo == null) {
            return null;
        }

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(7);

        Aluguel aluguel = new Aluguel(veiculo, dataEmprestimo, dataDevolucao);
        alugueis.add(aluguel);
        return aluguel;

    }

        public List<Aluguel> listarAlugueis(){
        return alugueis;
        }

        public boolean devolverVeiculo (String Placa) {
            Optional<Aluguel> aluguel = alugueis.stream().filter(e -> e.getVeiculo()).findFirst();
            if (aluguel.isPresent()){
                aluguel emp = aluguel.get();
                alugueis.remove(emp);
                return true;
            }
            return false;
        }
}
