package com.p551my.target;

import android.util.Base64;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: com.my.target.n1 */
/* loaded from: classes7.dex */
public abstract class AbstractC25925n1 {
    /* renamed from: a */
    public static String m43422a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m43420b(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
            try {
                deflaterOutputStream.write(str.getBytes());
                deflaterOutputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            AbstractC25846ja.m43680a("EncryptionUtils: Cannot obtain bidder token - " + th3.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static String m43419c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb2.append(String.format("%02X", Byte.valueOf(digest[i])));
            }
            return sb2.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m43421a(Map map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
            try {
                boolean z = true;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str != null) {
                        String str2 = (String) entry.getKey();
                        String m43503b = C25895la.m43503b(str);
                        if (z) {
                            z = false;
                        } else {
                            deflaterOutputStream.write(38);
                        }
                        deflaterOutputStream.write(str2.getBytes());
                        deflaterOutputStream.write(61);
                        deflaterOutputStream.write(m43503b.getBytes());
                    }
                }
                deflaterOutputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            AbstractC25846ja.m43680a("EncryptionUtils: Cannot encode message - " + th3.getMessage());
            return "";
        }
    }
}
