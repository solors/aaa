package io.appmetrica.analytics.impl;

import android.os.UserManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.Wm */
/* loaded from: classes9.dex */
public final class C34312Wm implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return Boolean.valueOf(((UserManager) obj).isUserUnlocked());
    }
}
