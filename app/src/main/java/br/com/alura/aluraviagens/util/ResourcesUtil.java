package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

public class ResourcesUtil {

    private static final String DRAWABLE = "drawable";

    public static Drawable getDrawable(Context context, String drawableEmTexto) {
        int idDoDrawable = context.getResources()
                .getIdentifier(drawableEmTexto, DRAWABLE, context.getPackageName());
        return ContextCompat.getDrawable(context, idDoDrawable);
    }
}
