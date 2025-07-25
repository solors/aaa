package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p852qf.ILoggerFactory;
import p852qf.InterfaceC39416a;
import p868rf.SubstituteLoggingEvent;

/* renamed from: org.slf4j.helpers.f */
/* loaded from: classes10.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {

    /* renamed from: a */
    boolean f103065a = false;

    /* renamed from: b */
    final Map<String, SubstituteLogger> f103066b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<SubstituteLoggingEvent> f103067c = new LinkedBlockingQueue<>();

    @Override // p852qf.ILoggerFactory
    /* renamed from: a */
    public synchronized InterfaceC39416a mo12749a(String str) {
        SubstituteLogger substituteLogger;
        substituteLogger = this.f103066b.get(str);
        if (substituteLogger == null) {
            substituteLogger = new SubstituteLogger(str, this.f103067c, this.f103065a);
            this.f103066b.put(str, substituteLogger);
        }
        return substituteLogger;
    }

    /* renamed from: b */
    public void m13372b() {
        this.f103066b.clear();
        this.f103067c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue<SubstituteLoggingEvent> m13371c() {
        return this.f103067c;
    }

    /* renamed from: d */
    public List<SubstituteLogger> m13370d() {
        return new ArrayList(this.f103066b.values());
    }

    /* renamed from: e */
    public void m13369e() {
        this.f103065a = true;
    }
}
