package com.pubmatic.sdk.crashanalytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: POBCrashStorage.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBCrashStorage {
    @NotNull
    public static final POBCrashStorage INSTANCE = new POBCrashStorage();
    @NotNull

    /* renamed from: a */
    private static JSONArray f70354a = new JSONArray();

    private POBCrashStorage() {
    }

    public final void clear() {
        f70354a = new JSONArray();
    }

    @NotNull
    public final JSONArray getCrashJsonArray() {
        return f70354a;
    }

    public final void setCrashJsonArray(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<set-?>");
        f70354a = jSONArray;
    }
}
