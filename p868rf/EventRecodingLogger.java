package p868rf;

import java.util.Queue;
import org.slf4j.helpers.SubstituteLogger;
import p852qf.InterfaceC39416a;
import p852qf.InterfaceC39418c;

/* renamed from: rf.a */
/* loaded from: classes10.dex */
public class EventRecodingLogger implements InterfaceC39416a {

    /* renamed from: b */
    String f103951b;

    /* renamed from: c */
    SubstituteLogger f103952c;

    /* renamed from: d */
    Queue<SubstituteLoggingEvent> f103953d;

    public EventRecodingLogger(SubstituteLogger substituteLogger, Queue<SubstituteLoggingEvent> queue) {
        this.f103952c = substituteLogger;
        this.f103951b = substituteLogger.getName();
        this.f103953d = queue;
    }

    /* renamed from: c */
    private void m12254c(Level level, InterfaceC39418c interfaceC39418c, String str, Object[] objArr, Throwable th) {
        SubstituteLoggingEvent substituteLoggingEvent = new SubstituteLoggingEvent();
        substituteLoggingEvent.m12243j(System.currentTimeMillis());
        substituteLoggingEvent.m12250c(level);
        substituteLoggingEvent.m12249d(this.f103952c);
        substituteLoggingEvent.m12248e(this.f103951b);
        substituteLoggingEvent.m12247f(interfaceC39418c);
        substituteLoggingEvent.m12246g(str);
        substituteLoggingEvent.m12245h(Thread.currentThread().getName());
        substituteLoggingEvent.m12251b(objArr);
        substituteLoggingEvent.m12244i(th);
        this.f103953d.add(substituteLoggingEvent);
    }

    /* renamed from: d */
    private void m12253d(Level level, InterfaceC39418c interfaceC39418c, String str, Throwable th) {
        m12254c(level, interfaceC39418c, str, null, th);
    }

    @Override // p852qf.InterfaceC39416a
    /* renamed from: a */
    public void mo12256a(String str) {
        m12253d(Level.TRACE, null, str, null);
    }

    @Override // p852qf.InterfaceC39416a
    /* renamed from: b */
    public void mo12255b(String str) {
        m12253d(Level.WARN, null, str, null);
    }

    @Override // p852qf.InterfaceC39416a
    public String getName() {
        return this.f103951b;
    }
}
