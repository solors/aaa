package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* loaded from: classes7.dex */
public class HFPStatus {

    /* renamed from: a */
    private Context f74531a;

    /* renamed from: d */
    private AudioManager f74534d;

    /* renamed from: b */
    private BroadcastReceiver f74532b = null;

    /* renamed from: c */
    private boolean f74533c = false;

    /* renamed from: e */
    private boolean f74535e = false;

    /* renamed from: f */
    private EnumC28707a f74536f = EnumC28707a.f74538a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.unity3d.player.HFPStatus$a */
    /* loaded from: classes7.dex */
    public static final class EnumC28707a {

        /* renamed from: a */
        public static final EnumC28707a f74538a = new EnumC28707a("DISCONNECTED", 0);

        /* renamed from: b */
        public static final EnumC28707a f74539b = new EnumC28707a("CONNECTED", 1);

        private EnumC28707a(String str, int i) {
        }
    }

    public HFPStatus(Context context) {
        this.f74534d = null;
        this.f74531a = context;
        this.f74534d = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    protected void clearHFPStat() {
        BroadcastReceiver broadcastReceiver = this.f74532b;
        if (broadcastReceiver != null) {
            this.f74531a.unregisterReceiver(broadcastReceiver);
            this.f74532b = null;
        }
        this.f74536f = EnumC28707a.f74538a;
        if (this.f74535e) {
            this.f74535e = false;
            this.f74534d.stopBluetoothSco();
        }
    }

    protected boolean getHFPStat() {
        if (this.f74536f == EnumC28707a.f74539b) {
            return true;
        }
        return false;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1) {
                    HFPStatus hFPStatus = HFPStatus.this;
                    hFPStatus.f74536f = EnumC28707a.f74539b;
                    if (hFPStatus.f74535e) {
                        hFPStatus.f74535e = false;
                        hFPStatus.f74534d.stopBluetoothSco();
                    }
                    HFPStatus hFPStatus2 = HFPStatus.this;
                    if (hFPStatus2.f74533c) {
                        hFPStatus2.f74534d.setMode(3);
                    }
                }
            }
        };
        this.f74532b = broadcastReceiver;
        this.f74531a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f74535e = true;
            this.f74534d.startBluetoothSco();
        } catch (NullPointerException unused) {
            AbstractC28798u.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.f74533c = z;
        if (!z) {
            this.f74534d.setMode(0);
        }
    }

    /* renamed from: a */
    public void m37748a() {
        clearHFPStat();
        deinitHFPStatusJni();
    }
}
