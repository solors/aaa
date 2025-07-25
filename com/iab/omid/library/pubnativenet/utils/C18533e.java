package com.iab.omid.library.pubnativenet.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.adsession.DeviceCategory;
import com.iab.omid.library.pubnativenet.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.pubnativenet.utils.e */
/* loaded from: classes6.dex */
public class C18533e {

    /* renamed from: a */
    private static OutputDeviceStatus f46414a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.pubnativenet.utils.e$a */
    /* loaded from: classes6.dex */
    class C18534a extends BroadcastReceiver {
        C18534a() {
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
                OutputDeviceStatus unused = C18533e.f46414a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m62369a() {
        return C18527a.m62400a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f46414a;
    }

    /* renamed from: a */
    public static void m62368a(@NonNull Context context) {
        context.registerReceiver(new C18534a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
