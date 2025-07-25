package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d */
/* loaded from: classes6.dex */
public final class MraidVolumeChangeReceiver {

    /* renamed from: a */
    public static double f57707a = -1.0d;

    /* renamed from: b */
    private Context f57708b;

    /* renamed from: c */
    private AudioManager f57709c;

    /* renamed from: d */
    private boolean f57710d = false;

    /* renamed from: e */
    private InterfaceC22228b f57711e;

    /* renamed from: f */
    private C22227a f57712f;

    /* compiled from: MraidVolumeChangeReceiver.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$a */
    /* loaded from: classes6.dex */
    private static class C22227a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<MraidVolumeChangeReceiver> f57713a;

        public C22227a(MraidVolumeChangeReceiver mraidVolumeChangeReceiver) {
            this.f57713a = new WeakReference<>(mraidVolumeChangeReceiver);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver;
            InterfaceC22228b m51083b;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (mraidVolumeChangeReceiver = this.f57713a.get()) != null && (m51083b = mraidVolumeChangeReceiver.m51083b()) != null) {
                double m51085a = mraidVolumeChangeReceiver.m51085a();
                if (m51085a >= 0.0d) {
                    m51083b.mo49142a(m51085a);
                }
            }
        }
    }

    /* compiled from: MraidVolumeChangeReceiver.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22228b {
        /* renamed from: a */
        void mo49142a(double d);
    }

    public MraidVolumeChangeReceiver(Context context) {
        this.f57708b = context;
        this.f57709c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public final double m51085a() {
        AudioManager audioManager = this.f57709c;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f57709c;
        double streamVolume = ((audioManager2 != null ? audioManager2.getStreamVolume(3) : -1) * 100.0d) / streamMaxVolume;
        f57707a = streamVolume;
        return streamVolume;
    }

    /* renamed from: b */
    public final InterfaceC22228b m51083b() {
        return this.f57711e;
    }

    /* renamed from: c */
    public final void m51082c() {
        if (this.f57708b != null) {
            this.f57712f = new C22227a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f57708b.registerReceiver(this.f57712f, intentFilter);
            this.f57710d = true;
        }
    }

    /* renamed from: d */
    public final void m51081d() {
        Context context;
        if (this.f57710d && (context = this.f57708b) != null) {
            try {
                context.unregisterReceiver(this.f57712f);
                this.f57711e = null;
                this.f57710d = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m51084a(InterfaceC22228b interfaceC22228b) {
        this.f57711e = interfaceC22228b;
    }
}
