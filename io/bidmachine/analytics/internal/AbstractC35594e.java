package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.internal.AbstractC35601g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.e */
/* loaded from: classes9.dex */
public abstract class AbstractC35594e extends AbstractC35601g implements InterfaceC35598f {

    /* renamed from: d */
    private InterfaceC35598f f96421d;

    /* renamed from: e */
    private final Object f96422e = new Object();

    /* renamed from: f */
    private final Map f96423f = new LinkedHashMap();

    /* renamed from: g */
    private C35596b f96424g;

    /* renamed from: io.bidmachine.analytics.internal.e$a */
    /* loaded from: classes9.dex */
    public enum EnumC35595a {
        UNSPECIFIED,
        BANNER,
        INTERSTITIAL,
        REWARDED,
        NATIVE
    }

    /* renamed from: io.bidmachine.analytics.internal.e$b */
    /* loaded from: classes9.dex */
    public static final class C35596b {

        /* renamed from: a */
        private final int f96431a;

        /* renamed from: b */
        private final float f96432b;

        /* renamed from: c */
        private final String f96433c;

        /* renamed from: d */
        private final float f96434d;

        public C35596b(int i, float f, String str) {
            this.f96431a = i;
            this.f96432b = f;
            this.f96433c = str;
            this.f96434d = f * 1000;
        }

        /* renamed from: a */
        public final C35596b m20245a(int i, float f, String str) {
            return new C35596b(i, f, str);
        }

        /* renamed from: b */
        public final float m20243b() {
            return this.f96434d;
        }

        /* renamed from: c */
        public final String m20242c() {
            return this.f96433c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35596b)) {
                return false;
            }
            C35596b c35596b = (C35596b) obj;
            if (this.f96431a == c35596b.f96431a && Float.compare(this.f96432b, c35596b.f96432b) == 0 && Intrinsics.m17075f(this.f96433c, c35596b.f96433c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f96431a) * 31) + Float.hashCode(this.f96432b)) * 31) + this.f96433c.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ C35596b(int i, float f, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, f, str);
        }

        /* renamed from: a */
        public static /* synthetic */ C35596b m20244a(C35596b c35596b, int i, float f, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c35596b.f96431a;
            }
            if ((i2 & 2) != 0) {
                f = c35596b.f96432b;
            }
            if ((i2 & 4) != 0) {
                str = c35596b.f96433c;
            }
            return c35596b.m20245a(i, f, str);
        }

        /* renamed from: a */
        public final int m20246a() {
            return this.f96431a;
        }
    }

    /* renamed from: a */
    public final C35596b m20249a(EnumC35595a enumC35595a) {
        C35596b c35596b;
        synchronized (this.f96422e) {
            c35596b = (C35596b) this.f96423f.get(enumC35595a);
        }
        return c35596b;
    }

    /* renamed from: b */
    public final C35596b m20248b() {
        C35596b c35596b;
        synchronized (this.f96422e) {
            c35596b = this.f96424g;
        }
        return c35596b;
    }

    /* renamed from: b */
    public abstract C35596b mo20111b(Map map);

    /* renamed from: c */
    public abstract EnumC35595a mo20110c(Map map);

    @Override // io.bidmachine.analytics.internal.AbstractC35617j
    /* renamed from: f */
    public void mo20107f(Context context) {
        synchronized (this.f96422e) {
            this.f96423f.clear();
            this.f96424g = null;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public void mo20113a(AbstractC35601g.C35602a c35602a) {
        this.f96421d = c35602a.m20227a();
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35598f
    /* renamed from: a */
    public void mo20171a(Map map) {
        C35596b mo20111b;
        InterfaceC35598f interfaceC35598f = this.f96421d;
        if (interfaceC35598f != null) {
            interfaceC35598f.mo20171a(map);
        }
        EnumC35595a mo20110c = mo20110c(map);
        if (mo20110c == null || (mo20111b = mo20111b(map)) == null) {
            return;
        }
        synchronized (this.f96422e) {
            C35596b c35596b = this.f96424g;
            this.f96424g = C35596b.m20244a(mo20111b, (c35596b != null ? c35596b.m20246a() : 0) + 1, 0.0f, null, 6, null);
            C35596b c35596b2 = (C35596b) this.f96423f.get(mo20110c);
            this.f96423f.put(mo20110c, c35596b2 == null ? C35596b.m20244a(mo20111b, 1, 0.0f, null, 6, null) : C35596b.m20244a(mo20111b, c35596b2.m20246a() + 1, 0.0f, null, 6, null));
            Unit unit = Unit.f99208a;
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35598f
    /* renamed from: a */
    public void mo20172a(C35620j0 c35620j0) {
        InterfaceC35598f interfaceC35598f = this.f96421d;
        if (interfaceC35598f != null) {
            interfaceC35598f.mo20172a(c35620j0);
        }
    }
}
