package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.impl.C4597il;

/* renamed from: com.applovin.impl.il */
/* loaded from: classes2.dex */
public final class C4597il {

    /* renamed from: a */
    private final Context f6952a;

    /* renamed from: b */
    private final Handler f6953b;

    /* renamed from: c */
    private final InterfaceC4599b f6954c;

    /* renamed from: d */
    private final AudioManager f6955d;

    /* renamed from: e */
    private C4600c f6956e;

    /* renamed from: f */
    private int f6957f;

    /* renamed from: g */
    private int f6958g;

    /* renamed from: h */
    private boolean f6959h;

    /* renamed from: com.applovin.impl.il$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4599b {
        /* renamed from: a */
        void mo98394a(int i, boolean z);

        /* renamed from: d */
        void mo98393d(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.il$c */
    /* loaded from: classes2.dex */
    public final class C4600c extends BroadcastReceiver {
        private C4600c() {
            C4597il.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m98391b(C4597il c4597il) {
            c4597il.m98395d();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C4597il.this.f6953b;
            final C4597il c4597il = C4597il.this;
            handler.post(new Runnable() { // from class: com.applovin.impl.fy
                @Override // java.lang.Runnable
                public final void run() {
                    C4597il.C4600c.m98391b(C4597il.this);
                }
            });
        }
    }

    public C4597il(Context context, Handler handler, InterfaceC4599b interfaceC4599b) {
        Context applicationContext = context.getApplicationContext();
        this.f6952a = applicationContext;
        this.f6953b = handler;
        this.f6954c = interfaceC4599b;
        AudioManager audioManager = (AudioManager) AbstractC4100b1.m100578b((AudioManager) applicationContext.getSystemService("audio"));
        this.f6955d = audioManager;
        this.f6957f = 3;
        this.f6958g = m98398b(audioManager, 3);
        this.f6959h = m98401a(audioManager, this.f6957f);
        C4600c c4600c = new C4600c();
        try {
            applicationContext.registerReceiver(c4600c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f6956e = c4600c;
        } catch (RuntimeException e) {
            AbstractC5063oc.m96801c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: d */
    public void m98395d() {
        int m98398b = m98398b(this.f6955d, this.f6957f);
        boolean m98401a = m98401a(this.f6955d, this.f6957f);
        if (this.f6958g != m98398b || this.f6959h != m98401a) {
            this.f6958g = m98398b;
            this.f6959h = m98401a;
            this.f6954c.mo98394a(m98398b, m98401a);
        }
    }

    /* renamed from: c */
    public void m98396c() {
        C4600c c4600c = this.f6956e;
        if (c4600c != null) {
            try {
                this.f6952a.unregisterReceiver(c4600c);
            } catch (RuntimeException e) {
                AbstractC5063oc.m96801c("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f6956e = null;
        }
    }

    /* renamed from: b */
    private static int m98398b(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            AbstractC5063oc.m96801c("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: a */
    public int m98403a() {
        return this.f6955d.getStreamMaxVolume(this.f6957f);
    }

    /* renamed from: a */
    public void m98402a(int i) {
        if (this.f6957f == i) {
            return;
        }
        this.f6957f = i;
        m98395d();
        this.f6954c.mo98393d(i);
    }

    /* renamed from: b */
    public int m98399b() {
        int streamMinVolume;
        if (AbstractC5863xp.f12151a >= 28) {
            streamMinVolume = this.f6955d.getStreamMinVolume(this.f6957f);
            return streamMinVolume;
        }
        return 0;
    }

    /* renamed from: a */
    private static boolean m98401a(AudioManager audioManager, int i) {
        if (AbstractC5863xp.f12151a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m98398b(audioManager, i) == 0;
    }
}
