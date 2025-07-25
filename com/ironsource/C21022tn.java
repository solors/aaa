package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.tn */
/* loaded from: classes6.dex */
public final class C21022tn {
    @Nullable

    /* renamed from: a */
    private final Boolean f53572a;
    @Nullable

    /* renamed from: b */
    private final Integer f53573b;
    @NotNull

    /* renamed from: c */
    private final EnumC19963g8 f53574c;

    public C21022tn(@NotNull JSONObject features) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(features, "features");
        if (features.has("enabled")) {
            bool = Boolean.valueOf(features.getBoolean("enabled"));
        } else {
            bool = null;
        }
        this.f53572a = bool;
        this.f53573b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f53574c = EnumC19963g8.Second;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m54781a() {
        return this.f53572a;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m54780b() {
        return this.f53573b;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC19963g8 m54779c() {
        return this.f53574c;
    }
}
