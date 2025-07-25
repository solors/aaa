package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class lt1 {
    /* renamed from: a */
    public static SharedPreferences m32196a(lt1 lt1Var, Context context, String prefName) {
        Boolean m14549b;
        lt1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefName, "prefName");
        try {
            Result.C38506a c38506a = Result.f101870c;
            Object systemService = context.getSystemService("user");
            Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.os.UserManager");
            m14549b = Result.m14549b(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m14544g(m14549b)) {
            m14549b = bool;
        }
        if (!((Boolean) m14549b).booleanValue()) {
            SharedPreferences sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(prefName, 0);
            Intrinsics.m17074g(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(prefName, 0);
        Intrinsics.m17074g(sharedPreferences2);
        return sharedPreferences2;
    }
}
