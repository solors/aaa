package com.apm.insight.p120c;

import com.apm.insight.NpthBus;
import com.apm.insight.runtime.ApmConfig;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.apm.insight.c.a */
/* loaded from: classes2.dex */
public final class CommandWriter {

    /* renamed from: a */
    private static AtomicBoolean f3696a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m102049a() {
        synchronized (f3696a) {
            if (f3696a.get()) {
                return false;
            }
            f3696a.set(true);
            return m102048b();
        }
    }

    /* renamed from: b */
    public static boolean m102048b() {
        if (!ApmConfig.m101505g()) {
            return false;
        }
        try {
            File file = new File(NpthBus.m102010h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
