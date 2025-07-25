package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.W2 */
/* loaded from: classes9.dex */
public final class C34292W2 implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C34316X2 f93630a;

    public C34292W2(C34316X2 c34316x2) {
        this.f93630a = c34316x2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Context context = (Context) obj;
        Intent intent = (Intent) obj2;
        synchronized (this.f93630a) {
            C34316X2 c34316x2 = this.f93630a;
            c34316x2.f93681b = intent;
            Iterator it = c34316x2.f93680a.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).consume(intent);
            }
        }
    }
}
