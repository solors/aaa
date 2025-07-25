package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.p */
/* loaded from: classes6.dex */
public final class C20615p {
    @Nullable

    /* renamed from: a */
    private final Boolean f52365a;

    public C20615p(@NotNull JSONObject adFormatAuctionSettings) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        if (adFormatAuctionSettings.has("isLoadWhileShow")) {
            bool = Boolean.valueOf(adFormatAuctionSettings.optBoolean("isLoadWhileShow"));
        } else {
            bool = null;
        }
        this.f52365a = bool;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m55886a() {
        return this.f52365a;
    }
}
