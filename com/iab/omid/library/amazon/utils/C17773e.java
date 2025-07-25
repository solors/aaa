package com.iab.omid.library.amazon.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.amazon.adsession.DeviceCategory;
import com.iab.omid.library.amazon.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.amazon.utils.e */
/* loaded from: classes6.dex */
public class C17773e {

    /* renamed from: a */
    private static OutputDeviceStatus f44858a = OutputDeviceStatus.UNKNOWN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.amazon.utils.e$a */
    /* loaded from: classes6.dex */
    public class C17774a extends BroadcastReceiver {
        C17774a() {
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
                OutputDeviceStatus unused = C17773e.f44858a = outputDeviceStatus;
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m65265a() {
        return C17767a.m65295a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f44858a;
    }

    /* renamed from: a */
    public static void m65264a(@NonNull Context context) {
        context.registerReceiver(new C17774a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
