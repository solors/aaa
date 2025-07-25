package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;

/* loaded from: classes5.dex */
final class ThemeUtils {
    private ThemeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m71645a(@NonNull Context context, @StyleRes int i) {
        Resources.Theme m71644b;
        context.getTheme().applyStyle(i, true);
        if ((context instanceof Activity) && (m71644b = m71644b((Activity) context)) != null) {
            m71644b.applyStyle(i, true);
        }
    }

    @Nullable
    /* renamed from: b */
    private static Resources.Theme m71644b(@NonNull Activity activity) {
        View peekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window != null && (peekDecorView = window.peekDecorView()) != null && (context = peekDecorView.getContext()) != null) {
            return context.getTheme();
        }
        return null;
    }
}
