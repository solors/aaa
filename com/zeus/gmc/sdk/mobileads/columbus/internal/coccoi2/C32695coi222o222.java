package com.zeus.gmc.sdk.mobileads.columbus.internal.coccoi2;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.Base64Decoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coccoi2.coi222o222 */
/* loaded from: classes8.dex */
public final class C32695coi222o222 {
    private static String coo2iico = "UTF-8";

    private C32695coi222o222() {
    }

    public static String coo2iico() {
        try {
            String omjs = ConfigCache.getInstance().getOMJS();
            if (TextUtils.isEmpty(omjs)) {
                return null;
            }
            return new String(coo2iico(Base64Decoder.decodeToBytes(omjs)), coo2iico);
        } catch (Exception e) {
            MLog.m25891d("", "", e);
            return null;
        }
    }

    private static byte[] coo2iico(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            byte[] bArr2 = new byte[256];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
