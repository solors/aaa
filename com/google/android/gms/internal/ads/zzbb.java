package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbb {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, @Nullable String str2) {
        char c;
        zzba zzc2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzc2 = zzc(str2)) == null) {
                    return 0;
                }
                return zzc2.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (!zzi(str)) {
            if (!"text".equals(zzj(str)) && !MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                if (zzh(str)) {
                    return 4;
                }
                if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
                    if (!"application/x-camera-motion".equals(str)) {
                        int size = zzb.size();
                        for (int i = 0; i < size; i++) {
                            String str2 = ((zzaz) zzb.get(i)).zza;
                            if (str.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    @Nullable
    @VisibleForTesting
    static zzba zzc(String str) {
        int i;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i = Integer.parseInt(group2);
                } else {
                    i = 0;
                }
                return new zzba(parseInt, i);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static String zzd(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 221) {
                                    if (i != 165) {
                                        if (i != 166) {
                                            switch (i) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    return "video/mpeg2";
                                                case 102:
                                                case 103:
                                                case 104:
                                                    return "audio/mp4a-latm";
                                                case 105:
                                                case 107:
                                                    return "audio/mpeg";
                                                case 106:
                                                    return "video/mpeg";
                                                case 108:
                                                    return "image/jpeg";
                                                default:
                                                    switch (i) {
                                                        case 169:
                                                        case 172:
                                                            return "audio/vnd.dts";
                                                        case 170:
                                                        case 171:
                                                            return "audio/vnd.dts.hd";
                                                        case 173:
                                                            return "audio/opus";
                                                        case 174:
                                                            return "audio/ac4";
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zze(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String zza2 = zzftt.zza(str);
        switch (zza2.hashCode()) {
            case -1007807498:
                if (zza2.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (zza2.equals("application/x-mpegurl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (zza2.equals("audio/x-wav")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (zza2.equals("audio/mpeg-l1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (zza2.equals("audio/mpeg-l2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (zza2.equals("audio/mp3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return zza2;
                            }
                            return "audio/mpeg-L2";
                        }
                        return "audio/mpeg-L1";
                    }
                    return "application/x-mpegURL";
                }
                return "audio/wav";
            }
            return "audio/mpeg";
        }
        return "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(@Nullable String str, @Nullable String str2) {
        char c;
        zzba zzc2;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (zzc2 = zzc(str2)) == null || (zza2 = zzc2.zza()) == 0 || zza2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean zzg(@Nullable String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzh(@Nullable String str) {
        if (!"image".equals(zzj(str)) && !MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean zzi(@Nullable String str) {
        return "video".equals(zzj(str));
    }

    @Nullable
    private static String zzj(@Nullable String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
