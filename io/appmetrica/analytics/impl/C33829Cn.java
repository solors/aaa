package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Cn */
/* loaded from: classes9.dex */
public final class C33829Cn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f92683a = "WebView interface setup is successful.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).info(this.f92683a, new Object[0]);
    }
}
