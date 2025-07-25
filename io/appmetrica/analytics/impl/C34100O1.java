package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.internal.AppMetricaService;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.O1 */
/* loaded from: classes9.dex */
public final class C34100O1 {
    @NotNull
    /* renamed from: a */
    public final Intent m22391a(@NotNull Context context, @NotNull String str) {
        Intent intent = new Intent(context, AppMetricaService.class);
        intent.setAction(str);
        return intent;
    }
}
