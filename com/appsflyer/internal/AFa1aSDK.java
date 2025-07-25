package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFa1aSDK implements AFb1ySDK {
    @NotNull
    private Map<String, String> AFKeystoreWrapper = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFb1ySDK
    @NotNull
    public final Map<String, String> valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFKeystoreWrapper.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.AFKeystoreWrapper.put(KeyConstants.Android.KEY_XDP, String.valueOf(displayMetrics.xdpi));
            this.AFKeystoreWrapper.put(KeyConstants.Android.KEY_YDP, String.valueOf(displayMetrics.ydpi));
            this.AFKeystoreWrapper.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.AFKeystoreWrapper.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.AFKeystoreWrapper.put(KeyConstants.Android.KEY_D_DPI, String.valueOf(displayMetrics.densityDpi));
            this.AFKeystoreWrapper.put("size", String.valueOf(resources.getConfiguration().screenLayout & 15));
        }
        return this.AFKeystoreWrapper;
    }
}
