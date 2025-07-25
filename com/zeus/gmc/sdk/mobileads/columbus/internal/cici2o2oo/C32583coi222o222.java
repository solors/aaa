package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.CreativeOrientation;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.coi222o222 */
/* loaded from: classes8.dex */
public class C32583coi222o222 {
    private static final String coo2iico = "DeviceUtils";

    private C32583coi222o222() {
    }

    public static boolean coo2iico(@NonNull Context context, @NonNull String str) {
        try {
            return ContextCompat.checkSelfPermission(context, str) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int coo2iico(@NonNull Activity activity) {
        return coo2iico(activity.getWindowManager().getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
    }

    static int coo2iico(int i, int i2) {
        if (1 == i2) {
            return (i == 1 || i == 2) ? 9 : 1;
        } else if (2 == i2) {
            return (i == 2 || i == 3) ? 8 : 0;
        } else {
            MLog.m25892d(coo2iico, "Unknown screen orientation. Defaulting to portrait.");
            return 9;
        }
    }

    public static void coo2iico(@NonNull Activity activity, @NonNull CreativeOrientation creativeOrientation) {
        int i;
        if (activity != null && creativeOrientation != null) {
            int coo2iico2 = coo2iico(((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
            if (CreativeOrientation.PORTRAIT == creativeOrientation) {
                i = 9;
                if (9 != coo2iico2) {
                    i = 1;
                }
            } else if (CreativeOrientation.LANDSCAPE != creativeOrientation) {
                return;
            } else {
                i = 8;
                if (8 != coo2iico2) {
                    i = 0;
                }
            }
            activity.setRequestedOrientation(i);
            return;
        }
        MLog.m25883w(coo2iico, "activity or creativeOrientation is null");
    }
}
