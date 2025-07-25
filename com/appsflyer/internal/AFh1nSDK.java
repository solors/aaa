package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFh1nSDK extends AFa1pSDK {
    @Override // com.appsflyer.internal.AFa1pSDK
    public final boolean AFLogger() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1pSDK
    public final AFf1ySDK values() {
        if (this.registerClient == 1) {
            return AFf1ySDK.CONVERSION;
        }
        return AFf1ySDK.LAUNCH;
    }
}
