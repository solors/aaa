package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.eqN.C7607bg;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.utils.bg */
/* loaded from: classes3.dex */
public class C7751bg {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.utils.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7752bg {

        /* renamed from: bg */
        static final Random f16928bg = C7751bg.m87844bX();
    }

    /* renamed from: IL */
    public static String m87845IL(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String m87842bg = m87842bg();
        String m87839bg = m87839bg(m87842bg, 32);
        String m87846IL = m87846IL();
        String m88416bg = (m87839bg == null || m87846IL == null) ? null : C7607bg.m88416bg(str, m87846IL, m87839bg);
        return 3 + m87842bg + m87846IL + m88416bg;
    }

    /* renamed from: bX */
    public static String m87843bX(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String m87839bg = m87839bg(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || m87839bg == null) ? str : C7607bg.m88419IL(str.substring(49), substring, m87839bg);
    }

    /* renamed from: bg */
    public static JSONObject m87838bg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return m87840bg(jSONObject.toString());
    }

    /* renamed from: bg */
    public static JSONObject m87840bg(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            try {
                String m87845IL = m87845IL(str);
                if (!TextUtils.isEmpty(m87845IL)) {
                    jSONObject.put("message", m87845IL);
                    jSONObject.put("cypher", 3);
                } else {
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                }
            } catch (Throwable unused) {
                jSONObject.put("message", str);
                jSONObject.put("cypher", 0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return jSONObject;
    }

    /* renamed from: bX */
    public static Random m87844bX() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    /* renamed from: IL */
    public static String m87846IL() {
        String m87841bg = m87841bg(8);
        if (m87841bg == null || m87841bg.length() != 16) {
            return null;
        }
        return m87841bg;
    }

    /* renamed from: bg */
    public static String m87842bg() {
        String m87841bg = m87841bg(16);
        if (m87841bg == null || m87841bg.length() != 32) {
            return null;
        }
        return m87841bg;
    }

    /* renamed from: bg */
    public static String m87839bg(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    /* renamed from: bg */
    public static String m87841bg(int i) {
        try {
            byte[] bArr = new byte[i];
            C7752bg.f16928bg.nextBytes(bArr);
            return C7768zx.m87787bg(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
