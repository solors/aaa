package com.applovin.impl;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.p8 */
/* loaded from: classes2.dex */
public abstract class AbstractC5108p8 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m96587a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String m98690j = AbstractC4524hf.m98690j(str);
        m98690j.hashCode();
        switch (m98690j.hashCode()) {
            case -2123537834:
                if (m98690j.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (m98690j.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (m98690j.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (m98690j.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (m98690j.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (m98690j.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (m98690j.equals("application/mp4")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (m98690j.equals("text/vtt")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (m98690j.equals("audio/x-matroska")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (m98690j.equals("application/webm")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (m98690j.equals("video/x-flv")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (m98690j.equals("audio/ac3")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (m98690j.equals("audio/ac4")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (m98690j.equals("audio/amr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (m98690j.equals("audio/mp4")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (m98690j.equals("audio/ogg")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (m98690j.equals("audio/wav")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (m98690j.equals("video/mp4")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (m98690j.equals("audio/3gpp")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (m98690j.equals("audio/eac3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (m98690j.equals("audio/flac")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (m98690j.equals("audio/mpeg")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (m98690j.equals("audio/webm")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (m98690j.equals("video/x-matroska")) {
                    c = 23;
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
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\b':
            case '\t':
            case 22:
            case 23:
                return 6;
            case 4:
            case '\r':
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case '\n':
                return 5;
            case '\f':
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static int m96586a(Map map) {
        List list = (List) map.get("Content-Type");
        return m96587a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    /* renamed from: a */
    public static int m96588a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
