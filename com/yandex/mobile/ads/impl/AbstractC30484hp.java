package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hp */
/* loaded from: classes8.dex */
public abstract class AbstractC30484hp {

    /* renamed from: com.yandex.mobile.ads.impl.hp$a */
    /* loaded from: classes8.dex */
    public static final class C30485a extends AbstractC30484hp {
        @Nullable

        /* renamed from: a */
        private final String f80143a;

        public C30485a(@Nullable String str) {
            super(0);
            this.f80143a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m33495a() {
            return this.f80143a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30485a) && Intrinsics.m17075f(this.f80143a, ((C30485a) obj).f80143a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f80143a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f80143a;
            return "AdditionalConsent(value=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hp$b */
    /* loaded from: classes8.dex */
    public static final class C30486b extends AbstractC30484hp {

        /* renamed from: a */
        private final boolean f80144a;

        public C30486b(boolean z) {
            super(0);
            this.f80144a = z;
        }

        /* renamed from: a */
        public final boolean m33494a() {
            return this.f80144a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30486b) && this.f80144a == ((C30486b) obj).f80144a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f80144a);
        }

        @NotNull
        public final String toString() {
            boolean z = this.f80144a;
            return "CmpPresent(value=" + z + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hp$c */
    /* loaded from: classes8.dex */
    public static final class C30487c extends AbstractC30484hp {
        @Nullable

        /* renamed from: a */
        private final String f80145a;

        public C30487c(@Nullable String str) {
            super(0);
            this.f80145a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m33493a() {
            return this.f80145a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30487c) && Intrinsics.m17075f(this.f80145a, ((C30487c) obj).f80145a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f80145a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f80145a;
            return "ConsentString(value=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hp$d */
    /* loaded from: classes8.dex */
    public static final class C30488d extends AbstractC30484hp {
        @Nullable

        /* renamed from: a */
        private final String f80146a;

        public C30488d(@Nullable String str) {
            super(0);
            this.f80146a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m33492a() {
            return this.f80146a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30488d) && Intrinsics.m17075f(this.f80146a, ((C30488d) obj).f80146a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f80146a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f80146a;
            return "Gdpr(value=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hp$e */
    /* loaded from: classes8.dex */
    public static final class C30489e extends AbstractC30484hp {
        @Nullable

        /* renamed from: a */
        private final String f80147a;

        public C30489e(@Nullable String str) {
            super(0);
            this.f80147a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m33491a() {
            return this.f80147a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30489e) && Intrinsics.m17075f(this.f80147a, ((C30489e) obj).f80147a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f80147a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f80147a;
            return "PurposeConsents(value=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hp$f */
    /* loaded from: classes8.dex */
    public static final class C30490f extends AbstractC30484hp {
        @Nullable

        /* renamed from: a */
        private final String f80148a;

        public C30490f(@Nullable String str) {
            super(0);
            this.f80148a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m33490a() {
            return this.f80148a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30490f) && Intrinsics.m17075f(this.f80148a, ((C30490f) obj).f80148a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f80148a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f80148a;
            return "VendorConsents(value=" + str + ")";
        }
    }

    private AbstractC30484hp() {
    }

    public /* synthetic */ AbstractC30484hp(int i) {
        this();
    }
}
