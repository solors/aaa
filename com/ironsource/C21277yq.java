package com.ironsource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.yq */
/* loaded from: classes6.dex */
public final class C21277yq {
    @Nullable

    /* renamed from: a */
    private final String f54672a;
    @Nullable

    /* renamed from: b */
    private final List<String> f54673b;

    /* renamed from: c */
    private final boolean f54674c;

    public C21277yq(@Nullable String str, @Nullable List<String> list, boolean z) {
        this.f54672a = str;
        this.f54673b = list;
        this.f54674c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0062 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m53941a() {
        /*
            r7 = this;
            boolean r0 = r7.f54674c
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L38
            java.util.List<java.lang.String> r0 = r7.f54673b
            if (r0 == 0) goto L68
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L13
            goto L34
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r7.f54672a
            if (r6 == 0) goto L2f
            boolean r5 = kotlin.text.C37686h.m16713M(r6, r5, r3, r2, r1)
            if (r5 != r4) goto L2f
            r5 = r4
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L17
            r0 = r4
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 != r4) goto L68
            goto L67
        L38:
            java.util.List<java.lang.String> r0 = r7.f54673b
            if (r0 == 0) goto L68
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L43
            goto L64
        L43:
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r7.f54672a
            if (r6 == 0) goto L5f
            boolean r5 = kotlin.text.C37686h.m16706R(r6, r5, r3, r2, r1)
            if (r5 != r4) goto L5f
            r5 = r4
            goto L60
        L5f:
            r5 = r3
        L60:
            if (r5 == 0) goto L47
            r0 = r4
            goto L65
        L64:
            r0 = r3
        L65:
            if (r0 != r4) goto L68
        L67:
            r3 = r4
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C21277yq.m53941a():boolean");
    }

    @Nullable
    /* renamed from: b */
    public final String m53940b() {
        return this.f54672a;
    }

    public /* synthetic */ C21277yq(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
