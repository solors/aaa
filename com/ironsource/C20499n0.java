package com.ironsource;

import com.ironsource.InterfaceC20233l0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.n0 */
/* loaded from: classes6.dex */
public final class C20499n0 implements InterfaceC20233l0, InterfaceC20233l0.InterfaceC20234a {
    @NotNull

    /* renamed from: a */
    private final ReadWriteLock f52102a;
    @NotNull

    /* renamed from: b */
    private final Map<String, C20177k0> f52103b;

    public C20499n0() {
        this(null, 1, null);
    }

    @Override // com.ironsource.InterfaceC20233l0
    @Nullable
    /* renamed from: a */
    public C20177k0 mo56233a(@NotNull String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f52102a.readLock().lock();
        try {
            return this.f52103b.get(adId);
        } finally {
            this.f52102a.readLock().unlock();
        }
    }

    public C20499n0(@NotNull ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f52102a = readWriteLock;
        this.f52103b = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC20233l0
    @NotNull
    /* renamed from: a */
    public List<C20177k0> mo56236a() {
        List<C20177k0> m17553Z0;
        this.f52102a.readLock().lock();
        m17553Z0 = _Collections.m17553Z0(this.f52103b.values());
        this.f52102a.readLock().unlock();
        return m17553Z0;
    }

    public /* synthetic */ C20499n0(ReadWriteLock readWriteLock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.InterfaceC20233l0.InterfaceC20234a
    /* renamed from: a */
    public void mo56235a(@NotNull EnumC20126j1 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f52102a.writeLock().lock();
        try {
            C20177k0 c20177k0 = this.f52103b.get(adId);
            if (c20177k0 != null) {
                c20177k0.m57776a(adStatus);
                c20177k0.m57777a(System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.f52102a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC20233l0.InterfaceC20234a
    /* renamed from: a */
    public void mo56234a(@NotNull C20177k0 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f52102a.writeLock().lock();
        try {
            if (this.f52103b.get(adInfo.m57770c()) == null) {
                this.f52103b.put(adInfo.m57770c(), adInfo);
            }
        } finally {
            this.f52102a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC20233l0.InterfaceC20234a
    /* renamed from: a */
    public void mo56232a(@NotNull JSONObject json, @NotNull EnumC20126j1 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f52102a.writeLock().lock();
        try {
            C20177k0 c20177k0 = this.f52103b.get(adId);
            if (c20177k0 != null) {
                String bundleId = json.optString("bundleId");
                Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
                boolean z = true;
                if (bundleId.length() > 0) {
                    c20177k0.m57772a(bundleId);
                }
                String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() <= 0) {
                    z = false;
                }
                if (z) {
                    c20177k0.m57773a(EnumC21177we.f54334b.m54343a(dynamicDemandSourceId));
                }
                c20177k0.m57776a(adStatus);
            }
        } finally {
            this.f52102a.writeLock().unlock();
        }
    }
}
