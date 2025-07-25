package sg.bigo.ads.core.p969g;

import android.text.TextUtils;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.common.C43736o;
import sg.bigo.ads.common.p918h.AbstractC43702d;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;

/* renamed from: sg.bigo.ads.core.g.a */
/* loaded from: classes10.dex */
public final class C44217a extends AbstractC43702d {

    /* renamed from: e */
    private static final C44217a f116076e = new C44217a();

    /* renamed from: f */
    private final String f116077f;

    private C44217a() {
        boolean mo5375a = C43525i.f114036a.mo4461m().mo5375a(0);
        this.f116077f = C43525i.f114036a.mo4460n();
        if (!mo5375a) {
            return;
        }
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.g.a.1
            @Override // java.lang.Runnable
            public final void run() {
                C44217a.m3644a(C44217a.this);
            }
        });
    }

    /* renamed from: k */
    public static C44217a m3637k() {
        return f116076e;
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: a */
    public final String mo3647a() {
        return "BannerJsManager";
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: b */
    public final String mo3643b() {
        return C43736o.m5084g();
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: c */
    public final String mo3641c() {
        return "banner_insert_js.js";
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: d */
    public final String mo3640d() {
        return null;
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: e */
    public final String mo3639e() {
        return this.f116077f;
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: f */
    public final String mo3638f() {
        return C43906a.m4627h();
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: a */
    public final void mo3646a(String str) {
        C43906a.m4639c(str);
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: b */
    public final boolean mo3642b(String str) {
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m3644a(C44217a c44217a) {
        if (c44217a.m5156j()) {
            String m5157i = c44217a.m5157i();
            c44217a.f114404a = m5157i;
            if (!TextUtils.isEmpty(m5157i)) {
                C43782a.m5008a("BannerJsManager", "Fetch banner js from file successfully.");
                c44217a.f114405b = true;
            }
        }
        c44217a.m5159g();
    }

    @Override // sg.bigo.ads.common.p918h.AbstractC43702d
    /* renamed from: a */
    public final boolean mo3645a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) ? false : true;
    }
}
