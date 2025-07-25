package com.p551my.target;

import android.content.Context;

/* renamed from: com.my.target.q1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26021q1 {
    /* renamed from: a */
    public static boolean m43186a(String str, Context context) {
        try {
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("FPDataProvider: Unable to check " + str + " permission! Unexpected throwable in Context.checkCallingOrSelfPermission() method - " + th.getMessage());
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }
}
