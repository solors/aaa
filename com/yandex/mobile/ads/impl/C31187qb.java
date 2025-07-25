package com.yandex.mobile.ads.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qb */
/* loaded from: classes8.dex */
public final class C31187qb implements ke0 {
    @NotNull

    /* renamed from: a */
    private final C30541ib f84281a;
    @NotNull

    /* renamed from: b */
    private final List<InterfaceC30925nb> f84282b;
    @Nullable

    /* renamed from: c */
    private InterfaceC31345sb f84283c;
    @Nullable

    /* renamed from: d */
    private String f84284d;

    /* renamed from: com.yandex.mobile.ads.impl.qb$a */
    /* loaded from: classes8.dex */
    public final class RunnableC31188a implements Runnable {
        public RunnableC31188a() {
            C31187qb.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31187qb.m30425a(C31187qb.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qb$b */
    /* loaded from: classes8.dex */
    public final class RunnableC31189b implements Runnable {
        public RunnableC31189b() {
            C31187qb.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31187qb.this.f84281a.m33322a(C31187qb.this.f84284d);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.qb$c */
    /* loaded from: classes8.dex */
    public final class RunnableC31190c implements Runnable {
        public RunnableC31190c() {
            C31187qb.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC31345sb interfaceC31345sb = C31187qb.this.f84283c;
            if (interfaceC31345sb != null) {
                interfaceC31345sb.mo29658a();
            }
        }
    }

    public C31187qb(@NotNull C30541ib optOutRenderer) {
        Intrinsics.checkNotNullParameter(optOutRenderer, "optOutRenderer");
        this.f84281a = optOutRenderer;
        this.f84282b = m30427a();
    }

    /* renamed from: a */
    public static final void m30425a(C31187qb c31187qb) {
        InterfaceC31345sb interfaceC31345sb = c31187qb.f84283c;
        if (interfaceC31345sb != null) {
            interfaceC31345sb.mo29656b();
        }
    }

    /* renamed from: b */
    public final void m30421b(@Nullable String str) {
        this.f84284d = str;
    }

    /* renamed from: a */
    public final void m30423a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (InterfaceC30925nb interfaceC30925nb : this.f84282b) {
                if (interfaceC30925nb.mo29241a(scheme, host)) {
                    interfaceC30925nb.mo29242a();
                    return;
                }
            }
            InterfaceC31345sb interfaceC31345sb = this.f84283c;
            if (interfaceC31345sb != null) {
                interfaceC31345sb.mo29657a(url);
            }
        } catch (URISyntaxException unused) {
            um0.m28723f(new Object[0]);
            InterfaceC31345sb interfaceC31345sb2 = this.f84283c;
            if (interfaceC31345sb2 != null) {
                interfaceC31345sb2.mo29656b();
            }
        }
    }

    /* renamed from: a */
    public final void m30424a(@NotNull InterfaceC31345sb adtuneWebViewListener) {
        Intrinsics.checkNotNullParameter(adtuneWebViewListener, "adtuneWebViewListener");
        this.f84283c = adtuneWebViewListener;
    }

    @Override // com.yandex.mobile.ads.impl.ke0
    /* renamed from: a */
    public final void mo30426a(int i) {
        InterfaceC31345sb interfaceC31345sb;
        if (!new C31271rb().m30088a(i) || (interfaceC31345sb = this.f84283c) == null) {
            return;
        }
        interfaceC31345sb.mo29656b();
    }

    /* renamed from: a */
    private final List<InterfaceC30925nb> m30427a() {
        List<InterfaceC30925nb> m17163p;
        m17163p = C37563v.m17163p(new C31434tb("adtuneRendered", new RunnableC31190c()), new C31434tb("adtuneClosed", new RunnableC31188a()), new C31434tb("openOptOut", new RunnableC31189b()));
        return m17163p;
    }
}
