package com.unity3d.services.ads.token;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: TokenStorage.kt */
@Metadata
/* loaded from: classes7.dex */
public interface TokenStorage {
    void appendTokens(@NotNull JSONArray jSONArray) throws JSONException;

    void createTokens(@NotNull JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    @NotNull
    Unit getNativeGeneratedToken();

    @Nullable
    String getToken();

    void setInitToken(@Nullable String str);
}
