package sg.bigo.ads.common.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.common.utils.s */
/* loaded from: classes10.dex */
public final class C43839s {
    /* renamed from: a */
    public static void m4815a(Context context, ProgressBar progressBar, int i) {
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            progressBar.setIndeterminateDrawable(C43810a.m4955a(context, i));
            return;
        }
        indeterminateDrawable.setTint(C43810a.m4944c(context, 17170443));
        progressBar.setIndeterminateDrawable(indeterminateDrawable);
    }

    /* renamed from: a */
    public static void m4814a(@NonNull Window window) {
        window.getDecorView().setSystemUiVisibility(5894);
    }
}
