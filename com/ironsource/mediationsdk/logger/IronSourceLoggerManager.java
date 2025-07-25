package com.ironsource.mediationsdk.logger;

import com.ironsource.C19777dk;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: d */
    private static IronSourceLoggerManager f51654d;

    /* renamed from: c */
    private ArrayList<IronSourceLogger> f51655c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f51655c = new ArrayList<>();
        m56771c();
    }

    /* renamed from: a */
    private IronSourceLogger m56772a(String str) {
        Iterator<IronSourceLogger> it = this.f51655c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.m56776b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m56771c() {
        this.f51655c.add(new C20413a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (f51654d == null) {
                f51654d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            }
            ironSourceLoggerManager = f51654d;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f51655c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (m56775a(i)) {
            return;
        }
        m56773a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f51655c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f51655c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger m56772a = m56772a(str);
        if (m56772a != null) {
            if (i >= 0 && i <= 3) {
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
                log(ironSourceTag, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
                m56772a.setDebugLevel(i);
                return;
            }
            this.f51655c.remove(m56772a);
            return;
        }
        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
        log(ironSourceTag2, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.f51655c = new ArrayList<>();
        m56771c();
    }

    public static synchronized IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = f51654d;
            if (ironSourceLoggerManager2 == null) {
                f51654d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            } else {
                ironSourceLoggerManager2.f51650a = i;
            }
            ironSourceLoggerManager = f51654d;
        }
        return ironSourceLoggerManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m56774a(IronSourceLogger.IronSourceTag ironSourceTag, C19777dk c19777dk) {
        if (m56775a(c19777dk.m58875a())) {
            return;
        }
        m56773a(ironSourceTag, c19777dk.m58871c(), c19777dk.m58875a());
    }

    /* renamed from: a */
    private void m56773a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        Iterator<IronSourceLogger> it = this.f51655c.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.m56777a() <= i) {
                next.log(ironSourceTag, str, i);
            }
        }
    }

    /* renamed from: a */
    private boolean m56775a(int i) {
        return i < this.f51650a;
    }
}
