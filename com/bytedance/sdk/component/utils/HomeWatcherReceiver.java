package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes3.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {

    /* renamed from: bg */
    private InterfaceC7731bg f16907bg;

    /* renamed from: com.bytedance.sdk.component.utils.HomeWatcherReceiver$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7731bg {
        /* renamed from: IL */
        void mo86251IL();

        /* renamed from: bg */
        void mo86250bg();
    }

    /* renamed from: bg */
    public void m87911bg(InterfaceC7731bg interfaceC7731bg) {
        this.f16907bg = interfaceC7731bg;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: ".concat(String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: ".concat(String.valueOf(stringExtra)));
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    InterfaceC7731bg interfaceC7731bg = this.f16907bg;
                    if (interfaceC7731bg != null) {
                        interfaceC7731bg.mo86250bg();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    InterfaceC7731bg interfaceC7731bg2 = this.f16907bg;
                    if (interfaceC7731bg2 != null) {
                        interfaceC7731bg2.mo86251IL();
                    }
                } else if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            C7741PX.m87873bg("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }
}
