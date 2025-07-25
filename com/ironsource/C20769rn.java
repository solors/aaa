package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.rn */
/* loaded from: classes6.dex */
public final class C20769rn implements InterfaceC20520ne {
    @NotNull

    /* renamed from: a */
    private final InterfaceC19572a8 f52794a;
    @NotNull

    /* renamed from: b */
    private ConcurrentHashMap<String, Long> f52795b;

    public C20769rn(@NotNull InterfaceC19572a8 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f52794a = storage;
        this.f52795b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.InterfaceC20520ne
    @Nullable
    /* renamed from: a */
    public Long mo55448a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.f52795b.get(identifier);
        if (l != null) {
            return l;
        }
        Long mo54089b = this.f52794a.mo54089b(identifier);
        if (mo54089b != null) {
            long longValue = mo54089b.longValue();
            this.f52795b.put(identifier, Long.valueOf(longValue));
            return Long.valueOf(longValue);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC20520ne
    /* renamed from: a */
    public void mo55449a(long j, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f52795b.put(identifier, Long.valueOf(j));
        this.f52794a.mo54088b(identifier, j);
    }
}
