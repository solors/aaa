package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p852qf.InterfaceC39416a;
import p868rf.EventRecodingLogger;
import p868rf.LoggingEvent;
import p868rf.SubstituteLoggingEvent;

/* renamed from: org.slf4j.helpers.e */
/* loaded from: classes10.dex */
public class SubstituteLogger implements InterfaceC39416a {

    /* renamed from: b */
    private final String f103058b;

    /* renamed from: c */
    private volatile InterfaceC39416a f103059c;

    /* renamed from: d */
    private Boolean f103060d;

    /* renamed from: f */
    private Method f103061f;

    /* renamed from: g */
    private EventRecodingLogger f103062g;

    /* renamed from: h */
    private Queue<SubstituteLoggingEvent> f103063h;

    /* renamed from: i */
    private final boolean f103064i;

    public SubstituteLogger(String str, Queue<SubstituteLoggingEvent> queue, boolean z) {
        this.f103058b = str;
        this.f103063h = queue;
        this.f103064i = z;
    }

    /* renamed from: d */
    private InterfaceC39416a m13378d() {
        if (this.f103062g == null) {
            this.f103062g = new EventRecodingLogger(this, this.f103063h);
        }
        return this.f103062g;
    }

    @Override // p852qf.InterfaceC39416a
    /* renamed from: a */
    public void mo12256a(String str) {
        m13379c().mo12256a(str);
    }

    @Override // p852qf.InterfaceC39416a
    /* renamed from: b */
    public void mo12255b(String str) {
        m13379c().mo12255b(str);
    }

    /* renamed from: c */
    InterfaceC39416a m13379c() {
        if (this.f103059c != null) {
            return this.f103059c;
        }
        if (this.f103064i) {
            return NOPLogger.f103056c;
        }
        return m13378d();
    }

    /* renamed from: e */
    public boolean m13377e() {
        Boolean bool = this.f103060d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f103061f = this.f103059c.getClass().getMethod("log", LoggingEvent.class);
            this.f103060d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f103060d = Boolean.FALSE;
        }
        return this.f103060d.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f103058b.equals(((SubstituteLogger) obj).f103058b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m13376f() {
        return this.f103059c instanceof NOPLogger;
    }

    /* renamed from: g */
    public boolean m13375g() {
        if (this.f103059c == null) {
            return true;
        }
        return false;
    }

    @Override // p852qf.InterfaceC39416a
    public String getName() {
        return this.f103058b;
    }

    /* renamed from: h */
    public void m13374h(LoggingEvent loggingEvent) {
        if (m13377e()) {
            try {
                this.f103061f.invoke(this.f103059c, loggingEvent);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public int hashCode() {
        return this.f103058b.hashCode();
    }

    /* renamed from: i */
    public void m13373i(InterfaceC39416a interfaceC39416a) {
        this.f103059c = interfaceC39416a;
    }
}
