package com.iab.omid.library.unity3d.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.DeviceCategory;
import com.iab.omid.library.unity3d.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.unity3d.utils.e */
/* loaded from: classes6.dex */
public class C18712e {

    /* renamed from: a */
    private static OutputDeviceStatus f46806a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.unity3d.utils.e$a */
    /* loaded from: classes6.dex */
    class C18713a extends BroadcastReceiver {
        C18713a() {
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
                OutputDeviceStatus unused = C18712e.f46806a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m61642a() {
        return C18706a.m61671a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46806a;
    }

    /* renamed from: a */
    public static void m61641a(@NonNull Context context) {
        context.registerReceiver(new C18713a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
