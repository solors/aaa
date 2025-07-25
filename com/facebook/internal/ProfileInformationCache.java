package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ProfileInformationCache.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ProfileInformationCache {
    @NotNull
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();
    @NotNull
    private static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    private ProfileInformationCache() {
    }

    @Nullable
    public static final JSONObject getProfileInformation(@NotNull String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return infoCache.get(accessToken);
    }

    public static final void putProfileInformation(@NotNull String key, @NotNull JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        infoCache.put(key, value);
    }
}
