package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.C21986Aa;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C21986Aa c21986Aa = new C21986Aa();
                Method declaredMethod = C21986Aa.class.getDeclaredMethod("b", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(c21986Aa, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
