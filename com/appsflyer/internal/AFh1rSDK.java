package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public abstract class AFh1rSDK extends AFa1pSDK {

    /* renamed from: i */
    private final boolean f13064i;

    /* renamed from: w */
    private final boolean f13065w;

    AFh1rSDK() {
        this(null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AFh1rSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.f13064i = bool != null ? bool.booleanValue() : true;
        this.f13065w = true;
    }
}
