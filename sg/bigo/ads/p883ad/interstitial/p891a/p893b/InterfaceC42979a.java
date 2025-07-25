package sg.bigo.ads.p883ad.interstitial.p891a.p893b;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.ad.interstitial.a.b.a */
/* loaded from: classes10.dex */
public interface InterfaceC42979a {

    /* renamed from: sg.bigo.ads.ad.interstitial.a.b.a$a */
    /* loaded from: classes10.dex */
    public static final class C42980a {

        /* renamed from: a */
        Set<Integer> f112563a = new HashSet();

        /* renamed from: a */
        public final void m6241a(InterfaceC43550c interfaceC43550c, int i, long j) {
            if (this.f112563a.contains(Integer.valueOf(i))) {
                return;
            }
            this.f112563a.add(Integer.valueOf(i));
            C44136b.m3872a(interfaceC43550c, i, j, (String) null, -1, (String) null, (String) null);
        }

        /* renamed from: a */
        public final void m6240a(InterfaceC43550c interfaceC43550c, int i, long j, @Nullable String str, int i2, @Nullable String str2, @Nullable String str3) {
            if (this.f112563a.contains(Integer.valueOf(i))) {
                return;
            }
            this.f112563a.add(Integer.valueOf(i));
            C44136b.m3872a(interfaceC43550c, i, j, str, i2, str2, str3);
        }
    }

    @Nullable
    /* renamed from: a */
    View mo6250a();

    /* renamed from: a */
    void mo6249a(int i);

    /* renamed from: a */
    void mo6248a(int i, int i2);

    /* renamed from: a */
    boolean mo6247a(Context context);

    /* renamed from: b */
    boolean mo6246b();

    /* renamed from: c */
    void mo6245c();

    /* renamed from: d */
    void mo6244d();

    /* renamed from: e */
    void mo6243e();

    /* renamed from: f */
    void mo6242f();
}
