package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.o2 */
/* loaded from: classes9.dex */
public final class C34766o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34865rl fromModel(@NonNull C34739n2 c34739n2) {
        C34812pl c34812pl;
        C34865rl c34865rl = new C34865rl();
        c34865rl.f95305a = new C34839ql[c34739n2.f94969a.size()];
        for (int i = 0; i < c34739n2.f94969a.size(); i++) {
            C34839ql c34839ql = new C34839ql();
            Pair pair = (Pair) c34739n2.f94969a.get(i);
            c34839ql.f95243a = (String) pair.first;
            if (pair.second != null) {
                c34839ql.f95244b = new C34812pl();
                C34712m2 c34712m2 = (C34712m2) pair.second;
                if (c34712m2 == null) {
                    c34812pl = null;
                } else {
                    C34812pl c34812pl2 = new C34812pl();
                    c34812pl2.f95186a = c34712m2.f94894a;
                    c34812pl = c34812pl2;
                }
                c34839ql.f95244b = c34812pl;
            }
            c34865rl.f95305a[i] = c34839ql;
        }
        return c34865rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34739n2 toModel(@NonNull C34865rl c34865rl) {
        C34839ql[] c34839qlArr;
        ArrayList arrayList = new ArrayList();
        for (C34839ql c34839ql : c34865rl.f95305a) {
            String str = c34839ql.f95243a;
            C34812pl c34812pl = c34839ql.f95244b;
            arrayList.add(new Pair(str, c34812pl == null ? null : new C34712m2(c34812pl.f95186a)));
        }
        return new C34739n2(arrayList);
    }
}
