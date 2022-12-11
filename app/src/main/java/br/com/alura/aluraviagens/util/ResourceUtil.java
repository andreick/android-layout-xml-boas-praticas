package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        int idDoDrawable = context.getResources()
                .getIdentifier(drawableEmTexto, DRAWABLE, context.getPackageName());
        return ContextCompat.getDrawable(context, idDoDrawable);
    }
}
