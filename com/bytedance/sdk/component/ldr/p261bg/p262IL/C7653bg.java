package com.bytedance.sdk.component.ldr.p261bg.p262IL;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;

/* renamed from: com.bytedance.sdk.component.ldr.bg.IL.bg */
/* loaded from: classes3.dex */
public class C7653bg {
    /* renamed from: IL */
    private static long m88229IL(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i, 10);
            }
            return Math.min((freeMemory / 2) * 10, i);
        }
        long j = ((freeMemory + maxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return Math.min(i, 10);
        }
        return Math.min(j * 10, i);
    }

    /* renamed from: bX */
    public static boolean m88228bX() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null && !TextUtils.isEmpty(eqN.eqN())) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static long m88226bg(int i, Context context) {
        return m88229IL(i, context);
    }

    public static boolean eqN() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null && !TextUtils.isEmpty(eqN.mo83372zx())) {
            return true;
        }
        return false;
    }

    public static boolean ldr() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null && !TextUtils.isEmpty(eqN.ldr())) {
            return true;
        }
        return false;
    }

    /* renamed from: zx */
    public static boolean m88225zx() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null && !TextUtils.isEmpty(eqN.mo83375bX())) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static boolean m88227bg() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        return (eqN == null || TextUtils.isEmpty(eqN.mo83374bg())) ? false : true;
    }

    /* renamed from: IL */
    public static boolean m88230IL() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        return (eqN == null || TextUtils.isEmpty(eqN.mo83376IL())) ? false : true;
    }
}
