package com.iab.omid.library.applovin.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.DeviceCategory;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.applovin.utils.e */
/* loaded from: classes6.dex */
public class C17834e {

    /* renamed from: a */
    private static OutputDeviceStatus f44987a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.applovin.utils.e$a */
    /* loaded from: classes6.dex */
    class C17835a extends BroadcastReceiver {
        C17835a() {
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
                OutputDeviceStatus unused = C17834e.f44987a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m65024a() {
        return C17828a.m65054a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f44987a;
    }

    /* renamed from: a */
    public static void m65023a(@NonNull Context context) {
        context.registerReceiver(new C17835a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
