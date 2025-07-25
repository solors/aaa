package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.core.C43557d;
import sg.bigo.ads.api.core.InterfaceC43564h;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.api.b */
/* loaded from: classes10.dex */
public abstract class AbstractC43532b<T extends AbstractC43532b> {

    /* renamed from: a */
    public final String f114037a;

    /* renamed from: b */
    public final String f114038b;

    /* renamed from: c */
    public int f114039c;

    /* renamed from: d */
    public int f114040d;

    /* renamed from: e */
    public int f114041e;

    /* renamed from: f */
    public long f114042f;
    @NonNull

    /* renamed from: g */
    public final C43533a f114043g = new C43533a((byte) 0);

    /* renamed from: sg.bigo.ads.api.b$a */
    /* loaded from: classes10.dex */
    public static class C43533a implements InterfaceC43564h {

        /* renamed from: a */
        public String f114044a;
        @Nullable

        /* renamed from: b */
        public final String f114045b;
        @Nullable

        /* renamed from: c */
        String f114046c;
        @Nullable

        /* renamed from: d */
        String f114047d;
        @Nullable

        /* renamed from: e */
        String f114048e;

        /* renamed from: f */
        public long f114049f;

        /* renamed from: g */
        int f114050g;

        /* renamed from: h */
        String f114051h;

        /* renamed from: i */
        int f114052i;

        /* renamed from: j */
        long f114053j;

        /* renamed from: k */
        public long f114054k;

        /* renamed from: l */
        private long f114055l;

        /* renamed from: m */
        private long f114056m;

        private C43533a() {
            this.f114045b = UUID.randomUUID().toString();
            this.f114044a = "";
            this.f114046c = "";
            this.f114047d = "";
            this.f114048e = "";
            this.f114050g = 0;
            this.f114052i = 0;
            this.f114051h = "";
            this.f114053j = 0L;
            this.f114054k = 0L;
            this.f114055l = 0L;
            this.f114056m = 0L;
        }

        /* renamed from: a */
        public final void m5451a() {
            if (this.f114055l == 0) {
                this.f114055l = System.currentTimeMillis();
            }
        }

        /* renamed from: b */
        public final void m5445b() {
            if (this.f114056m == 0) {
                this.f114056m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        @Nullable
        /* renamed from: c */
        public final String mo5411c() {
            return this.f114045b;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        @Nullable
        /* renamed from: d */
        public final String mo5410d() {
            return this.f114046c;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        @Nullable
        /* renamed from: e */
        public final String mo5409e() {
            return this.f114047d;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        @Nullable
        /* renamed from: f */
        public final String mo5408f() {
            return this.f114048e;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: g */
        public final String mo5407g() {
            return this.f114044a;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: h */
        public final int mo5406h() {
            return this.f114050g;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: i */
        public final String mo5405i() {
            return this.f114051h;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: j */
        public final int mo5404j() {
            return this.f114052i;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: k */
        public final long mo5403k() {
            return this.f114049f;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: l */
        public final long mo5402l() {
            return this.f114053j;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: m */
        public final long mo5401m() {
            return this.f114054k;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: n */
        public final long mo5400n() {
            return this.f114055l;
        }

        @Override // sg.bigo.ads.api.core.InterfaceC43564h
        /* renamed from: o */
        public final long mo5399o() {
            return this.f114056m;
        }

        /* synthetic */ C43533a(byte b) {
            this();
        }
    }

    public AbstractC43532b(String str, @Nullable String str2) {
        this.f114037a = str;
        this.f114038b = str2;
    }

    @Nullable
    /* renamed from: a */
    public T mo5468a() {
        return null;
    }

    @Nullable
    /* renamed from: b */
    public C43557d mo5464b() {
        if (C43836q.m4837a((CharSequence) this.f114037a)) {
            return new C43557d(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    /* renamed from: c */
    public abstract int mo5358c();

    /* renamed from: c */
    public final void m5461c(int i) {
        this.f114043g.f114050g = i;
    }

    @Nullable
    /* renamed from: d */
    public Map<String, Object> mo5460d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo5459e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo5458f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo5457g() {
        return false;
    }

    /* renamed from: h */
    public InterfaceC43528l mo5456h() {
        return null;
    }

    /* renamed from: a */
    public final void m5466a(String str) {
        this.f114043g.f114044a = str;
    }

    /* renamed from: b */
    public final void m5463b(int i) {
        C43533a c43533a = this.f114043g;
        if (c43533a.f114053j == 0) {
            c43533a.f114052i = i;
            c43533a.f114053j = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void m5465a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        C43533a c43533a = this.f114043g;
        c43533a.f114046c = str;
        c43533a.f114047d = str2;
        c43533a.f114048e = str3;
    }

    /* renamed from: b */
    public final void m5462b(String str) {
        C43533a c43533a = this.f114043g;
        if (c43533a != null) {
            c43533a.f114051h = str;
        }
    }

    /* renamed from: a */
    public boolean mo5467a(int i) {
        return i != mo5358c();
    }
}
