package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.E0 */
/* loaded from: classes9.dex */
public final class C33856E0 {

    /* renamed from: a */
    public final IHandlerExecutor f92751a = C34848r4.m21050i().m21054e().m21639a();

    /* renamed from: b */
    public final C34844r0 f92752b;

    /* renamed from: c */
    public final C34616ie f92753c;

    /* renamed from: d */
    public final C34697le f92754d;

    public C33856E0() {
        C34844r0 c34844r0 = new C34844r0();
        this.f92752b = c34844r0;
        this.f92753c = new C34616ie(c34844r0);
        this.f92754d = new C34697le();
    }

    /* renamed from: a */
    public final void m22687a(final PluginErrorDetails pluginErrorDetails) {
        C34616ie c34616ie = this.f92753c;
        c34616ie.f94629a.mo20778a(null);
        c34616ie.f94630b.mo20778a(pluginErrorDetails);
        C34697le c34697le = this.f92754d;
        Intrinsics.m17074g(pluginErrorDetails);
        c34697le.getClass();
        this.f92751a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.go
            {
                C33856E0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C33856E0.m22690a(C33856E0.this, pluginErrorDetails);
            }
        });
    }

    /* renamed from: a */
    public final void m22686a(final PluginErrorDetails pluginErrorDetails, final String str) {
        C34616ie c34616ie = this.f92753c;
        c34616ie.f94629a.mo20778a(null);
        c34616ie.f94630b.mo20778a(pluginErrorDetails);
        if (c34616ie.f94632d.mo20778a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f95187a) {
            C34697le c34697le = this.f92754d;
            Intrinsics.m17074g(pluginErrorDetails);
            c34697le.getClass();
            this.f92751a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.eo
                {
                    C33856E0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C33856E0.m22689a(C33856E0.this, pluginErrorDetails, str);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m22685a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        C34616ie c34616ie = this.f92753c;
        c34616ie.f94629a.mo20778a(null);
        c34616ie.f94631c.mo20778a(str);
        C34697le c34697le = this.f92754d;
        Intrinsics.m17074g(str);
        c34697le.getClass();
        this.f92751a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.fo
            {
                C33856E0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C33856E0.m22688a(C33856E0.this, str, str2, pluginErrorDetails);
            }
        });
    }

    /* renamed from: a */
    public static final void m22689a(C33856E0 c33856e0, PluginErrorDetails pluginErrorDetails, String str) {
        c33856e0.f92752b.getClass();
        C34818q0 c34818q0 = C34818q0.f95195e;
        Intrinsics.m17074g(c34818q0);
        C34373Zb mo20832j = c34818q0.m21112k().mo20832j();
        Intrinsics.m17074g(mo20832j);
        mo20832j.f93875a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    /* renamed from: a */
    public static final void m22688a(C33856E0 c33856e0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        c33856e0.f92752b.getClass();
        C34818q0 c34818q0 = C34818q0.f95195e;
        Intrinsics.m17074g(c34818q0);
        C34373Zb mo20832j = c34818q0.m21112k().mo20832j();
        Intrinsics.m17074g(mo20832j);
        mo20832j.f93875a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    /* renamed from: a */
    public static final void m22690a(C33856E0 c33856e0, PluginErrorDetails pluginErrorDetails) {
        c33856e0.f92752b.getClass();
        C34818q0 c34818q0 = C34818q0.f95195e;
        Intrinsics.m17074g(c34818q0);
        C34373Zb mo20832j = c34818q0.m21112k().mo20832j();
        Intrinsics.m17074g(mo20832j);
        mo20832j.f93875a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
