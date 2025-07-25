package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.as */
/* loaded from: classes6.dex */
public final class C19597as implements InterfaceC20589og {
    @NotNull

    /* renamed from: a */
    private final InterfaceC19572a8 f49185a;
    @NotNull

    /* renamed from: b */
    private ConcurrentHashMap<String, Integer> f49186b;
    @NotNull

    /* renamed from: c */
    private ConcurrentHashMap<String, Long> f49187c;

    public C19597as(@NotNull InterfaceC19572a8 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f49185a = storage;
        this.f49186b = new ConcurrentHashMap<>();
        this.f49187c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC20589og
    /* renamed from: a */
    public int mo55981a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.f49186b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer mo54087c = this.f49185a.mo54087c(identifier);
        if (mo54087c == null) {
            this.f49186b.put(identifier, 0);
            return 0;
        }
        int intValue = mo54087c.intValue();
        this.f49186b.put(identifier, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.ironsource.InterfaceC20589og
    @Nullable
    /* renamed from: b */
    public Long mo55980b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.f49187c.get(identifier);
        if (l != null) {
            return l;
        }
        Long mo54092a = this.f49185a.mo54092a(identifier);
        if (mo54092a != null) {
            long longValue = mo54092a.longValue();
            this.f49187c.put(identifier, Long.valueOf(longValue));
            return Long.valueOf(longValue);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC20589og
    /* renamed from: a */
    public void mo55983a(int i, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f49186b.put(identifier, Integer.valueOf(i));
        this.f49185a.mo54091a(identifier, i);
    }

    @Override // com.ironsource.InterfaceC20589og
    /* renamed from: a */
    public void mo55982a(long j, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f49187c.put(identifier, Long.valueOf(j));
        this.f49185a.mo54090a(identifier, j);
    }
}
