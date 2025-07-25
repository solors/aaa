package io.bidmachine.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes9.dex */
public final class AudioCapabilities {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 10;
    @VisibleForTesting
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 10);
    private static final ImmutableList<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.m69421of(2, 5, 6);
    private static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilities$a */
    /* loaded from: classes9.dex */
    public static final class C36077a {
        private C36077a() {
        }

        @DoNotInline
        private static final ImmutableSet<Integer> getAllBluetoothDeviceTypes() {
            ImmutableSet.Builder add = new ImmutableSet.Builder().add((Object[]) new Integer[]{8, 7});
            int i = Util.SDK_INT;
            if (i >= 31) {
                add.add((Object[]) new Integer[]{26, 27});
            }
            if (i >= 33) {
                add.add((ImmutableSet.Builder) 30);
            }
            return add.build();
        }

        @DoNotInline
        public static final boolean isBluetoothConnected(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) Assertions.checkNotNull((AudioManager) context.getSystemService("audio"))).getDevices(2);
            ImmutableSet<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* renamed from: io.bidmachine.media3.exoplayer.audio.AudioCapabilities$b */
    /* loaded from: classes9.dex */
    public static final class C36078b {
        private static final AudioAttributes DEFAULT_AUDIO_ATTRIBUTES = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        private C36078b() {
        }

        @DoNotInline
        public static ImmutableList<Integer> getDirectPlaybackSupportedEncodings() {
            boolean isDirectPlaybackSupported;
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (Util.SDK_INT >= 34 || intValue != 30) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), DEFAULT_AUDIO_ATTRIBUTES);
                    if (isDirectPlaybackSupported) {
                        builder.add((ImmutableList.Builder) Integer.valueOf(intValue));
                    }
                }
            }
            builder.add((ImmutableList.Builder) 2);
            return builder.build();
        }

        @DoNotInline
        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
            boolean isDirectPlaybackSupported;
            for (int i3 = 10; i3 > 0; i3--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.getAudioTrackChannelConfig(i3)).build(), DEFAULT_AUDIO_ATTRIBUTES);
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
            this.supportedEncodings = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        if (Util.SDK_INT >= 17) {
            String str = Util.MANUFACTURER;
            if ("Amazon".equals(str) || C32573coo2iico.c2oc2o.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static int getChannelConfigForPassthrough(int i) {
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
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
        if (Util.SDK_INT >= 29) {
            return C36078b.getMaxSupportedChannelCountForPassthrough(i, i2);
        }
        return ((Integer) Assertions.checkNotNull(ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        if (Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount) {
            return true;
        }
        return false;
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        int i = format.channelCount;
        if (i != -1 && encoding != 18) {
            if (format.sampleMimeType.equals("audio/vnd.dts.uhd;profile=p2")) {
                if (i > 10) {
                    return null;
                }
            } else if (i > this.maxChannelCount) {
                return null;
            }
        } else {
            int i2 = format.sampleRate;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = getMaxSupportedChannelCountForPassthrough(encoding, i2);
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(i);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public boolean isPassthroughPlaybackSupported(Format format) {
        if (getEncodingAndChannelConfigForPassthrough(format) != null) {
            return true;
        }
        return false;
    }

    public boolean supportsEncoding(int i) {
        if (Arrays.binarySearch(this.supportedEncodings, i) >= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + Arrays.toString(this.supportedEncodings) + C21114v8.C21123i.f54139e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilities(Context context, @Nullable Intent intent) {
        int i = Util.SDK_INT;
        if (i >= 23 && C36077a.isBluetoothConnected(context)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (deviceMaySetExternalSurroundSoundGlobalSetting() && Settings.Global.getInt(context.getContentResolver(), EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            builder.addAll((Iterable) EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (i >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            builder.addAll((Iterable) C36078b.getDirectPlaybackSupportedEncodings());
            return new AudioCapabilities(Ints.toArray(builder.build()), 10);
        } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                builder.addAll((Iterable) Ints.asList(intArrayExtra));
            }
            return new AudioCapabilities(Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        } else {
            ImmutableSet build = builder.build();
            if (!build.isEmpty()) {
                return new AudioCapabilities(Ints.toArray(build), 10);
            }
            return DEFAULT_AUDIO_CAPABILITIES;
        }
    }
}
