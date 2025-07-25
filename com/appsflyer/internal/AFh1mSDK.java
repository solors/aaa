package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class AFh1mSDK extends AFa1pSDK {
    @Nullable
    public final AFf1ySDK force;

    @Deprecated
    public AFh1mSDK() {
        this.force = null;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1ySDK values() {
        AFf1ySDK aFf1ySDK = this.force;
        if (aFf1ySDK != null) {
            return aFf1ySDK;
        }
        return AFf1ySDK.CACHED_EVENT;
    }

    public AFh1mSDK(String str, byte[] bArr, String str2, @Nullable AFf1ySDK aFf1ySDK) {
        super(null, str, Boolean.FALSE);
        this.AFInAppEventType = str2;
        AFKeystoreWrapper(bArr);
        this.force = aFf1ySDK;
    }
}
