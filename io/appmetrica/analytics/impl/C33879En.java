package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.En */
/* loaded from: classes9.dex */
public final class C33879En implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f92803a;

    /* renamed from: b */
    public final /* synthetic */ String f92804b = "WebView interface setup failed because of an exception.";

    public C33879En(Throwable th) {
        this.f92803a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f92803a, this.f92804b, new Object[0]);
    }
}
