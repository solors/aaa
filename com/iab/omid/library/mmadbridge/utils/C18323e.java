package com.iab.omid.library.mmadbridge.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.DeviceCategory;
import com.iab.omid.library.mmadbridge.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.mmadbridge.utils.e */
/* loaded from: classes6.dex */
public class C18323e {

    /* renamed from: a */
    private static OutputDeviceStatus f46009a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.mmadbridge.utils.e$a */
    /* loaded from: classes6.dex */
    class C18324a extends BroadcastReceiver {
        C18324a() {
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
                OutputDeviceStatus unused = C18323e.f46009a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m63128a() {
        return C18317a.m63159a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46009a;
    }

    /* renamed from: a */
    public static void m63127a(@NonNull Context context) {
        context.registerReceiver(new C18324a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
