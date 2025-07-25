package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.xiaomi.adsession.DeviceCategory;
import com.iab.omid.library.xiaomi.adsession.OutputDeviceStatus;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.c2oc2o */
/* loaded from: classes8.dex */
public class C32607c2oc2o {
    private static OutputDeviceStatus coo2iico = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.c2oc2o$coo2iico */
    /* loaded from: classes8.dex */
    class C32608coo2iico extends BroadcastReceiver {
        C32608coo2iico() {
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
                OutputDeviceStatus unused = C32607c2oc2o.coo2iico = outputDeviceStatus;
            }
        }
    }

    public static OutputDeviceStatus coo2iico() {
        return C32615coo2iico.coo2iico() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : coo2iico;
    }

    public static void coo2iico(@NonNull Context context) {
        context.registerReceiver(new C32608coo2iico(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
