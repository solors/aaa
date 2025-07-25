package com.amazon.p047a.p048a.p051b;

import android.app.Application;
import com.amazon.p047a.p048a.p051b.p052a.CrashEvent;
import com.amazon.p047a.p048a.p054c.EventManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p071o.FileUtils;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.amazon.p047a.p048a.p071o.p075c.Serializer;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.amazon.a.a.b.b */
/* loaded from: classes2.dex */
public class CrashManagerImpl implements CrashManager, ResourcePopulationAware, Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final KiwiLogger f2324a = new KiwiLogger("CrashManagerImpl");

    /* renamed from: b */
    private static final String f2325b = "s-";

    /* renamed from: c */
    private static final String f2326c = ".amzst";

    /* renamed from: d */
    private static final int f2327d = 99999;

    /* renamed from: e */
    private static final int f2328e = 5;
    @Resource

    /* renamed from: f */
    private EventManager f2329f;
    @Resource

    /* renamed from: g */
    private Application f2330g;

    /* renamed from: h */
    private Thread.UncaughtExceptionHandler f2331h;

    /* renamed from: i */
    private Map<CrashReport, String> f2332i = new HashMap();

    /* renamed from: b */
    private void m103165b() {
        if (Thread.getDefaultUncaughtExceptionHandler() instanceof CrashManager) {
            return;
        }
        if (KiwiLogger.f2770a) {
            f2324a.m102829a("Registering Crash Handler");
        }
        this.f2331h = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: c */
    private boolean m103163c() {
        return this.f2332i.size() >= 5;
    }

    /* renamed from: d */
    private String[] m103161d() {
        return new File(this.f2330g.getFilesDir().getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING).list(new FilenameFilter() { // from class: com.amazon.a.a.b.b.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (str.endsWith(CrashManagerImpl.f2326c) && !CrashManagerImpl.this.f2332i.containsValue(str)) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public void mo102735e() {
        Assert.m102876a();
        m103165b();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (KiwiLogger.f2770a) {
            f2324a.m102828a("Crash detected", th);
        }
        try {
            m103167a(th);
            this.f2329f.mo103143a(new CrashEvent());
        } catch (Throwable th2) {
            if (KiwiLogger.f2770a) {
                f2324a.m102828a("Error occured while handling exception", th2);
            }
        }
        if (KiwiLogger.f2770a) {
            f2324a.m102829a("Calling previous handler");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2331h;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private void m103167a(Throwable th) {
        try {
            m103168a(m103169a(new CrashReport(this.f2330g, th)));
        } catch (Throwable th2) {
            if (KiwiLogger.f2771b) {
                f2324a.m102825b("Could not handle uncaught exception", th2);
            }
        }
    }

    /* renamed from: c */
    private String m103162c(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
            while (bufferedReader2.ready()) {
                try {
                    sb2.append(bufferedReader2.readLine());
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    FileUtils.m102877a(bufferedReader);
                    throw th;
                }
            }
            FileUtils.m102877a(bufferedReader2);
            return sb2.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: e */
    private String m103159e(String str) {
        return this.f2330g.getFilesDir().getAbsolutePath() + RemoteSettings.FORWARD_SLASH_STRING + str;
    }

    /* renamed from: d */
    private void m103160d(String str) {
        try {
            new File(str).delete();
        } catch (Exception e) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger = f2324a;
                kiwiLogger.m102825b("Cannot delete file: " + str, e);
            }
        }
    }

    /* renamed from: b */
    private CrashReport m103164b(String str) {
        try {
            return (CrashReport) Serializer.m102821a(m103162c(str));
        } catch (Exception unused) {
            if (KiwiLogger.f2771b) {
                KiwiLogger kiwiLogger = f2324a;
                kiwiLogger.m102826b("Failed to load crash report: " + str);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m103169a(CrashReport crashReport) {
        return Serializer.m102822a(crashReport);
    }

    /* renamed from: a */
    private synchronized void m103168a(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.f2330g.openFileOutput(f2325b + new Random().nextInt(f2327d) + f2326c, 0);
            fileOutputStream.write(str.getBytes());
        } catch (Exception e) {
            if (KiwiLogger.f2771b) {
                f2324a.m102825b("Coud not save crash report to file", e);
            }
        }
        FileUtils.m102878a(fileOutputStream);
    }

    @Override // com.amazon.p047a.p048a.p051b.CrashManager
    /* renamed from: a */
    public List<CrashReport> mo103171a() {
        if (m103163c()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] m103161d = m103161d();
        for (int i = 0; i < m103161d.length && !m103163c(); i++) {
            String m103159e = m103159e(m103161d[i]);
            CrashReport m103164b = m103164b(m103159e);
            if (m103164b != null) {
                this.f2332i.put(m103164b, m103159e);
                arrayList.add(m103164b);
            } else {
                m103160d(m103159e);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.p047a.p048a.p051b.CrashManager
    /* renamed from: a */
    public void mo103166a(List<CrashReport> list) {
        for (CrashReport crashReport : list) {
            m103160d(this.f2332i.get(crashReport));
            this.f2332i.remove(crashReport);
        }
    }
}
