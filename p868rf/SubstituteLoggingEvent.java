package p868rf;

import org.slf4j.helpers.SubstituteLogger;
import p852qf.InterfaceC39418c;

/* renamed from: rf.d */
/* loaded from: classes10.dex */
public class SubstituteLoggingEvent implements LoggingEvent {

    /* renamed from: a */
    Level f103962a;

    /* renamed from: b */
    String f103963b;

    /* renamed from: c */
    SubstituteLogger f103964c;

    /* renamed from: d */
    String f103965d;

    /* renamed from: e */
    String f103966e;

    /* renamed from: f */
    Object[] f103967f;

    /* renamed from: g */
    long f103968g;

    /* renamed from: h */
    Throwable f103969h;

    /* renamed from: a */
    public SubstituteLogger m12252a() {
        return this.f103964c;
    }

    /* renamed from: b */
    public void m12251b(Object[] objArr) {
        this.f103967f = objArr;
    }

    /* renamed from: c */
    public void m12250c(Level level) {
        this.f103962a = level;
    }

    /* renamed from: d */
    public void m12249d(SubstituteLogger substituteLogger) {
        this.f103964c = substituteLogger;
    }

    /* renamed from: e */
    public void m12248e(String str) {
        this.f103963b = str;
    }

    /* renamed from: g */
    public void m12246g(String str) {
        this.f103966e = str;
    }

    /* renamed from: h */
    public void m12245h(String str) {
        this.f103965d = str;
    }

    /* renamed from: i */
    public void m12244i(Throwable th) {
        this.f103969h = th;
    }

    /* renamed from: j */
    public void m12243j(long j) {
        this.f103968g = j;
    }

    /* renamed from: f */
    public void m12247f(InterfaceC39418c interfaceC39418c) {
    }
}
