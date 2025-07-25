package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.AppDataCenter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.runtime.j */
/* loaded from: classes2.dex */
public class LooperMessageManager {

    /* renamed from: a */
    private static LooperMessageManager f4061a;

    /* renamed from: b */
    private long f4062b = -1;

    /* renamed from: c */
    private final List<Printer> f4063c = new ArrayList();

    /* renamed from: d */
    private final List<Printer> f4064d = new ArrayList();

    /* renamed from: e */
    private boolean f4065e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.j.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    LooperMessageManager.m101398a().m101397a(str);
                } else if (str.charAt(0) == '<') {
                    LooperMessageManager.m101398a().m101394b(str);
                }
                LooperMessageManager.m101393c();
            }
        };
    }

    private LooperMessageManager() {
    }

    /* renamed from: a */
    public static LooperMessageManager m101398a() {
        if (f4061a == null) {
            synchronized (LooperMessageManager.class) {
                if (f4061a == null) {
                    f4061a = new LooperMessageManager();
                }
            }
        }
        return f4061a;
    }

    /* renamed from: c */
    static /* synthetic */ Printer m101393c() {
        return null;
    }

    /* renamed from: b */
    public final boolean m101395b() {
        return this.f4062b != -1 && SystemClock.uptimeMillis() - this.f4062b > 5000;
    }

    /* renamed from: b */
    final void m101394b(String str) {
        this.f4062b = SystemClock.uptimeMillis();
        try {
            m101396a(this.f4064d, str);
        } catch (Exception e) {
            AppDataCenter.m102158b((Throwable) e);
        }
    }

    /* renamed from: a */
    final void m101397a(String str) {
        this.f4062b = -1L;
        try {
            m101396a(this.f4063c, str);
        } catch (Exception e) {
            AppDataCenter.m102174a((Throwable) e);
        }
    }

    /* renamed from: a */
    private static void m101396a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            AppDataCenter.m102174a(th);
        }
    }
}
