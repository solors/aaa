package com.learnings.unity.abtest;

import android.util.Log;

/* loaded from: classes6.dex */
public class LogUtil {
    /* renamed from: i */
    public static void m53621i(String str, String str2) {
        if (isApkInRelease()) {
            return;
        }
        Log.i(str, str2);
    }

    public static boolean isApkInRelease() {
        try {
            if ((UnityUtil.getContext().getApplicationInfo().flags & 2) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
