package com.apm.insight.p119b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.b.h */
/* loaded from: classes2.dex */
public final class LooperMonitor {

    /* renamed from: a */
    private static volatile boolean f3679a;

    /* renamed from: b */
    private static Printer f3680b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<AbsLooperDispatchListener> f3681c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static volatile boolean f3682d = false;

    /* compiled from: LooperMonitor.java */
    /* renamed from: com.apm.insight.b.h$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3784a {
        @Nullable
        /* renamed from: a */
        String m102064a();

        /* renamed from: b */
        String m102063b();

        /* renamed from: c */
        String m102062c();
    }

    /* renamed from: a */
    public static void m102067a() {
        if (f3679a) {
            return;
        }
        f3679a = true;
        f3680b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    LooperMonitor.m102065a(true, str);
                } else if (str.charAt(0) == '<') {
                    LooperMonitor.m102065a(false, str);
                }
            }
        };
        LooperPrinterUtils.m102061a();
        LooperPrinterUtils.m102060a(f3680b);
    }

    /* renamed from: a */
    public static void m102066a(AbsLooperDispatchListener absLooperDispatchListener) {
        CopyOnWriteArrayList<AbsLooperDispatchListener> copyOnWriteArrayList = f3681c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(absLooperDispatchListener);
        }
    }

    /* renamed from: a */
    public static void m102065a(boolean z, String str) {
        AbsLooperDispatchListener.f3623a = System.nanoTime() / 1000000;
        AbsLooperDispatchListener.f3624b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<AbsLooperDispatchListener> copyOnWriteArrayList = f3681c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            AbsLooperDispatchListener absLooperDispatchListener = copyOnWriteArrayList.get(i);
            if (absLooperDispatchListener == null || !absLooperDispatchListener.mo102076a()) {
                if (!z && absLooperDispatchListener.f3625c) {
                    absLooperDispatchListener.mo102074b("");
                }
            } else if (z) {
                if (!absLooperDispatchListener.f3625c) {
                    absLooperDispatchListener.mo102075a(str);
                }
            } else if (absLooperDispatchListener.f3625c) {
                absLooperDispatchListener.mo102074b(str);
            }
        }
    }
}
