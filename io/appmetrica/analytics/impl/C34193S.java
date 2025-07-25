package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.S */
/* loaded from: classes9.dex */
public final class C34193S implements InterfaceC35036ya {

    /* renamed from: a */
    public final String f93458a;

    /* renamed from: b */
    public final Object f93459b;

    /* renamed from: c */
    public C34650jl f93460c;

    /* renamed from: d */
    public volatile FutureTask f93461d;

    /* renamed from: e */
    public final InterfaceC34098O f93462e;

    /* renamed from: f */
    public final InterfaceC34098O f93463f;

    /* renamed from: g */
    public final InterfaceC34098O f93464g;

    /* renamed from: h */
    public final InterfaceC33830D f93465h;

    /* renamed from: i */
    public final InterfaceC33830D f93466i;

    /* renamed from: j */
    public final InterfaceC33830D f93467j;

    /* renamed from: k */
    public Context f93468k;

    /* renamed from: l */
    public final ICommonExecutor f93469l;

    /* renamed from: m */
    public volatile AdvertisingIdsHolder f93470m;

    public C34193S(@NonNull InterfaceC34098O interfaceC34098O, @NonNull InterfaceC34098O interfaceC34098O2, @NonNull InterfaceC34098O interfaceC34098O3, @NonNull ICommonExecutor iCommonExecutor, String str) {
        this(interfaceC34098O, interfaceC34098O2, interfaceC34098O3, iCommonExecutor, new C33905G(new C34185Rf(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)), new C33905G(new C34185Rf("huawei")), new C33905G(new C34185Rf("yandex")), str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35036ya
    /* renamed from: a */
    public final void mo20742a(@NonNull Context context, @Nullable C34650jl c34650jl) {
        this.f93460c = c34650jl;
        mo20740b(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35036ya
    /* renamed from: b */
    public final void mo20740b(@NonNull Context context) {
        this.f93468k = context.getApplicationContext();
        if (this.f93461d == null) {
            synchronized (this.f93459b) {
                if (this.f93461d == null) {
                    this.f93461d = new FutureTask(new CallableC33978J(this));
                    this.f93469l.execute(this.f93461d);
                }
            }
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC34098O m22301c() {
        return this.f93463f;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: d */
    public final String m22300d() {
        return this.f93458a;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: e */
    public final InterfaceC34098O m22299e() {
        return this.f93464g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NonNull
    public final AdvertisingIdsHolder getIdentifiers(@NonNull Context context) {
        mo20740b(context);
        try {
            this.f93461d.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f93470m;
    }

    public C34193S(InterfaceC34098O interfaceC34098O, InterfaceC34098O interfaceC34098O2, InterfaceC34098O interfaceC34098O3, ICommonExecutor iCommonExecutor, C33905G c33905g, C33905G c33905g2, C33905G c33905g3, String str) {
        this.f93459b = new Object();
        this.f93462e = interfaceC34098O;
        this.f93463f = interfaceC34098O2;
        this.f93464g = interfaceC34098O3;
        this.f93465h = c33905g;
        this.f93466i = c33905g2;
        this.f93467j = c33905g3;
        this.f93469l = iCommonExecutor;
        this.f93470m = new AdvertisingIdsHolder();
        this.f93458a = "[AdvertisingIdGetter" + str + C21114v8.C21123i.f54139e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35036ya, io.appmetrica.analytics.impl.InterfaceC34785ol
    /* renamed from: a */
    public final void mo20741a(@NonNull C34650jl c34650jl) {
        this.f93460c = c34650jl;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35036ya
    @NonNull
    /* renamed from: a */
    public final AdvertisingIdsHolder mo20744a(@NonNull Context context) {
        return mo20743a(context, new C34909td());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35036ya
    @NonNull
    /* renamed from: a */
    public final AdvertisingIdsHolder mo20743a(@NonNull Context context, @NonNull InterfaceC34355Yh interfaceC34355Yh) {
        FutureTask futureTask = new FutureTask(new CallableC34002K(this, context.getApplicationContext(), interfaceC34355Yh));
        this.f93469l.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f93470m;
    }

    /* renamed from: b */
    public static AdTrackingInfoResult m22302b(C34193S c34193s, Context context) {
        if (c34193s.f93463f.mo22345a(c34193s.f93460c)) {
            return c34193s.f93466i.mo22314a(context);
        }
        C34650jl c34650jl = c34193s.f93460c;
        if (c34650jl != null && c34650jl.f94736p) {
            if (!c34650jl.f94734n.f92559e) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    /* renamed from: a */
    public static AdTrackingInfoResult m22304a(C34193S c34193s, Context context) {
        if (c34193s.f93462e.mo22345a(c34193s.f93460c)) {
            return c34193s.f93465h.mo22314a(context);
        }
        C34650jl c34650jl = c34193s.f93460c;
        if (c34650jl != null && c34650jl.f94736p) {
            if (!c34650jl.f94734n.f92557c) {
                return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, "startup forbade advertising identifiers collecting");
            }
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new AdTrackingInfoResult(null, IdentifierStatus.NO_STARTUP, "startup has not been received yet");
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final InterfaceC34098O m22303b() {
        return this.f93462e;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final ICommonExecutor m22305a() {
        return this.f93469l;
    }
}
