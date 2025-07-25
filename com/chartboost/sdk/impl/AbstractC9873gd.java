package com.chartboost.sdk.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.chartboost.sdk.impl.gd */
/* loaded from: classes3.dex */
public abstract class AbstractC9873gd {

    /* renamed from: a */
    public static EnumC9831e8 f22129a = EnumC9831e8.UNKNOWN;

    /* renamed from: com.chartboost.sdk.impl.gd$a */
    /* loaded from: classes3.dex */
    public class C9874a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            EnumC9831e8 enumC9831e8;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    enumC9831e8 = EnumC9831e8.NOT_DETECTED;
                } else if (intExtra == 1) {
                    enumC9831e8 = EnumC9831e8.UNKNOWN;
                } else {
                    return;
                }
                EnumC9831e8 unused = AbstractC9873gd.f22129a = enumC9831e8;
            }
        }
    }

    /* renamed from: a */
    public static EnumC9831e8 m81600a() {
        return AbstractC9872gc.m81602a() != EnumC10375y3.CTV ? EnumC9831e8.UNKNOWN : f22129a;
    }

    /* renamed from: a */
    public static void m81599a(Context context) {
        context.registerReceiver(new C9874a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
