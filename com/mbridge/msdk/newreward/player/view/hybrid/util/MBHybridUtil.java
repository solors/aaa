package com.mbridge.msdk.newreward.player.view.hybrid.util;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MBHybridUtil {
    private static final String TAG = "MBHybridUtil";

    public static String convert2Unicode(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuilder sb2 = new StringBuilder(1000);
        sb2.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                sb2.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < 2) {
                        if (cArr[i2] == charAt) {
                            sb2.append("\\" + charAt);
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    sb2.append(charAt);
                }
            }
        }
        return new String(sb2);
    }

    public static double getCurrentVolume(Context context) {
        int i;
        if (context == null) {
            return -1.0d;
        }
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        int i2 = -1;
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
        }
        return (i2 * 100.0d) / i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r4.equals("jpg") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getImageMimeType(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r4 = r4.getPath()
            r0 = 1
            r2 = -1
            if (r4 == 0) goto L23
            java.lang.String r3 = "."
            int r3 = r4.lastIndexOf(r3)
            if (r3 == r2) goto L23
            int r3 = r3 + r0
            java.lang.String r4 = r4.substring(r3)
            goto L24
        L23:
            r4 = r1
        L24:
            r4.hashCode()
            int r3 = r4.hashCode()
            switch(r3) {
                case 102340: goto L5a;
                case 105441: goto L51;
                case 111145: goto L46;
                case 3268712: goto L3b;
                case 3645340: goto L30;
                default: goto L2e;
            }
        L2e:
            r0 = r2
            goto L64
        L30:
            java.lang.String r0 = "webp"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L39
            goto L2e
        L39:
            r0 = 4
            goto L64
        L3b:
            java.lang.String r0 = "jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L44
            goto L2e
        L44:
            r0 = 3
            goto L64
        L46:
            java.lang.String r0 = "png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4f
            goto L2e
        L4f:
            r0 = 2
            goto L64
        L51:
            java.lang.String r3 = "jpg"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L64
            goto L2e
        L5a:
            java.lang.String r0 = "gif"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L63
            goto L2e
        L63:
            r0 = 0
        L64:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L6e;
                case 2: goto L6b;
                case 3: goto L6e;
                case 4: goto L68;
                default: goto L67;
            }
        L67:
            goto L73
        L68:
            java.lang.String r1 = "image/webp"
            goto L73
        L6b:
            java.lang.String r1 = "image/png"
            goto L73
        L6e:
            java.lang.String r1 = "image/jpeg"
            goto L73
        L71:
            java.lang.String r1 = "image/gif"
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil.getImageMimeType(java.lang.String):java.lang.String");
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static String getQueryParameters(Uri uri) {
        String encodedQuery;
        if (uri == null || (encodedQuery = uri.getEncodedQuery()) == null) {
            return null;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : linkedHashSet) {
                jSONObject.put(str, uri.getQueryParameter(str));
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            SameLogTool.m51824b(TAG, th.getMessage());
            return null;
        }
    }
}
