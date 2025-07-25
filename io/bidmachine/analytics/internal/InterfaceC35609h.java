package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.analytics.internal.h */
/* loaded from: classes9.dex */
public interface InterfaceC35609h {

    /* renamed from: io.bidmachine.analytics.internal.h$a */
    /* loaded from: classes9.dex */
    public static final class C35610a {

        /* renamed from: a */
        private final ReaderConfig.Rule f96463a;

        /* renamed from: b */
        private final String f96464b;

        /* renamed from: c */
        private final C35620j0 f96465c;

        public C35610a(ReaderConfig.Rule rule, String str, C35620j0 c35620j0) {
            this.f96463a = rule;
            this.f96464b = str;
            this.f96465c = c35620j0;
        }

        /* renamed from: a */
        public final String m20209a() {
            return this.f96464b;
        }

        /* renamed from: b */
        public final C35620j0 m20208b() {
            return this.f96465c;
        }

        /* renamed from: c */
        public final ReaderConfig.Rule m20207c() {
            return this.f96463a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35610a)) {
                return false;
            }
            C35610a c35610a = (C35610a) obj;
            if (Intrinsics.m17075f(this.f96463a, c35610a.f96463a) && Intrinsics.m17075f(this.f96464b, c35610a.f96464b) && Intrinsics.m17075f(this.f96465c, c35610a.f96465c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f96463a.hashCode() * 31;
            String str = this.f96464b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            C35620j0 c35620j0 = this.f96465c;
            if (c35620j0 != null) {
                i = c35620j0.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            return "Data(rule=" + this.f96463a + ", dataHash=" + this.f96464b + ", error=" + this.f96465c + ')';
        }

        public /* synthetic */ C35610a(ReaderConfig.Rule rule, String str, C35620j0 c35620j0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rule, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : c35620j0);
        }
    }

    /* renamed from: a */
    void mo20170a(List list);
}
