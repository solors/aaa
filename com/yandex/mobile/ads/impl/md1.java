package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC31287rj;
import com.yandex.mobile.ads.impl.yl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class md1 implements o32 {
    @NotNull

    /* renamed from: a */
    private final yl1 f82144a;
    @NotNull

    /* renamed from: b */
    private final m32 f82145b;
    @NotNull

    /* renamed from: c */
    private final Context f82146c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md1(Context context) {
        this(context, yl1.C31906a.m26857a(), new m32(context));
        int i = yl1.f88258c;
    }

    @Override // com.yandex.mobile.ads.impl.o32
    /* renamed from: a */
    public final void mo31187a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ld1 request = new ld1(this.f82146c, this.f82145b.m32106a(url), new C30841a(url));
        yl1 yl1Var = this.f82144a;
        Context context = this.f82146c;
        synchronized (yl1Var) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            m91.m32067a(context).m35826a(request);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.md1$a */
    /* loaded from: classes8.dex */
    private static final class C30841a implements AbstractC31287rj.InterfaceC31288a<c91> {
        @NotNull

        /* renamed from: a */
        private final String f82147a;

        public C30841a(@NotNull String trackingUrl) {
            Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
            this.f82147a = trackingUrl;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@NotNull yc2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            um0.m28727b(this.f82147a, error.toString());
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
        /* renamed from: a */
        public final void mo28555a(Object obj) {
            c91 response = (c91) obj;
            Intrinsics.checkNotNullParameter(response, "response");
            um0.m28724e(this.f82147a, Integer.valueOf(response.f77556a));
        }
    }

    public md1(@NotNull Context context, @NotNull yl1 requestManager, @NotNull m32 urlModifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(urlModifier, "urlModifier");
        this.f82144a = requestManager;
        this.f82145b = urlModifier;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f82146c = applicationContext;
    }
}
