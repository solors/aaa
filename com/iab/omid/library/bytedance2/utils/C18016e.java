package com.iab.omid.library.bytedance2.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;

/* renamed from: com.iab.omid.library.bytedance2.utils.e */
/* loaded from: classes6.dex */
public class C18016e {

    /* renamed from: a */
    private static OutputDeviceStatus f45372a = OutputDeviceStatus.UNKNOWN;

    /* renamed from: com.iab.omid.library.bytedance2.utils.e$a */
    /* loaded from: classes6.dex */
    class C18017a extends BroadcastReceiver {
        C18017a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    OutputDeviceStatus unused = C18016e.f45372a = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    OutputDeviceStatus unused2 = C18016e.f45372a = OutputDeviceStatus.UNKNOWN;
                }
            }
        }
    }

    /* renamed from: a */
    public static OutputDeviceStatus m64316a() {
        return C18010a.m64346a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f45372a;
    }

    /* renamed from: a */
    public static void m64315a(@NonNull Context context) {
        context.registerReceiver(new C18017a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
