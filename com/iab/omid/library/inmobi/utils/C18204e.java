package com.iab.omid.library.inmobi.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.adsession.DeviceCategory;
import com.iab.omid.library.inmobi.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.inmobi.utils.e */
/* loaded from: classes6.dex */
public class C18204e {

    /* renamed from: a */
    private static OutputDeviceStatus f45750a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.inmobi.utils.e$a */
    /* loaded from: classes6.dex */
    class C18205a extends BroadcastReceiver {
        C18205a() {
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
                OutputDeviceStatus unused = C18204e.f45750a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m63613a() {
        return C18198a.m63643a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f45750a;
    }

    /* renamed from: a */
    public static void m63612a(@NonNull Context context) {
        context.registerReceiver(new C18205a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
