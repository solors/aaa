package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzku {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzkt zzktVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zza(zzktVar, sb2, 0);
        return sb2.toString();
    }

    private static void zza(int i, StringBuilder sb2) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb2.append(cArr, 0, length);
            i -= length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb2, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb2, i, str, entry);
            }
        } else {
            sb2.append('\n');
            zza(i, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzmb.zza(zzia.zza((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzia) {
                sb2.append(": \"");
                sb2.append(zzmb.zza((zzia) obj));
                sb2.append('\"');
            } else if (obj instanceof zzjk) {
                sb2.append(" {");
                zza((zzjk) obj, sb2, i + 2);
                sb2.append("\n");
                zza(i, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                zza(sb2, i3, "key", entry2.getKey());
                zza(sb2, i3, "value", entry2.getValue());
                sb2.append("\n");
                zza(i, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0163, code lost:
        if (r5.containsKey(com.amazon.p047a.p048a.p071o.KiwiConstants.f2714as + r9.substring(0, r9.length() - 5)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0195, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a6, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ce, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzkt r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzku.zza(com.google.android.gms.internal.measurement.zzkt, java.lang.StringBuilder, int):void");
    }
}
