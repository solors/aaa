package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AudioCapabilities {
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 8);

    /* renamed from: c */
    private static final AudioCapabilities f32351c = new AudioCapabilities(new int[]{2, 5, 6}, 8);

    /* renamed from: d */
    private static final ImmutableMap<Integer, Integer> f32352d = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* renamed from: a */
    private final int[] f32353a;

    /* renamed from: b */
    private final int f32354b;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* loaded from: classes4.dex */
    public static final class Api29 {

        /* renamed from: a */
        private static final android.media.AudioAttributes f32355a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        private Api29() {
        }

        @DoNotInline
        public static int[] getDirectPlaybackSupportedEncodings() {
            boolean isDirectPlaybackSupported;
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = AudioCapabilities.f32352d.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f32355a);
                if (isDirectPlaybackSupported) {
                    builder.add((ImmutableList.Builder) Integer.valueOf(intValue));
                }
            }
            builder.add((ImmutableList.Builder) 2);
            return Ints.toArray(builder.build());
        }

        @DoNotInline
        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 8; i3 > 0; i3--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.getAudioTrackChannelConfig(i3)).build(), f32355a);
                if (isDirectPlaybackSupported) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public AudioCapabilities(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f32353a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f32353a = new int[0];
        }
        this.f32354b = i;
    }

    /* renamed from: b */
    private static boolean m75085b() {
        if (Util.SDK_INT >= 17) {
            String str = Util.MANUFACTURER;
            if ("Amazon".equals(str) || C32573coo2iico.c2oc2o.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    public static AudioCapabilities m75084c(Context context, @Nullable Intent intent) {
        if (m75085b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f32351c;
        }
        if (Util.SDK_INT >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return new AudioCapabilities(Api29.getDirectPlaybackSupportedEncodings(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return DEFAULT_AUDIO_CAPABILITIES;
    }

    /* renamed from: d */
    private static int m75083d(int i) {
        int i2 = Util.SDK_INT;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(Util.DEVICE) && i == 1) {
            i = 2;
        }
        return Util.getAudioTrackChannelConfig(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public static Uri m75082e() {
        if (m75085b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    /* renamed from: f */
    private static int m75081f(int i, int i2) {
        if (Util.SDK_INT >= 29) {
            return Api29.getMaxSupportedChannelCountForPassthrough(i, i2);
        }
        return ((Integer) Assertions.checkNotNull(f32352d.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return m75084c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        if (Arrays.equals(this.f32353a, audioCapabilities.f32353a) && this.f32354b == audioCapabilities.f32354b) {
            return true;
        }
        return false;
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!f32352d.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if (encoding == 8 && !supportsEncoding(8)) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        int i = format.channelCount;
        if (i != -1 && encoding != 18) {
            if (i > this.f32354b) {
                return null;
            }
        } else {
            int i2 = format.sampleRate;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = m75081f(encoding, i2);
        }
        int m75083d = m75083d(i);
        if (m75083d == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(m75083d));
    }

    public int getMaxChannelCount() {
        return this.f32354b;
    }

    public int hashCode() {
        return this.f32354b + (Arrays.hashCode(this.f32353a) * 31);
    }

    public boolean isPassthroughPlaybackSupported(Format format) {
        if (getEncodingAndChannelConfigForPassthrough(format) != null) {
            return true;
        }
        return false;
    }

    public boolean supportsEncoding(int i) {
        if (Arrays.binarySearch(this.f32353a, i) >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f32354b + ", supportedEncodings=" + Arrays.toString(this.f32353a) + C21114v8.C21123i.f54139e;
    }
}
