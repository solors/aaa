package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.component.utils.bX */
/* loaded from: classes3.dex */
public class C7750bX {

    /* renamed from: bg */
    private static HashMap<String, ArrayList<String>> f16927bg = new HashMap<>();

    /* renamed from: IL */
    private static Signature[] m87850IL(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            C7741PX.m87880IL(e.toString());
            return null;
        }
    }

    /* renamed from: bg */
    public static ArrayList<String> m87848bg(Context context, String str) {
        Signature[] m87850IL;
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f16927bg.get(str) != null) {
                return f16927bg.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : m87850IL(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = m87847bg(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = m87847bg(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = m87847bg(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e) {
                C7741PX.m87880IL(e.toString());
            }
            f16927bg.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: bg */
    public static String m87849bg(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> m87848bg = m87848bg(context, "SHA1");
        if (m87848bg != null && m87848bg.size() != 0) {
            for (int i = 0; i < m87848bg.size(); i++) {
                sb2.append(m87848bg.get(i));
                if (i < m87848bg.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    private static String m87847bg(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] digest = messageDigest.digest(byteArray);
                StringBuilder sb2 = new StringBuilder();
                for (byte b : digest) {
                    sb2.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                    sb2.append(":");
                }
                return sb2.substring(0, sb2.length() - 1).toString();
            }
            return "error!";
        } catch (Exception e) {
            C7741PX.m87880IL(e.toString());
            return "error!";
        }
    }
}
