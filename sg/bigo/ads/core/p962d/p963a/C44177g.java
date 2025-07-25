package sg.bigo.ads.core.p962d.p963a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.Map;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.core.p962d.C44153a;

/* renamed from: sg.bigo.ads.core.d.a.g */
/* loaded from: classes10.dex */
public class C44177g {

    /* renamed from: b */
    private static final String f115963b = "g";
    @NonNull

    /* renamed from: c */
    private final Map<String, String> f115965c;

    /* renamed from: d */
    private final C43579q f115966d;

    /* renamed from: e */
    private final String f115967e;

    /* renamed from: f */
    private final String f115968f;

    /* renamed from: g */
    private final String f115969g;

    /* renamed from: i */
    private int f115971i;

    /* renamed from: h */
    private final int[] f115970h = {0, 30000, 300000};

    /* renamed from: a */
    int f115964a = 0;

    private C44177g(@NonNull Map<String, String> map, C43579q c43579q, int i, String str, String str2, String str3) {
        this.f115965c = map;
        this.f115966d = c43579q;
        this.f115967e = str;
        this.f115968f = str2;
        this.f115969g = str3;
        this.f115971i = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m3739b(String str) {
        if (str == null || str.length() < 40) {
            return str;
        }
        return str.substring(0, 20) + APSSharedUtil.TRUNCATE_SEPARATOR + str.substring(str.length() - 10);
    }

    /* renamed from: e */
    static /* synthetic */ void m3735e(C44177g c44177g) {
        if (TextUtils.equals("va_show", c44177g.f115967e) || TextUtils.equals("va_cli", c44177g.f115967e) || TextUtils.equals("va_cpn_imp", c44177g.f115967e) || TextUtils.equals("va_cpn_cli", c44177g.f115967e)) {
            int i = c44177g.f115964a + 1;
            c44177g.f115964a = i;
            c44177g.m3744a(i);
        }
    }

    /* renamed from: a */
    public static C44177g m3742a(@NonNull Map<String, String> map, C43579q c43579q, int i, String str, String str2, String str3) {
        return new C44177g(map, c43579q, i, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m3740b() {
        String str = f115963b;
        C43782a.m5010a(0, 3, str, "Vast tracker request start, action: " + this.f115967e + ", url: " + m3739b(this.f115968f));
        C44153a.m3810a(this.f115967e, this.f115968f, this.f115969g, this.f115971i, false, this.f115964a, this.f115965c, new C44153a.InterfaceC44155a() { // from class: sg.bigo.ads.core.d.a.g.2
            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: a */
            public final void mo3734a() {
                String str2 = C44177g.f115963b;
                C43782a.m5010a(0, 3, str2, "Vast tracker request error, action: " + C44177g.this.f115967e + ", url: " + C44177g.m3739b(C44177g.this.f115968f));
                C44177g.m3735e(C44177g.this);
            }

            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: b */
            public final void mo3732b() {
                String str2 = C44177g.f115963b;
                C43782a.m5010a(0, 3, str2, "Vast tracker request success, action: " + C44177g.this.f115967e + ", url: " + C44177g.m3739b(C44177g.this.f115968f));
            }

            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: a */
            public final boolean mo3733a(int i) {
                return C44177g.this.f115966d != null && C44177g.this.f115966d.m5373a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3744a(int i) {
        if (i >= 3) {
            String str = f115963b;
            C43782a.m5010a(0, 3, str, "Vast tracker retry time exceed, action: " + this.f115967e + ", url: " + m3739b(this.f115968f));
            return;
        }
        int[] iArr = this.f115970h;
        int i2 = iArr[i % iArr.length];
        if (i2 <= 0) {
            m3740b();
            return;
        }
        String str2 = f115963b;
        C43782a.m5010a(0, 3, str2, "Vast tracker retry after " + i2 + " ms, action: " + this.f115967e + ", url: " + m3739b(this.f115968f));
        C43727d.m5107a(1, new Runnable() { // from class: sg.bigo.ads.core.d.a.g.1
            @Override // java.lang.Runnable
            public final void run() {
                C44177g.this.m3740b();
            }
        }, (long) i2);
    }
}
