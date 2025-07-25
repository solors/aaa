package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: com.applovin.impl.m1 */
/* loaded from: classes2.dex */
final class C4804m1 {

    /* renamed from: a */
    private final Context f7858a;

    /* renamed from: b */
    private final RunnableC4805a f7859b;

    /* renamed from: c */
    private boolean f7860c;

    /* renamed from: com.applovin.impl.m1$a */
    /* loaded from: classes2.dex */
    private final class RunnableC4805a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        private final InterfaceC4806b f7861a;

        /* renamed from: b */
        private final Handler f7862b;

        public RunnableC4805a(Handler handler, InterfaceC4806b interfaceC4806b) {
            this.f7862b = handler;
            this.f7861a = interfaceC4806b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f7862b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4804m1.this.f7860c) {
                this.f7861a.mo97615c();
            }
        }
    }

    /* renamed from: com.applovin.impl.m1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4806b {
        /* renamed from: c */
        void mo97615c();
    }

    public C4804m1(Context context, Handler handler, InterfaceC4806b interfaceC4806b) {
        this.f7858a = context.getApplicationContext();
        this.f7859b = new RunnableC4805a(handler, interfaceC4806b);
    }

    /* renamed from: a */
    public void m97616a(boolean z) {
        if (z && !this.f7860c) {
            this.f7858a.registerReceiver(this.f7859b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f7860c = true;
        } else if (z || !this.f7860c) {
        } else {
            this.f7858a.unregisterReceiver(this.f7859b);
            this.f7860c = false;
        }
    }
}
