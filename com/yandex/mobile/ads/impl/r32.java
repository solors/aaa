package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r32 {
    @NotNull

    /* renamed from: a */
    private final q32 f84618a;

    public r32() {
        this(new q32());
    }

    /* renamed from: a */
    public final boolean m30157a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            this.f84618a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public r32(@NotNull q32 intentCreator) {
        Intrinsics.checkNotNullParameter(intentCreator, "intentCreator");
        this.f84618a = intentCreator;
    }
}
