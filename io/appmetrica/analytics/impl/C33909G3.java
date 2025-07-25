package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.G3 */
/* loaded from: classes9.dex */
public final class C33909G3 implements InterfaceC33762A6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC33762A6
    /* renamed from: a */
    public final void mo20825a(@NotNull Context context) {
        CountDownLatch countDownLatch = AbstractC33936H5.f92946a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = AbstractC33936H5.f92947b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            AbstractC33936H5.f92946a = null;
        }
    }
}
