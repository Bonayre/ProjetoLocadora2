package db;

import jdk.internal.jline.internal.TestAccessible;
import model.Veiculo;
import org.graalvm.compiler.debug.Assertions;

public class VeiculoDBTest {
    private VeiculoDB veiculoDB = new VeiculoDB();

    @Test

    public void testCadastrarVeiculo(){
        Veiculo veiculo = new Veiculo();
        Veiculo.setPlaca("ABC-1D34");
        veiculo.setDisponivel(true);
        veiculo.setModelo(("Mobi Way"));

        Veiculo resp = veiculoDB.cadastrarVeiculo(veiculo);
        Assertions.assertEquals("ABC-1D34", resp.getPlaca());
        Assertions.assertEquals("Mobi Way", resp.getModelo());
        Assertions.assertTrue(veiculo.getDisponivel());
    }

}
