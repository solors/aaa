package com.yandex.mobile.ads.impl;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lc0 {
    @NotNull
    /* renamed from: a */
    public static Intent m32295a() {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
