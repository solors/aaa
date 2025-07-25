package sg.bigo.ads.api.p904b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.C43557d;
import sg.bigo.ads.api.core.C43578p;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.common.p922j.C43709a;
import sg.bigo.ads.common.p937v.C43847a;

/* renamed from: sg.bigo.ads.api.b.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43534a<T extends InterfaceC43501Ad, U extends InterfaceC43550c> implements InterfaceC43501Ad, InterfaceC43538d<T> {
    @NonNull

    /* renamed from: M */
    protected final AbstractC43532b f114060M;
    @NonNull

    /* renamed from: N */
    protected C43847a f114061N;

    /* renamed from: P */
    protected AbstractC43534a f114063P;

    /* renamed from: J */
    public int f114057J = 0;

    /* renamed from: K */
    public int f114058K = 0;

    /* renamed from: L */
    public int f114059L = 0;

    /* renamed from: O */
    protected int f114062O = C43847a.f114694a;

    /* renamed from: Q */
    protected int f114064Q = 0;

    /* renamed from: sg.bigo.ads.api.b.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43535a {
        /* renamed from: a */
        void mo5437a(C43557d c43557d);

        /* renamed from: b */
        void mo5436b();
    }

    public AbstractC43534a(@NonNull AbstractC43532b abstractC43532b) {
        this.f114060M = abstractC43532b;
    }

    /* renamed from: F */
    public final AbstractC43534a m5455F() {
        return this.f114063P;
    }

    @Nullable
    /* renamed from: G */
    public final C43578p m5454G() {
        U mo5439f = mo5439f();
        if (mo5439f != null) {
            return mo5439f.mo4382Y();
        }
        return null;
    }

    /* renamed from: H */
    public final int m5453H() {
        return this.f114062O;
    }

    @NonNull
    /* renamed from: I */
    public final AbstractC43532b m5452I() {
        return this.f114060M;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(InterfaceC43501Ad interfaceC43501Ad) {
        if (interfaceC43501Ad == null) {
            return 1;
        }
        return mo5438g() >= (interfaceC43501Ad instanceof AbstractC43534a ? ((AbstractC43534a) interfaceC43501Ad).mo5438g() : 0.0d) ? 1 : -1;
    }

    /* renamed from: a */
    public abstract void mo5449a(int i, int i2, String str);

    /* renamed from: b */
    public abstract void mo6455b();

    /* renamed from: b */
    public void mo5444b(int i) {
        this.f114059L = i;
    }

    /* renamed from: b_ */
    public int mo5443b_() {
        int i = this.f114064Q + 1;
        this.f114064Q = i;
        return i;
    }

    /* renamed from: c */
    public abstract void mo5442c();

    /* renamed from: c */
    public void mo5441c(int i) {
        this.f114062O = i;
    }

    /* renamed from: d */
    public abstract String mo6450d();

    /* renamed from: e */
    public abstract long mo5440e();

    @NonNull
    /* renamed from: f */
    public abstract U mo5439f();

    /* renamed from: g */
    public double mo5438g() {
        AdBid bid = getBid();
        if (bid != null) {
            return bid.getPrice();
        }
        return (C43709a.m5152a(mo6450d(), mo5440e()) * 1.0d) / 1.0E8d;
    }

    /* renamed from: a */
    public void mo5450a(int i) {
        this.f114058K = i;
    }

    /* renamed from: a */
    public void mo5448a(String str, String str2, int i) {
    }

    /* renamed from: a */
    public void mo5446a(boolean z, boolean z2) {
        this.f114057J = z2 ? 1 : !z ? 2 : 3;
    }
}
