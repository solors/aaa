package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.jn */
/* loaded from: classes9.dex */
public final class C34652jn implements NetworkTask.ShouldTryNextHostCondition {
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition
    public final boolean shouldTryNextHost(int i) {
        boolean z;
        if (i == 400) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
