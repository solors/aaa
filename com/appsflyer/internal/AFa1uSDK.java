package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes2.dex */
public final class AFa1uSDK implements AFd1xSDK {
    @VisibleForTesting
    private static IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFd1xSDK
    @NonNull
    public final AFd1xSDK.AFa1ySDK values(@NonNull Context context) {
        boolean z;
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, AFInAppEventParameterName);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                str = "other";
                            } else {
                                str = "wireless";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
                    }
                } else {
                    str = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFd1xSDK.AFa1ySDK(f, str);
    }
}
