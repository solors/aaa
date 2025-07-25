package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Joiner;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class Format implements Bundleable {
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;

    /* renamed from: b */
    private int f31632b;
    public final int bitrate;
    public final int channelCount;
    @Nullable
    public final String codecs;
    @Nullable
    public final ColorInfo colorInfo;
    @Nullable
    public final String containerMimeType;
    public final int cryptoType;
    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    public final int height;
    @Nullable

    /* renamed from: id */
    public final String f31633id;
    public final List<byte[]> initializationData;
    @Nullable
    public final String label;
    @Nullable
    public final String language;
    public final int maxInputSize;
    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    @Nullable
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;

    /* renamed from: c */
    private static final Format f31609c = new Builder().build();

    /* renamed from: d */
    private static final String f31610d = Util.intToStringMaxRadix(0);

    /* renamed from: f */
    private static final String f31611f = Util.intToStringMaxRadix(1);

    /* renamed from: g */
    private static final String f31612g = Util.intToStringMaxRadix(2);

    /* renamed from: h */
    private static final String f31613h = Util.intToStringMaxRadix(3);

    /* renamed from: i */
    private static final String f31614i = Util.intToStringMaxRadix(4);

    /* renamed from: j */
    private static final String f31615j = Util.intToStringMaxRadix(5);

    /* renamed from: k */
    private static final String f31616k = Util.intToStringMaxRadix(6);

    /* renamed from: l */
    private static final String f31617l = Util.intToStringMaxRadix(7);

    /* renamed from: m */
    private static final String f31618m = Util.intToStringMaxRadix(8);

    /* renamed from: n */
    private static final String f31619n = Util.intToStringMaxRadix(9);

    /* renamed from: o */
    private static final String f31620o = Util.intToStringMaxRadix(10);

    /* renamed from: p */
    private static final String f31621p = Util.intToStringMaxRadix(11);

    /* renamed from: q */
    private static final String f31622q = Util.intToStringMaxRadix(12);

    /* renamed from: r */
    private static final String f31623r = Util.intToStringMaxRadix(13);

    /* renamed from: s */
    private static final String f31624s = Util.intToStringMaxRadix(14);

    /* renamed from: t */
    private static final String f31625t = Util.intToStringMaxRadix(15);

    /* renamed from: u */
    private static final String f31626u = Util.intToStringMaxRadix(16);

    /* renamed from: v */
    private static final String f31627v = Util.intToStringMaxRadix(17);

    /* renamed from: w */
    private static final String f31628w = Util.intToStringMaxRadix(18);

    /* renamed from: x */
    private static final String f31629x = Util.intToStringMaxRadix(19);

    /* renamed from: y */
    private static final String f31630y = Util.intToStringMaxRadix(20);

    /* renamed from: z */
    private static final String f31631z = Util.intToStringMaxRadix(21);

    /* renamed from: A */
    private static final String f31599A = Util.intToStringMaxRadix(22);

    /* renamed from: B */
    private static final String f31600B = Util.intToStringMaxRadix(23);

    /* renamed from: C */
    private static final String f31601C = Util.intToStringMaxRadix(24);

    /* renamed from: D */
    private static final String f31602D = Util.intToStringMaxRadix(25);

    /* renamed from: E */
    private static final String f31603E = Util.intToStringMaxRadix(26);

    /* renamed from: F */
    private static final String f31604F = Util.intToStringMaxRadix(27);

    /* renamed from: G */
    private static final String f31605G = Util.intToStringMaxRadix(28);

    /* renamed from: H */
    private static final String f31606H = Util.intToStringMaxRadix(29);

    /* renamed from: I */
    private static final String f31607I = Util.intToStringMaxRadix(30);

    /* renamed from: J */
    private static final String f31608J = Util.intToStringMaxRadix(31);
    public static final Bundleable.Creator<Format> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.q1
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Format.m75780a(bundle);
        }
    };

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: A */
        private int f31634A;

        /* renamed from: B */
        private int f31635B;

        /* renamed from: C */
        private int f31636C;

        /* renamed from: D */
        private int f31637D;

        /* renamed from: E */
        private int f31638E;

        /* renamed from: F */
        private int f31639F;
        @Nullable

        /* renamed from: a */
        private String f31640a;
        @Nullable

        /* renamed from: b */
        private String f31641b;
        @Nullable

        /* renamed from: c */
        private String f31642c;

        /* renamed from: d */
        private int f31643d;

        /* renamed from: e */
        private int f31644e;

        /* renamed from: f */
        private int f31645f;

        /* renamed from: g */
        private int f31646g;
        @Nullable

        /* renamed from: h */
        private String f31647h;
        @Nullable

        /* renamed from: i */
        private Metadata f31648i;
        @Nullable

        /* renamed from: j */
        private String f31649j;
        @Nullable

        /* renamed from: k */
        private String f31650k;

        /* renamed from: l */
        private int f31651l;
        @Nullable

        /* renamed from: m */
        private List<byte[]> f31652m;
        @Nullable

        /* renamed from: n */
        private DrmInitData f31653n;

        /* renamed from: o */
        private long f31654o;

        /* renamed from: p */
        private int f31655p;

        /* renamed from: q */
        private int f31656q;

        /* renamed from: r */
        private float f31657r;

        /* renamed from: s */
        private int f31658s;

        /* renamed from: t */
        private float f31659t;
        @Nullable

        /* renamed from: u */
        private byte[] f31660u;

        /* renamed from: v */
        private int f31661v;
        @Nullable

        /* renamed from: w */
        private ColorInfo f31662w;

        /* renamed from: x */
        private int f31663x;

        /* renamed from: y */
        private int f31664y;

        /* renamed from: z */
        private int f31665z;

        public Format build() {
            return new Format(this);
        }

        @CanIgnoreReturnValue
        public Builder setAccessibilityChannel(int i) {
            this.f31636C = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAverageBitrate(int i) {
            this.f31645f = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setChannelCount(int i) {
            this.f31663x = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCodecs(@Nullable String str) {
            this.f31647h = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorInfo(@Nullable ColorInfo colorInfo) {
            this.f31662w = colorInfo;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setContainerMimeType(@Nullable String str) {
            this.f31649j = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCryptoType(int i) {
            this.f31639F = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDrmInitData(@Nullable DrmInitData drmInitData) {
            this.f31653n = drmInitData;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEncoderDelay(int i) {
            this.f31634A = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setEncoderPadding(int i) {
            this.f31635B = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFrameRate(float f) {
            this.f31657r = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHeight(int i) {
            this.f31656q = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setId(@Nullable String str) {
            this.f31640a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInitializationData(@Nullable List<byte[]> list) {
            this.f31652m = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLabel(@Nullable String str) {
            this.f31641b = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLanguage(@Nullable String str) {
            this.f31642c = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxInputSize(int i) {
            this.f31651l = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMetadata(@Nullable Metadata metadata) {
            this.f31648i = metadata;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPcmEncoding(int i) {
            this.f31665z = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPeakBitrate(int i) {
            this.f31646g = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPixelWidthHeightRatio(float f) {
            this.f31659t = f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProjectionData(@Nullable byte[] bArr) {
            this.f31660u = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRoleFlags(int i) {
            this.f31644e = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRotationDegrees(int i) {
            this.f31658s = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSampleMimeType(@Nullable String str) {
            this.f31650k = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSampleRate(int i) {
            this.f31664y = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSelectionFlags(int i) {
            this.f31643d = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStereoMode(int i) {
            this.f31661v = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubsampleOffsetUs(long j) {
            this.f31654o = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTileCountHorizontal(int i) {
            this.f31637D = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTileCountVertical(int i) {
            this.f31638E = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWidth(int i) {
            this.f31655p = i;
            return this;
        }

        public Builder() {
            this.f31645f = -1;
            this.f31646g = -1;
            this.f31651l = -1;
            this.f31654o = Long.MAX_VALUE;
            this.f31655p = -1;
            this.f31656q = -1;
            this.f31657r = -1.0f;
            this.f31659t = 1.0f;
            this.f31661v = -1;
            this.f31663x = -1;
            this.f31664y = -1;
            this.f31665z = -1;
            this.f31636C = -1;
            this.f31637D = -1;
            this.f31638E = -1;
            this.f31639F = 0;
        }

        @CanIgnoreReturnValue
        public Builder setId(int i) {
            this.f31640a = Integer.toString(i);
            return this;
        }

        private Builder(Format format) {
            this.f31640a = format.f31633id;
            this.f31641b = format.label;
            this.f31642c = format.language;
            this.f31643d = format.selectionFlags;
            this.f31644e = format.roleFlags;
            this.f31645f = format.averageBitrate;
            this.f31646g = format.peakBitrate;
            this.f31647h = format.codecs;
            this.f31648i = format.metadata;
            this.f31649j = format.containerMimeType;
            this.f31650k = format.sampleMimeType;
            this.f31651l = format.maxInputSize;
            this.f31652m = format.initializationData;
            this.f31653n = format.drmInitData;
            this.f31654o = format.subsampleOffsetUs;
            this.f31655p = format.width;
            this.f31656q = format.height;
            this.f31657r = format.frameRate;
            this.f31658s = format.rotationDegrees;
            this.f31659t = format.pixelWidthHeightRatio;
            this.f31660u = format.projectionData;
            this.f31661v = format.stereoMode;
            this.f31662w = format.colorInfo;
            this.f31663x = format.channelCount;
            this.f31664y = format.sampleRate;
            this.f31665z = format.pcmEncoding;
            this.f31634A = format.encoderDelay;
            this.f31635B = format.encoderPadding;
            this.f31636C = format.accessibilityChannel;
            this.f31637D = format.tileCountHorizontal;
            this.f31638E = format.tileCountVertical;
            this.f31639F = format.cryptoType;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Format m75780a(Bundle bundle) {
        return m75778c(bundle);
    }

    @Nullable
    /* renamed from: b */
    private static <T> T m75779b(@Nullable T t, @Nullable T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    /* renamed from: c */
    public static Format m75778c(Bundle bundle) {
        Builder builder = new Builder();
        BundleableUtil.ensureClassLoader(bundle);
        String string = bundle.getString(f31610d);
        Format format = f31609c;
        builder.setId((String) m75779b(string, format.f31633id)).setLabel((String) m75779b(bundle.getString(f31611f), format.label)).setLanguage((String) m75779b(bundle.getString(f31612g), format.language)).setSelectionFlags(bundle.getInt(f31613h, format.selectionFlags)).setRoleFlags(bundle.getInt(f31614i, format.roleFlags)).setAverageBitrate(bundle.getInt(f31615j, format.averageBitrate)).setPeakBitrate(bundle.getInt(f31616k, format.peakBitrate)).setCodecs((String) m75779b(bundle.getString(f31617l), format.codecs)).setMetadata((Metadata) m75779b((Metadata) bundle.getParcelable(f31618m), format.metadata)).setContainerMimeType((String) m75779b(bundle.getString(f31619n), format.containerMimeType)).setSampleMimeType((String) m75779b(bundle.getString(f31620o), format.sampleMimeType)).setMaxInputSize(bundle.getInt(f31621p, format.maxInputSize));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(m75777d(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(f31623r));
        String str = f31624s;
        Format format2 = f31609c;
        drmInitData.setSubsampleOffsetUs(bundle.getLong(str, format2.subsampleOffsetUs)).setWidth(bundle.getInt(f31625t, format2.width)).setHeight(bundle.getInt(f31626u, format2.height)).setFrameRate(bundle.getFloat(f31627v, format2.frameRate)).setRotationDegrees(bundle.getInt(f31628w, format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(f31629x, format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(f31630y)).setStereoMode(bundle.getInt(f31631z, format2.stereoMode));
        Bundle bundle2 = bundle.getBundle(f31599A);
        if (bundle2 != null) {
            builder.setColorInfo(ColorInfo.CREATOR.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(f31600B, format2.channelCount)).setSampleRate(bundle.getInt(f31601C, format2.sampleRate)).setPcmEncoding(bundle.getInt(f31602D, format2.pcmEncoding)).setEncoderDelay(bundle.getInt(f31603E, format2.encoderDelay)).setEncoderPadding(bundle.getInt(f31604F, format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(f31605G, format2.accessibilityChannel)).setTileCountHorizontal(bundle.getInt(f31607I, format2.tileCountHorizontal)).setTileCountVertical(bundle.getInt(f31608J, format2.tileCountVertical)).setCryptoType(bundle.getInt(f31606H, format2.cryptoType));
        return builder.build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i5).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i3).setSampleRate(i4).build();
    }

    @Deprecated
    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable String str6) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i2).setRoleFlags(i3).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @Deprecated
    public static Format createSampleFormat(@Nullable String str, @Nullable String str2) {
        return new Builder().setId(str).setSampleMimeType(str2).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i3).setHeight(i4).setFrameRate(f).build();
    }

    /* renamed from: d */
    private static String m75777d(int i) {
        return f31622q + "_" + Integer.toString(i, 36);
    }

    public static String toLogString(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.f31633id);
        sb2.append(", mimeType=");
        sb2.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb2.append(", codecs=");
            sb2.append(format.codecs);
        }
        if (format.drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = format.drmInitData;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.get(i).uuid;
                if (uuid.equals(C15633C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C15633C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C15633C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C15633C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C15633C.UUID_NIL)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb2.append(", drm=[");
            Joiner.m70068on(',').appendTo(sb2, (Iterable<? extends Object>) linkedHashSet);
            sb2.append(']');
        }
        if (format.width != -1 && format.height != -1) {
            sb2.append(", res=");
            sb2.append(format.width);
            sb2.append("x");
            sb2.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb2.append(", channels=");
            sb2.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.sampleRate);
        }
        if (format.language != null) {
            sb2.append(", language=");
            sb2.append(format.language);
        }
        if (format.label != null) {
            sb2.append(", label=");
            sb2.append(format.label);
        }
        if (format.selectionFlags != 0) {
            ArrayList arrayList = new ArrayList();
            if ((format.selectionFlags & 4) != 0) {
                arrayList.add("auto");
            }
            if ((format.selectionFlags & 1) != 0) {
                arrayList.add("default");
            }
            if ((format.selectionFlags & 2) != 0) {
                arrayList.add("forced");
            }
            sb2.append(", selectionFlags=[");
            Joiner.m70068on(',').appendTo(sb2, (Iterable<? extends Object>) arrayList);
            sb2.append(C21114v8.C21123i.f54139e);
        }
        if (format.roleFlags != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((format.roleFlags & 1) != 0) {
                arrayList2.add(C21114v8.C21122h.f54053Z);
            }
            if ((format.roleFlags & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((format.roleFlags & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((format.roleFlags & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((format.roleFlags & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((format.roleFlags & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((format.roleFlags & 64) != 0) {
                arrayList2.add(ShareConstants.FEED_CAPTION_PARAM);
            }
            if ((format.roleFlags & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((format.roleFlags & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((format.roleFlags & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((format.roleFlags & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((format.roleFlags & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((format.roleFlags & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((format.roleFlags & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((format.roleFlags & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb2.append(", roleFlags=[");
            Joiner.m70068on(',').appendTo(sb2, (Iterable<? extends Object>) arrayList2);
            sb2.append(C21114v8.C21123i.f54139e);
        }
        return sb2.toString();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public Format copyWithBitrate(int i) {
        return buildUpon().setAverageBitrate(i).setPeakBitrate(i).build();
    }

    public Format copyWithCryptoType(int i) {
        return buildUpon().setCryptoType(i).build();
    }

    @Deprecated
    public Format copyWithDrmInitData(@Nullable DrmInitData drmInitData) {
        return buildUpon().setDrmInitData(drmInitData).build();
    }

    @Deprecated
    public Format copyWithFrameRate(float f) {
        return buildUpon().setFrameRate(f).build();
    }

    @Deprecated
    public Format copyWithGaplessInfo(int i, int i2) {
        return buildUpon().setEncoderDelay(i).setEncoderPadding(i2).build();
    }

    @Deprecated
    public Format copyWithLabel(@Nullable String str) {
        return buildUpon().setLabel(str).build();
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format format) {
        return withManifestFormatInfo(format);
    }

    @Deprecated
    public Format copyWithMaxInputSize(int i) {
        return buildUpon().setMaxInputSize(i).build();
    }

    @Deprecated
    public Format copyWithMetadata(@Nullable Metadata metadata) {
        return buildUpon().setMetadata(metadata).build();
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long j) {
        return buildUpon().setSubsampleOffsetUs(j).build();
    }

    @Deprecated
    public Format copyWithVideoSize(int i, int i2) {
        return buildUpon().setWidth(i).setHeight(i2).build();
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f31632b;
        if (i2 != 0 && (i = format.f31632b) != 0 && i2 != i) {
            return false;
        }
        if (this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.tileCountHorizontal == format.tileCountHorizontal && this.tileCountVertical == format.tileCountVertical && this.cryptoType == format.cryptoType && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.f31633id, format.f31633id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format)) {
            return true;
        }
        return false;
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.f31632b == 0) {
            String str = this.f31633id;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + hashCode) * 31;
            String str2 = this.label;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i3 + i) * 31;
            String str3 = this.language;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (((((((((i4 + hashCode2) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            Metadata metadata = this.metadata;
            if (metadata == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = metadata.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            String str5 = this.containerMimeType;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            String str6 = this.sampleMimeType;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.f31632b = ((((((((((((((((((((((((((((((((((i8 + i2) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        }
        return this.f31632b;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        return toBundle(false);
    }

    public String toString() {
        return "Format(" + this.f31633id + ", " + this.label + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.codecs + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + "], [" + this.channelCount + ", " + this.sampleRate + "])";
    }

    public Format withManifestFormatInfo(Format format) {
        String str;
        Metadata copyWithAppendedEntriesFrom;
        if (this == format) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str2 = format.f31633id;
        String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i = this.averageBitrate;
        if (i == -1) {
            i = format.averageBitrate;
        }
        int i2 = this.peakBitrate;
        if (i2 == -1) {
            i2 = format.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String codecsOfType = Util.getCodecsOfType(format.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        Metadata metadata = this.metadata;
        if (metadata == null) {
            copyWithAppendedEntriesFrom = format.metadata;
        } else {
            copyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(format.metadata);
        }
        float f = this.frameRate;
        if (f == -1.0f && trackType == 2) {
            f = format.frameRate;
        }
        int i3 = this.selectionFlags | format.selectionFlags;
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(i3).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i).setPeakBitrate(i2).setCodecs(str5).setMetadata(copyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f).build();
    }

    private Format(Builder builder) {
        this.f31633id = builder.f31640a;
        this.label = builder.f31641b;
        this.language = Util.normalizeLanguageCode(builder.f31642c);
        this.selectionFlags = builder.f31643d;
        this.roleFlags = builder.f31644e;
        int i = builder.f31645f;
        this.averageBitrate = i;
        int i2 = builder.f31646g;
        this.peakBitrate = i2;
        this.bitrate = i2 != -1 ? i2 : i;
        this.codecs = builder.f31647h;
        this.metadata = builder.f31648i;
        this.containerMimeType = builder.f31649j;
        this.sampleMimeType = builder.f31650k;
        this.maxInputSize = builder.f31651l;
        this.initializationData = builder.f31652m == null ? Collections.emptyList() : builder.f31652m;
        DrmInitData drmInitData = builder.f31653n;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.f31654o;
        this.width = builder.f31655p;
        this.height = builder.f31656q;
        this.frameRate = builder.f31657r;
        this.rotationDegrees = builder.f31658s == -1 ? 0 : builder.f31658s;
        this.pixelWidthHeightRatio = builder.f31659t == -1.0f ? 1.0f : builder.f31659t;
        this.projectionData = builder.f31660u;
        this.stereoMode = builder.f31661v;
        this.colorInfo = builder.f31662w;
        this.channelCount = builder.f31663x;
        this.sampleRate = builder.f31664y;
        this.pcmEncoding = builder.f31665z;
        this.encoderDelay = builder.f31634A == -1 ? 0 : builder.f31634A;
        this.encoderPadding = builder.f31635B != -1 ? builder.f31635B : 0;
        this.accessibilityChannel = builder.f31636C;
        this.tileCountHorizontal = builder.f31637D;
        this.tileCountVertical = builder.f31638E;
        if (builder.f31639F != 0 || drmInitData == null) {
            this.cryptoType = builder.f31639F;
        } else {
            this.cryptoType = 1;
        }
    }

    public Bundle toBundle(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(f31610d, this.f31633id);
        bundle.putString(f31611f, this.label);
        bundle.putString(f31612g, this.language);
        bundle.putInt(f31613h, this.selectionFlags);
        bundle.putInt(f31614i, this.roleFlags);
        bundle.putInt(f31615j, this.averageBitrate);
        bundle.putInt(f31616k, this.peakBitrate);
        bundle.putString(f31617l, this.codecs);
        if (!z) {
            bundle.putParcelable(f31618m, this.metadata);
        }
        bundle.putString(f31619n, this.containerMimeType);
        bundle.putString(f31620o, this.sampleMimeType);
        bundle.putInt(f31621p, this.maxInputSize);
        for (int i = 0; i < this.initializationData.size(); i++) {
            bundle.putByteArray(m75777d(i), this.initializationData.get(i));
        }
        bundle.putParcelable(f31623r, this.drmInitData);
        bundle.putLong(f31624s, this.subsampleOffsetUs);
        bundle.putInt(f31625t, this.width);
        bundle.putInt(f31626u, this.height);
        bundle.putFloat(f31627v, this.frameRate);
        bundle.putInt(f31628w, this.rotationDegrees);
        bundle.putFloat(f31629x, this.pixelWidthHeightRatio);
        bundle.putByteArray(f31630y, this.projectionData);
        bundle.putInt(f31631z, this.stereoMode);
        ColorInfo colorInfo = this.colorInfo;
        if (colorInfo != null) {
            bundle.putBundle(f31599A, colorInfo.toBundle());
        }
        bundle.putInt(f31600B, this.channelCount);
        bundle.putInt(f31601C, this.sampleRate);
        bundle.putInt(f31602D, this.pcmEncoding);
        bundle.putInt(f31603E, this.encoderDelay);
        bundle.putInt(f31604F, this.encoderPadding);
        bundle.putInt(f31605G, this.accessibilityChannel);
        bundle.putInt(f31607I, this.tileCountHorizontal);
        bundle.putInt(f31608J, this.tileCountVertical);
        bundle.putInt(f31606H, this.cryptoType);
        return bundle;
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i3).setHeight(i4).setFrameRate(f).setRotationDegrees(i5).setPixelWidthHeightRatio(f2).build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i6).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i3).setSampleRate(i4).setPcmEncoding(i5).build();
    }
}
