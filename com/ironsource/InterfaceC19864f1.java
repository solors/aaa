package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f1 */
/* loaded from: classes6.dex */
public interface InterfaceC19864f1 {

    @Metadata
    /* renamed from: com.ironsource.f1$a */
    /* loaded from: classes6.dex */
    public static final class C19865a implements InterfaceC19864f1 {
        @NotNull

        /* renamed from: c */
        public static final C19866a f49979c = new C19866a(null);

        /* renamed from: a */
        private final boolean f49980a;
        @Nullable

        /* renamed from: b */
        private final String f49981b;

        @Metadata
        /* renamed from: com.ironsource.f1$a$a */
        /* loaded from: classes6.dex */
        public static final class C19866a {
            private C19866a() {
            }

            public /* synthetic */ C19866a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* renamed from: a */
            public final C19865a m58731a() {
                return new C19865a(false, "ad is invalid due to loading time", 1, null);
            }

            @NotNull
            /* renamed from: a */
            public final C19865a m58730a(@Nullable String str) {
                return new C19865a(false, str, 1, null);
            }
        }

        public C19865a() {
            this(false, null, 3, null);
        }

        /* renamed from: a */
        public static /* synthetic */ C19865a m58736a(C19865a c19865a, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c19865a.mo58729a();
            }
            if ((i & 2) != 0) {
                str = c19865a.f49981b;
            }
            return c19865a.m58735a(z, str);
        }

        /* renamed from: b */
        public final boolean m58734b() {
            return mo58729a();
        }

        @Nullable
        /* renamed from: c */
        public final String m58733c() {
            return this.f49981b;
        }

        @Nullable
        /* renamed from: d */
        public final String m58732d() {
            return this.f49981b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19865a)) {
                return false;
            }
            C19865a c19865a = (C19865a) obj;
            if (mo58729a() == c19865a.mo58729a() && Intrinsics.m17075f(this.f49981b, c19865a.f49981b)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int hashCode;
            boolean mo58729a = mo58729a();
            ?? r0 = mo58729a;
            if (mo58729a) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.f49981b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i + hashCode;
        }

        @NotNull
        public String toString() {
            return "NotReady(isReady=" + mo58729a() + ", reason=" + this.f49981b + ')';
        }

        public C19865a(boolean z, @Nullable String str) {
            this.f49980a = z;
            this.f49981b = str;
        }

        @NotNull
        /* renamed from: a */
        public final C19865a m58735a(boolean z, @Nullable String str) {
            return new C19865a(z, str);
        }

        public /* synthetic */ C19865a(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC19864f1
        /* renamed from: a */
        public boolean mo58729a() {
            return this.f49980a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f1$b */
    /* loaded from: classes6.dex */
    public static final class C19867b implements InterfaceC19864f1 {

        /* renamed from: a */
        private final boolean f49982a;

        public C19867b() {
            this(false, 1, null);
        }

        /* renamed from: a */
        public static /* synthetic */ C19867b m58728a(C19867b c19867b, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c19867b.mo58729a();
            }
            return c19867b.m58727a(z);
        }

        /* renamed from: b */
        public final boolean m58726b() {
            return mo58729a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19867b) && mo58729a() == ((C19867b) obj).mo58729a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean mo58729a = mo58729a();
            if (mo58729a) {
                return 1;
            }
            return mo58729a ? 1 : 0;
        }

        @NotNull
        public String toString() {
            return "Ready(isReady=" + mo58729a() + ')';
        }

        public C19867b(boolean z) {
            this.f49982a = z;
        }

        @NotNull
        /* renamed from: a */
        public final C19867b m58727a(boolean z) {
            return new C19867b(z);
        }

        public /* synthetic */ C19867b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        @Override // com.ironsource.InterfaceC19864f1
        /* renamed from: a */
        public boolean mo58729a() {
            return this.f49982a;
        }
    }

    /* renamed from: a */
    boolean mo58729a();
}
