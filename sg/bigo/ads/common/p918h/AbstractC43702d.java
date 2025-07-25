package sg.bigo.ads.common.p918h;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.C43808h;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p933u.p936c.C43803d;
import sg.bigo.ads.common.p942y.C43911a;

/* renamed from: sg.bigo.ads.common.h.d */
/* loaded from: classes10.dex */
public abstract class AbstractC43702d {

    /* renamed from: a */
    public String f114404a = "";

    /* renamed from: b */
    public boolean f114405b = false;

    /* renamed from: c */
    protected int f114406c = 0;

    /* renamed from: d */
    protected boolean f114407d = false;

    /* renamed from: a */
    protected abstract String mo3647a();

    /* renamed from: a */
    protected abstract void mo3646a(String str);

    /* renamed from: a */
    protected abstract boolean mo3645a(String str, String str2);

    /* renamed from: b */
    protected abstract String mo3643b();

    /* renamed from: b */
    protected final void m5161b(String str, String str2) {
        File file = new File(mo3643b());
        if (!file.exists() && !file.mkdir()) {
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(new File(file, mo3641c()));
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
            C43782a.m5010a(0, 4, mo3647a(), "Write JS file successfully");
            mo3646a(str2);
        } catch (Exception e) {
            String mo3647a = mo3647a();
            C43782a.m5009a(0, mo3647a, "write JS file error: " + e.getMessage());
        }
    }

    /* renamed from: b */
    protected abstract boolean mo3642b(String str);

    /* renamed from: c */
    protected abstract String mo3641c();

    /* renamed from: c */
    public final void m5160c(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C43795a c43795a = new C43795a(C43911a.m4595a(), new C43798d(str));
        c43795a.f114617k = RunnableC43792e.m4983h();
        C43807g.m4958a(c43795a, new AbstractC43793b<C43795a, C43803d>() { // from class: sg.bigo.ads.common.h.d.1
            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ C43803d mo3801a(@NonNull C43800a c43800a) {
                return new C43803d(c43800a);
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3803a(@NonNull C43795a c43795a2, @NonNull C43803d c43803d) {
                String m4964a = c43803d.m4964a();
                if (TextUtils.isEmpty(m4964a) || !AbstractC43702d.this.mo3642b(m4964a)) {
                    AbstractC43702d.this.m5158h();
                    return;
                }
                AbstractC43702d abstractC43702d = AbstractC43702d.this;
                abstractC43702d.f114404a = m4964a;
                abstractC43702d.f114405b = true;
                C43782a.m5010a(0, 4, abstractC43702d.mo3647a(), "Fetch js from network successfully");
                C43727d.m5108a(0, new Runnable() { // from class: sg.bigo.ads.common.h.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C437031 c437031 = C437031.this;
                        AbstractC43702d abstractC43702d2 = AbstractC43702d.this;
                        abstractC43702d2.m5161b(abstractC43702d2.f114404a, str);
                    }
                });
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3802a(@NonNull C43795a c43795a2, @NonNull C43808h c43808h) {
                String mo3647a = AbstractC43702d.this.mo3647a();
                C43782a.m5010a(0, 5, mo3647a, "fetch js from network fail: " + c43808h.getMessage());
                AbstractC43702d.this.m5158h();
            }
        });
    }

    /* renamed from: d */
    protected abstract String mo3640d();

    /* renamed from: e */
    protected abstract String mo3639e();

    /* renamed from: f */
    protected abstract String mo3638f();

    /* renamed from: g */
    public final void m5159g() {
        if (mo3645a(mo3639e(), mo3638f())) {
            String mo3647a = mo3647a();
            C43782a.m5010a(0, 3, mo3647a, "start fetch newest js content: " + mo3639e());
            m5160c(mo3639e());
        }
    }

    /* renamed from: h */
    protected final void m5158h() {
        if (!this.f114405b) {
            if (this.f114406c >= 2) {
                C43782a.m5010a(0, 5, mo3647a(), "the retry times has reached the limit");
                if (!this.f114407d) {
                    this.f114407d = true;
                    if (!TextUtils.isEmpty(mo3639e())) {
                        C43782a.m5010a(0, 3, mo3647a(), "start fetch newest js content: " + mo3639e());
                        m5160c(mo3639e());
                        return;
                    }
                    return;
                }
                return;
            }
            C43782a.m5010a(0, 3, mo3647a(), "try to re-fetch JS content...");
            this.f114406c++;
            m5160c(mo3640d());
        }
    }

    @Nullable
    /* renamed from: i */
    public final String m5157i() {
        File file = new File(mo3643b() + File.separator + mo3641c());
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    fileInputStream.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e) {
            String mo3647a = mo3647a();
            C43782a.m5009a(0, mo3647a, "get JS from file error: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: j */
    public final boolean m5156j() {
        return new File(mo3643b() + File.separator + mo3641c()).exists();
    }
}
