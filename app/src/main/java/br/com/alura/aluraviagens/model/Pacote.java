package br.com.alura.aluraviagens.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;

public class Pacote implements Parcelable {

    private final String local;
    private final String imagem;
    private final int dias;
    private final BigDecimal preco;

    public Pacote(String local, String imagem, int dias, BigDecimal preco) {
        this.local = local;
        this.imagem = imagem;
        this.dias = dias;
        this.preco = preco;
    }

    protected Pacote(Parcel in) {
        local = in.readString();
        imagem = in.readString();
        dias = in.readInt();
        preco = new BigDecimal(in.readString());
    }

    public static final Creator<Pacote> CREATOR = new Creator<Pacote>() {
        @Override
        public Pacote createFromParcel(Parcel in) {
            return new Pacote(in);
        }

        @Override
        public Pacote[] newArray(int size) {
            return new Pacote[size];
        }
    };

    public String getLocal() {
        return local;
    }

    public String getImagem() {
        return imagem;
    }

    public int getDias() {
        return dias;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(local);
        parcel.writeString(imagem);
        parcel.writeInt(dias);
        parcel.writeString(preco.toString());
    }
}