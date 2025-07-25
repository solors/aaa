package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ts */
/* loaded from: classes6.dex */
public final class C21046ts {
    @Nullable

    /* renamed from: a */
    private final String f53639a;
    @Nullable

    /* renamed from: b */
    private final String f53640b;

    /* renamed from: c */
    private final boolean f53641c;
    @Nullable

    /* renamed from: d */
    private final Boolean f53642d;

    public C21046ts(@Nullable String str, boolean z, @Nullable Boolean bool, @Nullable String str2) {
        this.f53639a = str2;
        this.f53640b = str;
        this.f53641c = z;
        this.f53642d = bool;
    }

    @Nullable
    /* renamed from: a */
    public final String m54721a() {
        return this.f53639a;
    }

    /* renamed from: b */
    public final boolean m54719b() {
        return Intrinsics.m17075f(this.f53642d, Boolean.TRUE);
    }

    public /* synthetic */ C21046ts(String str, boolean z, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final boolean m54720a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        String str = this.f53640b;
        if (str == null || str.length() == 0) {
            return true;
        }
        C21333zs c21333zs = C21333zs.f54830a;
        return Intrinsics.m17075f(c21333zs.m53730a(networkSettings), this.f53640b) && c21333zs.m53729a(networkSettings, adUnit) == this.f53641c;
    }
}
