package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.common_adapter_internal.C23862a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24624j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n */
/* loaded from: classes7.dex */
public final class C25377n implements InterfaceC25376m {
    @NotNull

    /* renamed from: a */
    public final Context f65922a;

    public C25377n(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f65922a = context;
    }

    /* renamed from: a */
    public final DisplayMetrics m44655a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    @RequiresApi(30)
    /* renamed from: b */
    public final DisplayMetrics m44654b(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.density = this.f65922a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.f65922a.getResources().getDisplayMetrics().densityDpi;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        displayMetrics.widthPixels = bounds.width();
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds2 = currentWindowMetrics2.getBounds();
        displayMetrics.heightPixels = bounds2.height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC25376m
    @NotNull
    public C23862a invoke() {
        DisplayMetrics m44655a;
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(this.f65922a, WindowManager.class);
        if (windowManager == null) {
            return new C23862a(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m44655a = m44654b(windowManager);
        } else {
            m44655a = m44655a(windowManager);
        }
        int i = m44655a.widthPixels;
        return new C23862a(i, m44655a.heightPixels, C24624j0.m46029a(i, m44655a.density), C24624j0.m46029a(m44655a.heightPixels, m44655a.density), m44655a.densityDpi, m44655a.density);
    }
}
