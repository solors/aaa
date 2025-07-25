package com.monetization.ads.core.identifiers.p548ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.p548ad.huawei.OpenDeviceIdentifierService;
import com.yandex.mobile.ads.impl.um0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.monetization.ads.core.identifiers.ad.huawei.a */
/* loaded from: classes7.dex */
public final class ServiceConnectionC25460a implements ServiceConnection {
    @NotNull

    /* renamed from: a */
    private final LinkedBlockingQueue f66083a = new LinkedBlockingQueue();

    @Nullable
    /* renamed from: a */
    public final OpenDeviceIdentifierService m44525a() throws InterruptedException {
        return (OpenDeviceIdentifierService) this.f66083a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder binder) {
        IInterface proxy;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            int i = OpenDeviceIdentifierService.Stub.f66081a;
            if (binder == null) {
                proxy = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof OpenDeviceIdentifierService)) {
                    proxy = (OpenDeviceIdentifierService) queryLocalInterface;
                } else {
                    proxy = new OpenDeviceIdentifierService.Stub.Proxy(binder);
                }
            }
            this.f66083a.put(proxy);
        } catch (Exception unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f66083a.clear();
        } catch (UnsupportedOperationException unused) {
            um0.m28726c(new Object[0]);
        }
    }
}
