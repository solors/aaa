package p636d7;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.pubnative.lite.sdk.models.Protocol;

/* renamed from: d7.f */
/* loaded from: classes5.dex */
public class MD5Util {

    /* renamed from: a */
    private static final String[] f89540a = {"0", "1", "2", "3", Protocol.VAST_1_0_WRAPPER, "5", "6", "7", "8", "9", "a", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "e", InneractiveMediationDefs.GENDER_FEMALE};

    /* renamed from: b */
    private static MessageDigest f89541b;

    /* renamed from: a */
    private static String m25701a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : bArr) {
            if (i < 0) {
                i += 256;
            }
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = f89540a;
            sb2.append(strArr[i / 16]);
            sb2.append(strArr[i % 16]);
            stringBuffer.append(sb2.toString());
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m25700b(String str) {
        try {
            MessageDigest m25699c = m25699c();
            if (m25699c == null) {
                return str;
            }
            return m25701a(m25699c.digest(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: c */
    private static MessageDigest m25699c() {
        MessageDigest messageDigest = f89541b;
        if (messageDigest != null) {
            return messageDigest;
        }
        try {
            MessageDigest messageDigest2 = MessageDigest.getInstance(SameMD5.TAG);
            f89541b = messageDigest2;
            return messageDigest2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
