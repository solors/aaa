package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes2.dex */
public final class AFh1iSDK extends AFh1jSDK {
    public AFh1iSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFa1pSDK AFInAppEventType(String str) {
        return super.AFInAppEventType(AFa1pSDK.valueOf(str));
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1ySDK values() {
        return AFf1ySDK.PURCHASE_VALIDATE;
    }
}
