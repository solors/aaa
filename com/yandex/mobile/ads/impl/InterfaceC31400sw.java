package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sw */
/* loaded from: classes8.dex */
public interface InterfaceC31400sw {

    /* renamed from: com.yandex.mobile.ads.impl.sw$a */
    /* loaded from: classes8.dex */
    public static final class C31401a implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        public static final C31401a f85404a = new C31401a();

        private C31401a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$b */
    /* loaded from: classes8.dex */
    public static final class C31402b implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        private final String f85405a;

        public C31402b(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f85405a = id2;
        }

        @NotNull
        /* renamed from: a */
        public final String m29523a() {
            return this.f85405a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31402b) && Intrinsics.m17075f(this.f85405a, ((C31402b) obj).f85405a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85405a.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f85405a;
            return "OnAdUnitClick(id=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$c */
    /* loaded from: classes8.dex */
    public static final class C31403c implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        public static final C31403c f85406a = new C31403c();

        private C31403c() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$d */
    /* loaded from: classes8.dex */
    public static final class C31404d implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        public static final C31404d f85407a = new C31404d();

        private C31404d() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$e */
    /* loaded from: classes8.dex */
    public static final class C31405e implements InterfaceC31400sw {

        /* renamed from: a */
        private final boolean f85408a;

        public C31405e(boolean z) {
            this.f85408a = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31405e) && this.f85408a == ((C31405e) obj).f85408a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85408a);
        }

        @NotNull
        public final String toString() {
            boolean z = this.f85408a;
            return "OnDebugErrorIndicatorSwitch(isChecked=" + z + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$f */
    /* loaded from: classes8.dex */
    public static final class C31406f implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        private final AbstractC31846xw.C31854g f85409a;

        public C31406f(@NotNull AbstractC31846xw.C31854g uiUnit) {
            Intrinsics.checkNotNullParameter(uiUnit, "uiUnit");
            this.f85409a = uiUnit;
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC31846xw.C31854g m29522a() {
            return this.f85409a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31406f) && Intrinsics.m17075f(this.f85409a, ((C31406f) obj).f85409a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85409a.hashCode();
        }

        @NotNull
        public final String toString() {
            AbstractC31846xw.C31854g c31854g = this.f85409a;
            return "OnMediationNetworkClick(uiUnit=" + c31854g + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$g */
    /* loaded from: classes8.dex */
    public static final class C31407g implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        public static final C31407g f85410a = new C31407g();

        private C31407g() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sw$h */
    /* loaded from: classes8.dex */
    public static final class C31408h implements InterfaceC31400sw {
        @NotNull

        /* renamed from: a */
        private final String f85411a;

        public C31408h(@NotNull String waring) {
            Intrinsics.checkNotNullParameter(waring, "waring");
            this.f85411a = waring;
        }

        @NotNull
        /* renamed from: a */
        public final String m29521a() {
            return this.f85411a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31408h) && Intrinsics.m17075f(this.f85411a, ((C31408h) obj).f85411a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85411a.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f85411a;
            return "OnWarningButtonClick(waring=" + str + ")";
        }
    }
}
