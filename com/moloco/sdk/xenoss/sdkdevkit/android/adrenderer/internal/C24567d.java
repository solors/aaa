package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d */
/* loaded from: classes7.dex */
public class C24567d extends WebView {

    /* renamed from: a */
    public static final int f63386a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24567d(@NotNull Context context) {
        super(context.getApplicationContext());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }
}
