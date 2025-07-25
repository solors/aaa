package com.unity3d.ads.core.data.datasource;

import com.ironsource.C21085un;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidKnownStore.kt */
@Metadata
/* loaded from: classes7.dex */
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET(C21085un.f53798a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");
    
    @NotNull
    private final String packageName;

    AndroidKnownStore(String str) {
        this.packageName = str;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }
}
