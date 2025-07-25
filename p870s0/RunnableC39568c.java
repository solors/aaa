package p870s0;

import org.json.JSONObject;
import p024b1.AbstractC3343c;
import p1049y0.C44996b;
import p1064z0.AbstractC45105a;
import p975t0.C44346a;
import p989u0.C44417b;
import p989u0.EnumC44419d;

/* renamed from: s0.c */
/* loaded from: classes3.dex */
public final class RunnableC39568c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Runnable f103971b;

    /* renamed from: c */
    public final /* synthetic */ C39570e f103972c;

    public RunnableC39568c(C39570e c39570e, RunnableC39569d runnableC39569d) {
        this.f103972c = c39570e;
        this.f103971b = runnableC39569d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44346a m901a;
        C39570e c39570e = this.f103972c;
        if (c39570e.mo12228a()) {
            try {
                m901a = AbstractC45105a.m901a(new JSONObject(c39570e.f103985l.version()));
            } catch (Exception e) {
                C44417b.m3083a(EnumC44419d.ONE_DT_GENERAL_ERROR, e);
                C44996b.m1100b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e.toString());
            }
            c39570e.f103984k = m901a;
            AbstractC3343c.f1550b.post(this.f103971b);
        }
        m901a = new C44346a(false, "");
        c39570e.f103984k = m901a;
        AbstractC3343c.f1550b.post(this.f103971b);
    }
}
