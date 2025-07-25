package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.b8 */
/* loaded from: classes6.dex */
public final class C19620b8 {
    @Nullable

    /* renamed from: a */
    private final Boolean f49253a;
    @Nullable

    /* renamed from: b */
    private final Integer f49254b;
    @Nullable

    /* renamed from: c */
    private final EnumC19963g8 f49255c;

    public C19620b8(@NotNull JSONObject features) {
        Boolean bool;
        Integer num;
        Intrinsics.checkNotNullParameter(features, "features");
        if (features.has("enabled")) {
            bool = Boolean.valueOf(features.getBoolean("enabled"));
        } else {
            bool = null;
        }
        this.f49253a = bool;
        if (features.has("maxImpressions")) {
            num = Integer.valueOf(features.getInt("maxImpressions"));
        } else {
            num = null;
        }
        this.f49254b = num;
        this.f49255c = features.has("unit") ? EnumC19963g8.f50190c.m58448a(features.optString("unit")) : null;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m59350a() {
        return this.f49253a;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m59349b() {
        return this.f49254b;
    }

    @Nullable
    /* renamed from: c */
    public final EnumC19963g8 m59348c() {
        return this.f49255c;
    }
}
