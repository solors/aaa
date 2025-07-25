package com.iab.omid.library.taurusx.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.adsession.DeviceCategory;
import com.iab.omid.library.taurusx.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.taurusx.utils.e */
/* loaded from: classes6.dex */
public class C18655e {

    /* renamed from: a */
    private static OutputDeviceStatus f46678a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.taurusx.utils.e$a */
    /* loaded from: classes6.dex */
    class C18656a extends BroadcastReceiver {
        C18656a() {
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
                OutputDeviceStatus unused = C18655e.f46678a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m61876a() {
        return C18649a.m61905a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46678a;
    }

    /* renamed from: a */
    public static void m61875a(@NonNull Context context) {
        context.registerReceiver(new C18656a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
