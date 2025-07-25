package com.apm.insight.p119b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import com.apm.insight.NpthBus;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.b.i */
/* loaded from: classes2.dex */
public final class LooperPrinterUtils {

    /* renamed from: a */
    private static int f3683a = 5;

    /* renamed from: b */
    private static C3786b f3684b;

    /* renamed from: c */
    private static boolean f3685c;

    /* renamed from: d */
    private static Printer f3686d;

    /* compiled from: LooperPrinterUtils.java */
    /* renamed from: com.apm.insight.b.i$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3785a {
    }

    /* compiled from: LooperPrinterUtils.java */
    /* renamed from: com.apm.insight.b.i$b */
    /* loaded from: classes2.dex */
    static class C3786b implements Printer {

        /* renamed from: a */
        List<Printer> f3687a = new ArrayList();

        /* renamed from: d */
        private List<Printer> f3690d = new ArrayList();

        /* renamed from: b */
        List<Printer> f3688b = new ArrayList();

        /* renamed from: e */
        private boolean f3691e = false;

        /* renamed from: c */
        boolean f3689c = false;

        C3786b() {
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LooperPrinterUtils.m102059b();
            if (str.charAt(0) == '>' && this.f3689c) {
                for (Printer printer : this.f3688b) {
                    if (!this.f3687a.contains(printer)) {
                        this.f3687a.add(printer);
                    }
                }
                this.f3688b.clear();
                this.f3689c = false;
            }
            if (this.f3687a.size() > LooperPrinterUtils.f3683a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f3687a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            LooperPrinterUtils.m102059b();
        }
    }

    /* renamed from: a */
    public static void m102061a() {
        if (f3685c) {
            return;
        }
        f3685c = true;
        f3684b = new C3786b();
        Printer m102057d = m102057d();
        f3686d = m102057d;
        if (m102057d != null) {
            f3684b.f3687a.add(m102057d);
        }
        if (NpthBus.m101999s()) {
            Looper.getMainLooper().setMessageLogging(f3684b);
        }
    }

    /* renamed from: b */
    static /* synthetic */ InterfaceC3785a m102059b() {
        return null;
    }

    /* renamed from: d */
    private static Printer m102057d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m102060a(Printer printer) {
        if (printer == null || f3684b.f3688b.contains(printer)) {
            return;
        }
        f3684b.f3688b.add(printer);
        f3684b.f3689c = true;
    }
}
