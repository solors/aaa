package com.meevii.soniclib;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import p739j6.HookHandler;
import p739j6.ViewGroupExceptionIntercept;

/* loaded from: classes5.dex */
public class ExceptionIntercept {

    /* renamed from: com.meevii.soniclib.ExceptionIntercept$a */
    /* loaded from: classes5.dex */
    class C23335a extends ViewGroupExceptionIntercept {
        C23335a() {
        }

        @Override // p739j6.ViewGroupExceptionIntercept, p739j6.IExceptionIntercept
        /* renamed from: a */
        public boolean mo18522a(Exception exc) {
            boolean mo18522a = super.mo18522a(exc);
            if (mo18522a) {
                try {
                    FirebaseCrashlytics.getInstance().recordException(new Exception("HookCustomCrash: " + exc.getMessage(), exc));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return mo18522a;
        }
    }

    public static void initHookHandler(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C23335a());
        HookHandler.m18524b(context, arrayList);
    }
}
