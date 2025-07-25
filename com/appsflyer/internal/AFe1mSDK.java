package com.appsflyer.internal;

/* loaded from: classes2.dex */
public class AFe1mSDK {
    public final long AFInAppEventParameterName;

    public AFe1mSDK(long j) {
        this.AFInAppEventParameterName = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFInAppEventParameterName == ((AFe1mSDK) obj).AFInAppEventParameterName) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.AFInAppEventParameterName;
        return (int) (j ^ (j >>> 32));
    }
}
