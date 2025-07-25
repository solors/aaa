package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Fn */
/* loaded from: classes9.dex */
public final class C33904Fn {

    /* renamed from: a */
    public final ArrayList f92877a = new ArrayList();

    /* renamed from: b */
    public PublicLogger f92878b;

    /* renamed from: a */
    public final synchronized void m22595a(Consumer consumer) {
        PublicLogger publicLogger = this.f92878b;
        if (publicLogger == null) {
            this.f92877a.add(consumer);
        } else {
            consumer.consume(publicLogger);
        }
    }
}
