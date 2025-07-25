package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.xb */
/* loaded from: classes6.dex */
public final class C21219xb {
    @Nullable

    /* renamed from: a */
    private final JSONObject f54485a;

    public C21219xb(@Nullable JSONObject jSONObject) {
        this.f54485a = jSONObject;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m54150a(@NotNull String key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f54485a;
        if (jSONObject != null) {
            obj = jSONObject.opt(key);
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            return null;
        }
        return (Boolean) obj;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m54149b(@NotNull String key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f54485a;
        if (jSONObject != null) {
            obj = jSONObject.opt(key);
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            return null;
        }
        return (Integer) obj;
    }

    @Nullable
    /* renamed from: c */
    public final String m54148c(@NotNull String key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f54485a;
        if (jSONObject != null) {
            obj = jSONObject.opt(key);
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }
}
