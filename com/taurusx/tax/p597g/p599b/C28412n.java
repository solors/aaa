package com.taurusx.tax.p597g.p599b;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.taurusx.tax.g.b.n */
/* loaded from: classes7.dex */
public class C28412n {

    /* renamed from: a */
    public static final C28392b f73835a = C28393c.m38142a("ProxyCacheUtils");

    /* renamed from: a */
    public static void m38116a(byte[] bArr, long j, int i) {
        if (bArr == null) {
            throw new NullPointerException("Buffer must be not null!");
        }
        boolean z = true;
        if (j >= 0) {
            if (i < 0 || i > bArr.length) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Length must be in range [0..buffer.length]");
            }
            return;
        }
        throw new IllegalArgumentException("Data offset must be positive!");
    }

    /* renamed from: b */
    public static String m38115b(String str) {
        try {
            return URLDecoder.decode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* renamed from: c */
    public static String m38114c(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* renamed from: d */
    public static String m38113d(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* renamed from: a */
    public static void m38118a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f73835a.m38148a(6, "Error closing resource", e);
            }
        }
    }

    /* renamed from: a */
    public static String m38117a(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
