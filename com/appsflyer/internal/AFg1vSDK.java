package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes2.dex */
public final class AFg1vSDK {

    /* loaded from: classes2.dex */
    interface AFa1tSDK {
        void AFInAppEventType(String str, Exception exc);

        void values(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFInAppEventType(long j, @NonNull Context context, @NonNull final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1vSDK.2
                public final void onLvlFailure(Exception exc) {
                    aFa1tSDK.AFInAppEventType("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.values(str, str2);
                    } else if (str2 == null) {
                        aFa1tSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
