package com.iab.omid.library.smaato.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.smaato.adsession.DeviceCategory;
import com.iab.omid.library.smaato.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.smaato.utils.e */
/* loaded from: classes6.dex */
public class C18596e {

    /* renamed from: a */
    private static OutputDeviceStatus f46549a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.smaato.utils.e$a */
    /* loaded from: classes6.dex */
    class C18597a extends BroadcastReceiver {
        C18597a() {
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
                OutputDeviceStatus unused = C18596e.f46549a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m62116a() {
        return C18590a.m62147a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46549a;
    }

    /* renamed from: a */
    public static void m62115a(@NonNull Context context) {
        context.registerReceiver(new C18597a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
