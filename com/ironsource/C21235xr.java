package com.ironsource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.xr */
/* loaded from: classes6.dex */
public final class C21235xr implements InterfaceC19572a8 {
    @NotNull

    /* renamed from: d */
    public static final C21236a f54504d = new C21236a(null);

    /* renamed from: e */
    public static final int f54505e = -1;

    /* renamed from: f */
    public static final long f54506f = -1;
    @NotNull

    /* renamed from: a */
    private final Context f54507a;
    @NotNull

    /* renamed from: b */
    private final String f54508b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20206kg f54509c;

    @Metadata
    /* renamed from: com.ironsource.xr$a */
    /* loaded from: classes6.dex */
    public static final class C21236a {
        private C21236a() {
        }

        public /* synthetic */ C21236a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C21235xr(@NotNull Context context, @NotNull String baseName, @NotNull InterfaceC20206kg sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f54507a = context;
        this.f54508b = baseName;
        this.f54509c = sdkSharedPref;
    }

    /* renamed from: a */
    private final Integer m54094a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    @Override // com.ironsource.InterfaceC19572a8
    @Nullable
    /* renamed from: b */
    public Long mo54089b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m54093a(Long.valueOf(this.f54509c.mo54095b(this.f54507a, new C21278yr(identifier, this.f54508b + ".pacing_last_show_time").m53939a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC19572a8
    @Nullable
    /* renamed from: c */
    public Integer mo54087c(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m54094a(Integer.valueOf(this.f54509c.mo54096b(this.f54507a, new C21278yr(identifier, this.f54508b + ".show_count_show_counter").m53939a(), -1)));
    }

    public /* synthetic */ C21235xr(Context context, String str, InterfaceC20206kg interfaceC20206kg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new C21234xq() : interfaceC20206kg);
    }

    /* renamed from: a */
    private final Long m54093a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    @Override // com.ironsource.InterfaceC19572a8
    /* renamed from: b */
    public void mo54088b(@NotNull String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f54509c.mo54097a(this.f54507a, new C21278yr(identifier, this.f54508b + ".pacing_last_show_time").m53939a(), j);
    }

    @Override // com.ironsource.InterfaceC19572a8
    @Nullable
    /* renamed from: a */
    public Long mo54092a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m54093a(Long.valueOf(this.f54509c.mo54095b(this.f54507a, new C21278yr(identifier, this.f54508b + ".show_count_threshold").m53939a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC19572a8
    /* renamed from: a */
    public void mo54091a(@NotNull String identifier, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f54509c.mo54098a(this.f54507a, new C21278yr(identifier, this.f54508b + ".show_count_show_counter").m53939a(), i);
    }

    @Override // com.ironsource.InterfaceC19572a8
    /* renamed from: a */
    public void mo54090a(@NotNull String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f54509c.mo54097a(this.f54507a, new C21278yr(identifier, this.f54508b + ".show_count_threshold").m53939a(), j);
    }
}
