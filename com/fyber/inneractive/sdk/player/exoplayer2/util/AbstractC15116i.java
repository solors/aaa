package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i */
/* loaded from: classes4.dex */
public abstract class AbstractC15116i {
    /* renamed from: a */
    public static String m77219a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("avc1") && !trim.startsWith("avc3")) {
            if (!trim.startsWith("hev1") && !trim.startsWith("hvc1")) {
                if (trim.startsWith("vp9")) {
                    return "video/x-vnd.on2.vp9";
                }
                if (trim.startsWith("vp8")) {
                    return "video/x-vnd.on2.vp8";
                }
                if (trim.startsWith("mp4a")) {
                    return "audio/mp4a-latm";
                }
                if (!trim.startsWith("ac-3") && !trim.startsWith("dac3")) {
                    if (!trim.startsWith("ec-3") && !trim.startsWith("dec3")) {
                        if (!trim.startsWith("dtsc") && !trim.startsWith("dtse")) {
                            if (!trim.startsWith("dtsh") && !trim.startsWith("dtsl")) {
                                if (trim.startsWith("opus")) {
                                    return "audio/opus";
                                }
                                if (!trim.startsWith("vorbis")) {
                                    return null;
                                }
                                return "audio/vorbis";
                            }
                            return "audio/vnd.dts.hd";
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/eac3";
                }
                return "audio/ac3";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    /* renamed from: b */
    public static String m77218b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    /* renamed from: c */
    public static int m77217c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(m77218b(str))) {
            return 1;
        }
        if ("video".equals(m77218b(str))) {
            return 2;
        }
        if (!"text".equals(m77218b(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-camera-motion".equals(str)) {
                return -1;
            }
            return 4;
        }
        return 3;
    }
}
