package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.LocaleUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle("Resumo do pacote");

        Pacote pacoteSp = new Pacote("São Paulo", "sao_paulo_sp", 2,
                new BigDecimal("2430000000.99"));

        ImageView ivLocal = findViewById(R.id.resumo_pacote_iv_local);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacoteSp.getImagem());
        ivLocal.setImageDrawable(drawable);

        TextView tvLocal = findViewById(R.id.resumo_pacote_tv_local);
        tvLocal.setText(pacoteSp.getLocal());

        TextView tvDias = findViewById(R.id.resumo_pacote_tv_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacoteSp.getDias());
        tvDias.setText(diasEmTexto);

        TextView tvData = findViewById(R.id.resumo_pacote_tv_data);
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, pacoteSp.getDias());
        SimpleDateFormat formatadorBrasileiro =
                new SimpleDateFormat("dd/MM", LocaleUtil.getBrasileiro());
        String dataFormatadaIda = formatadorBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formatadorBrasileiro.format(dataVolta.getTime());
        String dataViagem = dataFormatadaIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);
        tvData.setText(dataViagem);

        TextView tvPreco = findViewById(R.id.resumo_pacote_tv_preco);
        String preco = MoedaUtil.formataParaBrasileiro(pacoteSp.getPreco());
        tvPreco.setText(preco);
    }
}