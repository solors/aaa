package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class ax0 {
    @NotNull

    /* renamed from: a */
    private final ow0 f76941a;

    /* renamed from: com.yandex.mobile.ads.impl.ax0$a */
    /* loaded from: classes8.dex */
    public static final class C29970a {
        @NotNull

        /* renamed from: a */
        private final String f76942a;
        @NotNull

        /* renamed from: b */
        private final EnumC29971a f76943b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.ax0$a$a */
        /* loaded from: classes8.dex */
        public static final class EnumC29971a {

            /* renamed from: b */
            public static final EnumC29971a f76944b;

            /* renamed from: c */
            public static final EnumC29971a f76945c;

            /* renamed from: d */
            private static final /* synthetic */ EnumC29971a[] f76946d;

            static {
                EnumC29971a enumC29971a = new EnumC29971a(0, "INFO");
                f76944b = enumC29971a;
                EnumC29971a enumC29971a2 = new EnumC29971a(1, "ERROR");
                f76945c = enumC29971a2;
                EnumC29971a[] enumC29971aArr = {enumC29971a, enumC29971a2};
                f76946d = enumC29971aArr;
                C44401b.m3113a(enumC29971aArr);
            }

            private EnumC29971a(int i, String str) {
            }

            public static EnumC29971a valueOf(String str) {
                return (EnumC29971a) Enum.valueOf(EnumC29971a.class, str);
            }

            public static EnumC29971a[] values() {
                return (EnumC29971a[]) f76946d.clone();
            }
        }

        public C29970a(@NotNull String message, @NotNull EnumC29971a type) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f76942a = message;
            this.f76943b = type;
        }

        @NotNull
        /* renamed from: a */
        public final String m35743a() {
            return this.f76942a;
        }

        @NotNull
        /* renamed from: b */
        public final EnumC29971a m35742b() {
            return this.f76943b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29970a)) {
                return false;
            }
            C29970a c29970a = (C29970a) obj;
            if (Intrinsics.m17075f(this.f76942a, c29970a.f76942a) && this.f76943b == c29970a.f76943b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f76943b.hashCode() + (this.f76942a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f76942a;
            EnumC29971a enumC29971a = this.f76943b;
            return "MediationNetworkMessage(message=" + str + ", type=" + enumC29971a + ")";
        }
    }

    public ax0(@NotNull ow0 mediationNetworkValidator) {
        Intrinsics.checkNotNullParameter(mediationNetworkValidator, "mediationNetworkValidator");
        this.f76941a = mediationNetworkValidator;
    }

    /* renamed from: a */
    private static void m35746a(ArrayList arrayList, String str) {
        String m16632E;
        String m16632E2;
        String m16632E3;
        int max = Math.max(4, 44 - str.length());
        int i = max / 2;
        m16632E = StringsJVM.m16632E("-", i);
        m16632E2 = StringsJVM.m16632E("-", (max % 2) + i);
        m16632E3 = StringsJVM.m16632E(" ", 1);
        arrayList.add(new C29970a(m16632E + m16632E3 + str + m16632E3 + m16632E2, C29970a.EnumC29971a.f76944b));
    }

    /* renamed from: a */
    private static void m35744a(ArrayList arrayList, List list, String str, boolean z) {
        C29970a.EnumC29971a enumC29971a;
        String str2;
        String str3;
        int m17154x;
        String m17521z0;
        if (z) {
            enumC29971a = C29970a.EnumC29971a.f76944b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            enumC29971a = C29970a.EnumC29971a.f76945c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        m17154x = C37566w.m17154x(list, 10);
        ArrayList arrayList2 = new ArrayList(m17154x);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nw0.C30984c) it.next()).m31259a());
        }
        m17521z0 = _Collections.m17521z0(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null);
        arrayList.add(new C29970a(m17521z0, enumC29971a));
        arrayList.add(new C29970a(str + ": " + str3, enumC29971a));
    }

    /* renamed from: a */
    private static void m35745a(ArrayList arrayList, String str, String str2) {
        boolean m16635B;
        boolean m16635B2;
        if (str != null) {
            m16635B2 = StringsJVM.m16635B(str);
            if (!m16635B2) {
                arrayList.add(new C29970a("SDK Version: " + str, C29970a.EnumC29971a.f76944b));
            }
        }
        if (str2 != null) {
            m16635B = StringsJVM.m16635B(str2);
            if (m16635B) {
                return;
            }
            arrayList.add(new C29970a("ADAPTERS Version: " + str2, C29970a.EnumC29971a.f76944b));
        }
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m35747a(@NotNull ArrayList networks) {
        Object m17531p0;
        Intrinsics.checkNotNullParameter(networks, "networks");
        ArrayList arrayList = new ArrayList();
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            nw0 nw0Var = (nw0) it.next();
            m35746a(arrayList, nw0Var.m31261c());
            String m31260d = nw0Var.m31260d();
            m17531p0 = _Collections.m17531p0(nw0Var.m31262b());
            String m31257b = ((nw0.C30984c) m17531p0).m31257b();
            this.f76941a.getClass();
            boolean m30871a = ow0.m30871a(nw0Var);
            if (m30871a) {
                m35745a(arrayList, m31260d, m31257b);
            }
            m35744a(arrayList, nw0Var.m31262b(), nw0Var.m31261c(), m30871a);
        }
        return arrayList;
    }
}
