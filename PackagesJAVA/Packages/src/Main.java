import br.com.devflix.*;
import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

public class Main {
    public static void main (String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Invocação do Mal";
        filme1.duracao = 1.43f;
        filme1.idadeMin = 18;

        Novela novela1 = new Novela();

        Documentario documentario1 = new Documentario();

        Anime anime1 = new Anime();

        Serie serie1 = new Serie();

        Janela janelinha = new Janela();

        MiniaturaVideo miniatura = new MiniaturaVideo();

        BotaoPause pause = new BotaoPause();
        BotaoPlay play = new BotaoPlay();
        BotaoVoltar voltar = new BotaoVoltar();

        filme1.assistiu("Pedro");

    }
}