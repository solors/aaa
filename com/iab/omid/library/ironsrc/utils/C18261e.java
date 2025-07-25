package com.iab.omid.library.ironsrc.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.ironsrc.utils.e */
/* loaded from: classes6.dex */
public class C18261e {

    /* renamed from: a */
    private static OutputDeviceStatus f45875a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.ironsrc.utils.e$a */
    /* loaded from: classes6.dex */
    class C18262a extends BroadcastReceiver {
        C18262a() {
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
                OutputDeviceStatus unused = C18261e.f45875a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m63376a() {
        return C18255a.m63405a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f45875a;
    }

    /* renamed from: a */
    public static void m63375a(@NonNull Context context) {
        context.registerReceiver(new C18262a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
