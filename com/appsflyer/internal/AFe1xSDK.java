package com.appsflyer.internal;

import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFe1xSDK {
    public static boolean valueOf(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int AFInAppEventParameterName = AFc1sSDK.AFInAppEventParameterName(str);
        int AFInAppEventParameterName2 = AFc1sSDK.AFInAppEventParameterName(str2);
        Tuples<Integer, Integer> AFKeystoreWrapper = AFe1ySDK.AFKeystoreWrapper(str2);
        Tuples<Integer, Integer> AFInAppEventParameterName3 = AFe1ySDK.AFInAppEventParameterName(str2);
        if (AFInAppEventParameterName2 != -1 && AFKeystoreWrapper == null) {
            if (AFInAppEventParameterName2 == AFInAppEventParameterName) {
                return true;
            }
            return false;
        } else if (AFInAppEventParameterName3 != null) {
            if (AFInAppEventParameterName3.m17630c().intValue() <= AFInAppEventParameterName && AFInAppEventParameterName <= AFInAppEventParameterName3.m17629d().intValue()) {
                return true;
            }
            return false;
        } else if (AFKeystoreWrapper != null && AFKeystoreWrapper.m17630c().intValue() <= AFInAppEventParameterName && AFInAppEventParameterName <= AFKeystoreWrapper.m17629d().intValue()) {
            return true;
        } else {
            return false;
        }
    }
}
