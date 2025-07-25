package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kb */
/* loaded from: classes8.dex */
public final class C30715kb implements ke0 {
    @NotNull

    /* renamed from: a */
    private final jb1 f81357a;
    @NotNull

    /* renamed from: b */
    private final List<InterfaceC30925nb> f81358b;
    @Nullable

    /* renamed from: c */
    private InterfaceC30779lb f81359c;

    /* renamed from: com.yandex.mobile.ads.impl.kb$a */
    /* loaded from: classes8.dex */
    public final class RunnableC30716a implements Runnable {
        public RunnableC30716a() {
            C30715kb.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C30715kb.this.f81357a.m32947b();
        }
    }

    public C30715kb(@NotNull jb1 optOutRepository) {
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f81357a = optOutRepository;
        this.f81358b = m32609a();
    }

    /* renamed from: a */
    public final void m32606a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (InterfaceC30925nb interfaceC30925nb : this.f81358b) {
                if (interfaceC30925nb.mo29241a(scheme, host)) {
                    interfaceC30925nb.mo29242a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            um0.m28723f(new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m32607a(@NotNull InterfaceC30779lb adtuneOptOutWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebViewListener, "adtuneOptOutWebViewListener");
        this.f81359c = adtuneOptOutWebViewListener;
    }

    /* renamed from: a */
    private final List<InterfaceC30925nb> m32609a() {
        List<InterfaceC30925nb> m17175e;
        m17175e = CollectionsJVM.m17175e(new C31434tb("noInterestAd", new RunnableC30716a()));
        return m17175e;
    }

    @Override // com.yandex.mobile.ads.impl.ke0
    /* renamed from: a */
    public final void mo30426a(int i) {
        InterfaceC30779lb interfaceC30779lb;
        if (!new C31271rb().m30088a(i) || (interfaceC30779lb = this.f81359c) == null) {
            return;
        }
        interfaceC30779lb.mo32298a();
    }
}
