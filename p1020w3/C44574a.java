package p1020w3;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005a4.AnalyzePlatform;
import p1007v3.AnalyzeManager;

/* compiled from: Event.java */
/* renamed from: w3.a */
/* loaded from: classes6.dex */
public class C44574a {

    /* renamed from: a */
    protected String f116987a;

    /* renamed from: b */
    protected Bundle f116988b;

    /* renamed from: c */
    private final AnalyzePlatform[] f116989c;

    /* renamed from: d */
    private Double f116990d;

    /* renamed from: e */
    private boolean f116991e;

    /* compiled from: Event.java */
    /* renamed from: w3.a$a */
    /* loaded from: classes6.dex */
    public static class C44575a {

        /* renamed from: a */
        private final String f116992a;

        /* renamed from: b */
        private Bundle f116993b;

        /* renamed from: c */
        private AnalyzePlatform[] f116994c;

        /* renamed from: d */
        private Double f116995d;

        public C44575a(@NonNull String str) {
            this.f116992a = str;
        }

        /* renamed from: a */
        public C44574a m2366a() {
            C44574a c44574a;
            AnalyzePlatform[] analyzePlatformArr = this.f116994c;
            if (analyzePlatformArr == null) {
                c44574a = new C44574a(this.f116992a, this.f116993b, new AnalyzePlatform[0]);
            } else {
                c44574a = new C44574a(this.f116992a, this.f116993b, analyzePlatformArr);
            }
            Double d = this.f116995d;
            if (d != null) {
                c44574a.f116990d = d;
            }
            return c44574a;
        }

        /* renamed from: b */
        public C44575a m2365b(Bundle bundle) {
            this.f116993b = bundle;
            return this;
        }

        /* renamed from: c */
        public C44575a m2364c(AnalyzePlatform... analyzePlatformArr) {
            this.f116994c = analyzePlatformArr;
            return this;
        }

        /* renamed from: d */
        public C44575a m2363d(Double d) {
            this.f116995d = d;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44574a(@NonNull String str, @Nullable Bundle bundle, @Nullable AnalyzePlatform... analyzePlatformArr) {
        this.f116987a = str;
        this.f116988b = bundle;
        if (analyzePlatformArr != null && analyzePlatformArr.length == 1 && analyzePlatformArr[0] == null) {
            this.f116989c = null;
        } else {
            this.f116989c = analyzePlatformArr;
        }
    }

    @Nullable
    /* renamed from: f */
    public Bundle m2372f() {
        return this.f116988b;
    }

    @NonNull
    /* renamed from: g */
    public String m2371g() {
        return this.f116987a;
    }

    /* renamed from: h */
    public AnalyzePlatform[] mo2360h() {
        return this.f116989c;
    }

    /* renamed from: i */
    public Double m2370i() {
        return this.f116990d;
    }

    /* renamed from: j */
    public boolean m2369j() {
        return this.f116991e;
    }

    /* renamed from: k */
    public void mo2359k() {
        AnalyzeManager.m2724q(this);
    }

    /* renamed from: l */
    public void m2368l(boolean z) {
        this.f116991e = z;
    }

    /* renamed from: m */
    public void m2367m(Bundle bundle) {
        this.f116988b = bundle;
    }
}
