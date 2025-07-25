package io.appmetrica.analytics.impl;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: io.appmetrica.analytics.impl.yi */
/* loaded from: classes9.dex */
public abstract class AbstractC35044yi {
    /* renamed from: a */
    public static byte[] m20736a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
