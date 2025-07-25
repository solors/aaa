package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.md */
/* loaded from: classes6.dex */
public interface InterfaceC20338md {

    @Metadata
    /* renamed from: com.ironsource.md$a */
    /* loaded from: classes6.dex */
    public static final class C20339a implements InterfaceC20338md {
        @NotNull

        /* renamed from: a */
        private final InterfaceC20146jd f51235a;

        public C20339a(@NotNull InterfaceC20146jd failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f51235a = failure;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC20146jd m57104a() {
            return this.f51235a;
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC20146jd m57100b() {
            return this.f51235a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C20339a) && Intrinsics.m17075f(this.f51235a, ((C20339a) obj).f51235a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f51235a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f51235a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C20339a m57103a(@NotNull InterfaceC20146jd failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new C20339a(failure);
        }

        /* renamed from: a */
        public static /* synthetic */ C20339a m57102a(C20339a c20339a, InterfaceC20146jd interfaceC20146jd, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC20146jd = c20339a.f51235a;
            }
            return c20339a.m57103a(interfaceC20146jd);
        }

        @Override // com.ironsource.InterfaceC20338md
        /* renamed from: a */
        public void mo57101a(@NotNull InterfaceC20519nd handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.mo55290a(this.f51235a);
        }
    }

    /* renamed from: a */
    default void mo57101a(@NotNull InterfaceC20519nd handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }
}
