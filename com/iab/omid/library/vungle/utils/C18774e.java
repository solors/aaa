package com.iab.omid.library.vungle.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.DeviceCategory;
import com.iab.omid.library.vungle.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.vungle.utils.e */
/* loaded from: classes6.dex */
public class C18774e {

    /* renamed from: a */
    private static OutputDeviceStatus f46940a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.vungle.utils.e$a */
    /* loaded from: classes6.dex */
    class C18775a extends BroadcastReceiver {
        C18775a() {
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
                OutputDeviceStatus unused = C18774e.f46940a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m61394a() {
        return C18768a.m61425a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46940a;
    }

    /* renamed from: a */
    public static void m61393a(@NonNull Context context) {
        context.registerReceiver(new C18775a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
