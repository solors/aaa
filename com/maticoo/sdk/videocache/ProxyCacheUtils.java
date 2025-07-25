package com.maticoo.sdk.videocache;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class ProxyCacheUtils {
    static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int MAX_ARRAY_PREVIEW = 16;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void assertBuffer(byte[] bArr, long j, int i) {
        boolean z;
        Preconditions.checkNotNull(bArr, "Buffer must be not null!");
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Data offset must be positive!");
        if (i < 0 || i > bArr.length) {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Length must be in range [0..buffer.length]");
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ILog.m53549e("Error closing resource", e);
            }
        }
    }

    public static String computeMD5(String str) {
        try {
            return bytesToHexString(MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decode(String str) {
        try {
            return URLDecoder.decode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encode(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSupposablyMime(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    static String preview(byte[] bArr, int i) {
        int min = Math.min(16, Math.max(i, 0));
        String arrays = Arrays.toString(Arrays.copyOfRange(bArr, 0, min));
        if (min < i) {
            return arrays.substring(0, arrays.length() - 1) + ", ...]";
        }
        return arrays;
    }
}
