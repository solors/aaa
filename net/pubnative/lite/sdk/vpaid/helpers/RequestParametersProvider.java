package net.pubnative.lite.sdk.vpaid.helpers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes10.dex */
public class RequestParametersProvider {
    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public static int getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 2;
        }
        if (type == 9) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        return 3;
    }
}
