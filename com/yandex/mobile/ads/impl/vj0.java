package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C32011zr;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vj0 {
    @NotNull

    /* renamed from: a */
    private final m92 f86767a;

    /* renamed from: com.yandex.mobile.ads.impl.vj0$a */
    /* loaded from: classes8.dex */
    private static final class C31661a implements Comparator<df1> {
        @Override // java.util.Comparator
        public final int compare(df1 df1Var, df1 df1Var2) {
            df1 first = df1Var;
            df1 second = df1Var2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (Intrinsics.m17075f(first, second)) {
                return 0;
            }
            String m26630e = first.m34949a().m26630e();
            String m26630e2 = second.m34949a().m26630e();
            if (Intrinsics.m17075f(m26630e, InstreamAdBreakType.PREROLL) || (!Intrinsics.m17075f(m26630e2, InstreamAdBreakType.PREROLL) && !Intrinsics.m17075f(m26630e, InstreamAdBreakType.POSTROLL) && (Intrinsics.m17075f(m26630e2, InstreamAdBreakType.POSTROLL) || first.m34948b() < second.m34948b()))) {
                return -1;
            }
            return 1;
        }
    }

    public vj0(@NotNull m92 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f86767a = videoPlayerController;
    }

    @NotNull
    /* renamed from: a */
    public final uj0 m28298a(@NotNull List<C31920yr> adBreaks) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : adBreaks) {
            if (Intrinsics.m17075f(((C31920yr) obj3).m26630e(), InstreamAdBreakType.MIDROLL)) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C31920yr c31920yr = (C31920yr) it.next();
            C32011zr m26633b = c31920yr.m26633b();
            long m26011b = m26633b.m26011b();
            if (C32011zr.EnumC32012a.f89080b == m26633b.m26012a()) {
                m26011b = (((float) m26011b) / 100) * ((float) this.f86767a.m32064b());
            }
            arrayList.add(new df1(c31920yr, m26011b));
        }
        Collections.sort(arrayList, new C31661a());
        Iterator<T> it2 = adBreaks.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (Intrinsics.m17075f(((C31920yr) obj2).m26630e(), InstreamAdBreakType.PREROLL)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C31920yr c31920yr2 = (C31920yr) obj2;
        Iterator<T> it3 = adBreaks.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (Intrinsics.m17075f(((C31920yr) next).m26630e(), InstreamAdBreakType.POSTROLL)) {
                obj = next;
                break;
            }
        }
        return new uj0(arrayList, c31920yr2, (C31920yr) obj);
    }
}
