package com.iab.omid.library.fyber.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.adsession.DeviceCategory;
import com.iab.omid.library.fyber.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.fyber.utils.e */
/* loaded from: classes6.dex */
public class C18136e {

    /* renamed from: a */
    private static OutputDeviceStatus f45620a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.fyber.utils.e$a */
    /* loaded from: classes6.dex */
    class C18137a extends BroadcastReceiver {
        C18137a() {
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
                OutputDeviceStatus unused = C18136e.f45620a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m63857a() {
        return C18130a.m63888a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f45620a;
    }

    /* renamed from: a */
    public static void m63856a(@NonNull Context context) {
        context.registerReceiver(new C18137a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
