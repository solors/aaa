package com.ironsource.sdk.controller;

import com.ironsource.C19646bl;
import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* renamed from: com.ironsource.sdk.controller.s */
/* loaded from: classes6.dex */
final class C20896s {

    /* renamed from: b */
    private static final String f53192b = "MD5";

    /* renamed from: a */
    private String f53193a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20896s(String str) {
        this.f53193a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m55202a() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m55198b() {
        return this.f53193a;
    }

    /* renamed from: a */
    private String m55201a(String str) {
        try {
            return C19646bl.m59295a(str);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return m55197b(str);
        }
    }

    /* renamed from: b */
    private String m55197b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m55199a(messageDigest.digest());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: a */
    private String m55199a(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m55200a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m55201a(str + str2 + this.f53193a));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
