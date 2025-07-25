package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C37566w;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.c */
/* loaded from: classes9.dex */
public final class C35134c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C35137f fromModel(@NotNull C35132a c35132a) {
        int m17154x;
        C35137f c35137f = new C35137f();
        Set<String> set = c35132a.f95947a;
        m17154x = C37566w.m17154x(set, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (String str : set) {
            arrayList.add(str.getBytes(Charsets.UTF_8));
        }
        Object[] array = arrayList.toArray(new byte[0]);
        if (array != null) {
            c35137f.f95955a = (byte[][]) array;
            return c35137f;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r7 == null) goto L12;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.remotepermissions.impl.C35132a toModel(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.remotepermissions.impl.C35137f r7) {
        /*
            r6 = this;
            byte[][] r7 = r7.f95955a
            if (r7 == 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1d
            r3 = r7[r2]
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto Lc
        L1d:
            java.util.Set r7 = kotlin.collections.C37561t.m17215e1(r0)
            if (r7 != 0) goto L27
        L23:
            java.util.Set r7 = kotlin.collections.C37570x0.m17138f()
        L27:
            io.appmetrica.analytics.remotepermissions.impl.a r0 = new io.appmetrica.analytics.remotepermissions.impl.a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.remotepermissions.impl.C35134c.toModel(io.appmetrica.analytics.remotepermissions.impl.f):io.appmetrica.analytics.remotepermissions.impl.a");
    }
}
