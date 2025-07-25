package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Ec */
/* loaded from: classes6.dex */
public final class C18914Ec extends WebView {

    /* renamed from: a */
    public boolean f47225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18914Ec(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f47225a = true;
        super.destroy();
    }
}
