package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class AFi1sSDK extends AFi1xSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    public final boolean AFInAppEventParameterName() {
        boolean z;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface.isUp() && Intrinsics.m17075f(networkInterface.getName(), "tun0")) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1xSDK
    @NotNull
    protected final String values() {
        ConnectivityManager connectivityManager = this.AFKeystoreWrapper;
        if (connectivityManager != null) {
            if (AFi1xSDK.valueOf(connectivityManager.getNetworkInfo(1))) {
                return InterfaceC32663coo2iico.coo2iico;
            }
            if (AFi1xSDK.valueOf(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    return "MOBILE";
                }
                if (type != 1) {
                    return "unknown";
                }
                return InterfaceC32663coo2iico.coo2iico;
            }
        }
        return "unknown";
    }
}
