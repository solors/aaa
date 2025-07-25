package com.iab.omid.library.appodeal.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.adsession.DeviceCategory;
import com.iab.omid.library.appodeal.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.appodeal.utils.e */
/* loaded from: classes6.dex */
public class C17904e {

    /* renamed from: a */
    private static OutputDeviceStatus f45121a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.appodeal.utils.e$a */
    /* loaded from: classes6.dex */
    class C17905a extends BroadcastReceiver {
        C17905a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                } else {
                    return;
                }
                OutputDeviceStatus unused = C17904e.f45121a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m64774a() {
        return C17898a.m64805a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f45121a;
    }

    /* renamed from: a */
    public static void m64773a(@NonNull Context context) {
        context.registerReceiver(new C17905a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
