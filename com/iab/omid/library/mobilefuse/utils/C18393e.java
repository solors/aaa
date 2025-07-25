package com.iab.omid.library.mobilefuse.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.mobilefuse.adsession.DeviceCategory;
import com.iab.omid.library.mobilefuse.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.mobilefuse.utils.e */
/* loaded from: classes6.dex */
public class C18393e {

    /* renamed from: a */
    private static OutputDeviceStatus f46144a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.mobilefuse.utils.e$a */
    /* loaded from: classes6.dex */
    class C18394a extends BroadcastReceiver {
        C18394a() {
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
                OutputDeviceStatus unused = C18393e.f46144a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m62875a() {
        return C18387a.m62906a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46144a;
    }

    /* renamed from: a */
    public static void m62874a(@NonNull Context context) {
        context.registerReceiver(new C18394a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
