package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface AFd1xSDK {

    /* loaded from: classes2.dex */
    public static final class AFa1ySDK {
        @Nullable
        public final String AFInAppEventType;
        public final float valueOf;

        public AFa1ySDK(float f, @Nullable String str) {
            this.valueOf = f;
            this.AFInAppEventType = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
            if (Intrinsics.m17075f(Float.valueOf(this.valueOf), Float.valueOf(aFa1ySDK.valueOf)) && Intrinsics.m17075f(this.AFInAppEventType, aFa1ySDK.AFInAppEventType)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = Float.hashCode(this.valueOf) * 31;
            String str = this.AFInAppEventType;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BatteryData(level=");
            sb2.append(this.valueOf);
            sb2.append(", charging=");
            sb2.append(this.AFInAppEventType);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @NotNull
    AFa1ySDK values(@NotNull Context context);
}
