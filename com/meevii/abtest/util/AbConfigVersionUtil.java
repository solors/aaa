package com.meevii.abtest.util;

import android.content.Context;
import com.learnings.abcenter.util.AbCenterSharedUtil;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class AbConfigVersionUtil {
    private static final AtomicLong sAdVersionCode = new AtomicLong();

    public static long getAbVersionCode() {
        return sAdVersionCode.get();
    }

    public static long getLocalConfigVersionCodeV5(Context context) {
        return AbCenterSharedUtil.getLongValue(context, Constant.SP_KEY_CONFIG_VERSION_CODE, 0L);
    }

    public static void saveLocalConfigVersionCodeV5(Context context, long j) {
        AbCenterSharedUtil.setLongValue(context, Constant.SP_KEY_CONFIG_VERSION_CODE, j);
    }

    public static void setAbVersionCode(long j) {
        sAdVersionCode.set(j);
    }
}
