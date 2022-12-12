package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DataUtil;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourcesUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    private static final String TITULO_APPBAR = "Resumo do pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle(TITULO_APPBAR);

        Pacote pacoteSp = new Pacote("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("2430000000.99"));

        exibirImagemDoLocal(pacoteSp);
        exibirLocal(pacoteSp);
        exibirDias(pacoteSp);
        exibirData(pacoteSp);
        exibirPrecoTotal(pacoteSp);
    }

    private void exibirPrecoTotal(Pacote pacote) {
        TextView tvPreco = findViewById(R.id.resumo_pacote_tv_preco);
        String precoFormatado = MoedaUtil.formatarParaBrasileiro(pacote.getPreco());
        tvPreco.setText(precoFormatado);
    }

    private void exibirData(Pacote pacote) {
        TextView tvData = findViewById(R.id.resumo_pacote_tv_data);
        String dataViagem = DataUtil.formatarPeriodo(pacote.getDias());
        tvData.setText(dataViagem);
    }

    private void exibirDias(Pacote pacote) {
        TextView tvDias = findViewById(R.id.resumo_pacote_tv_dias);
        String diasFormatados = DiasUtil.formatar(pacote.getDias());
        tvDias.setText(diasFormatados);
    }

    private void exibirLocal(Pacote pacote) {
        TextView tvLocal = findViewById(R.id.resumo_pacote_tv_local);
        tvLocal.setText(pacote.getLocal());
    }

    private void exibirImagemDoLocal(Pacote pacote) {
        ImageView ivLocal = findViewById(R.id.resumo_pacote_iv_local);
        Drawable drawable = ResourcesUtil.getDrawable(this, pacote.getImagem());
        ivLocal.setImageDrawable(drawable);
    }
}