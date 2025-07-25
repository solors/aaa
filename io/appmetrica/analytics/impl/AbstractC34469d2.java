package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* renamed from: io.appmetrica.analytics.impl.d2 */
/* loaded from: classes9.dex */
public abstract class AbstractC34469d2 {
    /* renamed from: a */
    public static final IAppSetIdRetriever m21848a() {
        if (ReflectionUtils.detectClassExists("com.google.android.gms.appset.AppSet")) {
            return new AppSetIdRetriever();
        }
        return new C34201S7();
    }
}
