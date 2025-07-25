package com.iab.omid.library.pubmatic.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.adsession.DeviceCategory;
import com.iab.omid.library.pubmatic.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.pubmatic.utils.e */
/* loaded from: classes6.dex */
public class C18463e {

    /* renamed from: a */
    private static OutputDeviceStatus f46279a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.pubmatic.utils.e$a */
    /* loaded from: classes6.dex */
    class C18464a extends BroadcastReceiver {
        C18464a() {
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
                OutputDeviceStatus unused = C18463e.f46279a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m62622a() {
        return C18457a.m62653a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46279a;
    }

    /* renamed from: a */
    public static void m62621a(@NonNull Context context) {
        context.registerReceiver(new C18464a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
