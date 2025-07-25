package sg.bigo.ads.common.p933u;

/* renamed from: sg.bigo.ads.common.u.h */
/* loaded from: classes10.dex */
public class C43808h extends Exception {

    /* renamed from: a */
    public final int f114641a;

    /* renamed from: b */
    private String f114642b;

    /* renamed from: c */
    private Exception f114643c;

    public C43808h(int i, Exception exc) {
        this.f114641a = i;
        this.f114643c = exc;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc = this.f114643c;
        if (exc != null) {
            return exc.getMessage();
        }
        return this.f114642b;
    }

    public C43808h(int i, String str) {
        this.f114641a = i;
        this.f114642b = str;
    }
}
