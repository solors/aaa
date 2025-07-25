package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.impl.AbstractC4247db;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import java.util.Arrays;

/* renamed from: com.applovin.impl.n1 */
/* loaded from: classes2.dex */
public final class C4983n1 {

    /* renamed from: c */
    public static final C4983n1 f8487c = new C4983n1(new int[]{2}, 8);

    /* renamed from: d */
    private static final C4983n1 f8488d = new C4983n1(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    private static final int[] f8489e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a */
    private final int[] f8490a;

    /* renamed from: b */
    private final int f8491b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.n1$a */
    /* loaded from: classes2.dex */
    public static final class C4984a {
        /* renamed from: a */
        public static int[] m97040a() {
            int[] iArr;
            boolean isDirectPlaybackSupported;
            AbstractC4247db.C4248a m99831f = AbstractC4247db.m99831f();
            for (int i : C4983n1.f8489e) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    m99831f.m99827b(Integer.valueOf(i));
                }
            }
            m99831f.m99827b(2);
            return AbstractC5555tb.m94481a(m99831f.m99828a());
        }
    }

    public C4983n1(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8490a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f8490a = new int[0];
        }
        this.f8491b = i;
    }

    /* renamed from: a */
    public static C4983n1 m97044a(Context context) {
        return m97043a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* renamed from: b */
    private static boolean m97042b() {
        if (AbstractC5863xp.f12151a >= 17) {
            String str = AbstractC5863xp.f12153c;
            if ("Amazon".equals(str) || C32573coo2iico.c2oc2o.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int m97041c() {
        return this.f8491b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4983n1)) {
            return false;
        }
        C4983n1 c4983n1 = (C4983n1) obj;
        if (Arrays.equals(this.f8490a, c4983n1.f8490a) && this.f8491b == c4983n1.f8491b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8491b + (Arrays.hashCode(this.f8490a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f8491b + ", supportedEncodings=" + Arrays.toString(this.f8490a) + C21114v8.C21123i.f54139e;
    }

    /* renamed from: a */
    public boolean m97045a(int i) {
        return Arrays.binarySearch(this.f8490a, i) >= 0;
    }

    /* renamed from: a */
    static C4983n1 m97043a(Context context, Intent intent) {
        if (m97042b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f8488d;
        }
        if (AbstractC5863xp.f12151a >= 29 && AbstractC5863xp.m92967d(context)) {
            return new C4983n1(C4984a.m97040a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new C4983n1(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f8487c;
    }
}
