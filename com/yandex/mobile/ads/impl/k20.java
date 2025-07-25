package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C32011zr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class k20 {

    /* renamed from: com.yandex.mobile.ads.impl.k20$a */
    /* loaded from: classes8.dex */
    private static final class C30690a {
        @NotNull

        /* renamed from: a */
        private final String f81233a;
        @NotNull

        /* renamed from: b */
        private final C32011zr.EnumC32012a f81234b;

        /* renamed from: c */
        private final long f81235c;

        public C30690a(@NotNull String adBreakType, @NotNull C32011zr.EnumC32012a adBreakPositionType, long j) {
            Intrinsics.checkNotNullParameter(adBreakType, "adBreakType");
            Intrinsics.checkNotNullParameter(adBreakPositionType, "adBreakPositionType");
            this.f81233a = adBreakType;
            this.f81234b = adBreakPositionType;
            this.f81235c = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30690a)) {
                return false;
            }
            C30690a c30690a = (C30690a) obj;
            if (Intrinsics.m17075f(this.f81233a, c30690a.f81233a) && this.f81234b == c30690a.f81234b && this.f81235c == c30690a.f81235c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f81234b.hashCode();
            return Long.hashCode(this.f81235c) + ((hashCode + (this.f81233a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f81233a;
            C32011zr.EnumC32012a enumC32012a = this.f81234b;
            long j = this.f81235c;
            return "AdBreakSignature(adBreakType=" + str + ", adBreakPositionType=" + enumC32012a + ", adBreakPositionValue=" + j + ")";
        }
    }

    @NotNull
    /* renamed from: a */
    public static ArrayList m32686a(@NotNull ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = adBreaks.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C31920yr c31920yr = (C31920yr) next;
            if (hashSet.add(new C30690a(c31920yr.m26630e(), c31920yr.m26633b().m26012a(), c31920yr.m26633b().m26011b()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
