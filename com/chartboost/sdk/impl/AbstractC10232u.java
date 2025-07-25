package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.chartboost.sdk.impl.u */
/* loaded from: classes3.dex */
public abstract class AbstractC10232u {

    /* renamed from: a */
    public final String f23207a;

    /* renamed from: b */
    public final EndpointRepository.EndPoint f23208b;

    /* renamed from: c */
    public final EndpointRepository.EndPoint f23209c;

    /* renamed from: d */
    public final boolean f23210d;

    /* renamed from: e */
    public final boolean f23211e;

    /* renamed from: f */
    public final boolean f23212f;

    /* renamed from: com.chartboost.sdk.impl.u$a */
    /* loaded from: classes3.dex */
    public static final class C10233a extends AbstractC10232u {

        /* renamed from: g */
        public static final C10233a f23213g = new C10233a();

        public C10233a() {
            super("Banner", EndpointRepository.EndPoint.BANNER_GET, EndpointRepository.EndPoint.BANNER_SHOW, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10233a)) {
                return false;
            }
            C10233a c10233a = (C10233a) obj;
            return true;
        }

        public int hashCode() {
            return 312973325;
        }

        public String toString() {
            return "Banner";
        }
    }

    /* renamed from: com.chartboost.sdk.impl.u$b */
    /* loaded from: classes3.dex */
    public static final class C10234b extends AbstractC10232u {

        /* renamed from: g */
        public static final C10234b f23214g = new C10234b();

        public C10234b() {
            super("Interstitial", EndpointRepository.EndPoint.INTERSTITIAL_GET, EndpointRepository.EndPoint.INTERSTITIAL_SHOW, false, false, 24, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10234b)) {
                return false;
            }
            C10234b c10234b = (C10234b) obj;
            return true;
        }

        public int hashCode() {
            return 743805773;
        }

        public String toString() {
            return "Interstitial";
        }
    }

    /* renamed from: com.chartboost.sdk.impl.u$c */
    /* loaded from: classes3.dex */
    public static final class C10235c extends AbstractC10232u {

        /* renamed from: g */
        public static final C10235c f23215g = new C10235c();

        public C10235c() {
            super("Rewarded", EndpointRepository.EndPoint.REWARDED_GET, EndpointRepository.EndPoint.REWARDED_SHOW, false, false, 8, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10235c)) {
                return false;
            }
            C10235c c10235c = (C10235c) obj;
            return true;
        }

        public int hashCode() {
            return 1735897263;
        }

        public String toString() {
            return "Rewarded";
        }
    }

    public AbstractC10232u(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2) {
        this.f23207a = str;
        this.f23208b = endPoint;
        this.f23209c = endPoint2;
        this.f23210d = z;
        this.f23211e = z2;
        this.f23212f = !z;
    }

    /* renamed from: a */
    public final EndpointRepository.EndPoint m80473a() {
        return this.f23208b;
    }

    /* renamed from: b */
    public final String m80472b() {
        return this.f23207a;
    }

    /* renamed from: c */
    public final boolean m80471c() {
        return this.f23210d;
    }

    /* renamed from: d */
    public final EndpointRepository.EndPoint m80470d() {
        return this.f23209c;
    }

    /* renamed from: e */
    public final boolean m80469e() {
        return this.f23212f;
    }

    public /* synthetic */ AbstractC10232u(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, null);
    }

    public /* synthetic */ AbstractC10232u(String str, EndpointRepository.EndPoint endPoint, EndpointRepository.EndPoint endPoint2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, endPoint, endPoint2, z, z2);
    }
}
