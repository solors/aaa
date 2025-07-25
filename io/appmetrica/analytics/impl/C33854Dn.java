package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Dn */
/* loaded from: classes9.dex */
public final class C33854Dn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f92748a = "WebView interface setup failed because javascript is disabled for the WebView.";

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).warning(this.f92748a, new Object[0]);
    }
}
