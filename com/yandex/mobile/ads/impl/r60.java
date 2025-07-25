package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r60 {
    @NotNull

    /* renamed from: a */
    private final l60 f84646a;

    public /* synthetic */ r60() {
        this(new l60());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r5 == null) goto L44;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.C30705k7 m30137a(@org.jetbrains.annotations.Nullable com.yandex.mobile.ads.feed.FeedAdRequestConfiguration r4, @org.jetbrains.annotations.Nullable com.yandex.mobile.ads.feed.FeedAdAppearance r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L3c
            com.yandex.mobile.ads.impl.l60 r0 = r3.f84646a
            r0.getClass()
            java.lang.String r0 = "appearance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map r0 = kotlin.collections.C37554o0.m17371d()
            java.lang.Double r1 = r5.getCardCornerRadius()
            if (r1 == 0) goto L23
            java.lang.Double r1 = r5.getCardCornerRadius()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "card_corner_radius"
            r0.put(r2, r1)
        L23:
            java.lang.Integer r1 = r5.getCardWidth()
            if (r1 == 0) goto L36
            java.lang.Integer r5 = r5.getCardWidth()
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "card_width"
            r0.put(r1, r5)
        L36:
            java.util.Map r5 = kotlin.collections.C37554o0.m17372c(r0)
            if (r5 != 0) goto L40
        L3c:
            java.util.Map r5 = kotlin.collections.C37554o0.m17366j()
        L40:
            java.util.Map r0 = kotlin.collections.C37554o0.m17371d()
            r1 = 0
            if (r4 == 0) goto L4c
            java.util.Map r2 = r4.getParameters()
            goto L4d
        L4c:
            r2 = r1
        L4d:
            if (r2 == 0) goto L56
            java.util.Map r2 = r4.getParameters()
            r0.putAll(r2)
        L56:
            r0.putAll(r5)
            java.util.Map r5 = kotlin.collections.C37554o0.m17372c(r0)
            com.yandex.mobile.ads.impl.k7$a r0 = new com.yandex.mobile.ads.impl.k7$a
            if (r4 == 0) goto L66
            java.lang.String r2 = r4.getAdUnitId()
            goto L67
        L66:
            r2 = r1
        L67:
            if (r2 != 0) goto L6b
            java.lang.String r2 = ""
        L6b:
            r0.<init>(r2)
            if (r4 == 0) goto L75
            java.lang.String r2 = r4.getAge()
            goto L76
        L75:
            r2 = r1
        L76:
            com.yandex.mobile.ads.impl.k7$a r0 = r0.m32647a(r2)
            if (r4 == 0) goto L81
            java.lang.String r2 = r4.getGender()
            goto L82
        L81:
            r2 = r1
        L82:
            com.yandex.mobile.ads.impl.k7$a r0 = r0.m32641c(r2)
            if (r4 == 0) goto L8d
            java.lang.String r2 = r4.getContextQuery()
            goto L8e
        L8d:
            r2 = r1
        L8e:
            com.yandex.mobile.ads.impl.k7$a r0 = r0.m32642b(r2)
            if (r4 == 0) goto L99
            java.util.List r2 = r4.getContextTags()
            goto L9a
        L99:
            r2 = r1
        L9a:
            com.yandex.mobile.ads.impl.k7$a r0 = r0.m32646a(r2)
            if (r4 == 0) goto La4
            android.location.Location r1 = r4.getLocation()
        La4:
            com.yandex.mobile.ads.impl.k7$a r4 = r0.m32649a(r1)
            com.yandex.mobile.ads.impl.k7$a r4 = r4.m32645a(r5)
            com.yandex.mobile.ads.impl.k7 r4 = r4.m32650a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.r60.m30137a(com.yandex.mobile.ads.feed.FeedAdRequestConfiguration, com.yandex.mobile.ads.feed.FeedAdAppearance):com.yandex.mobile.ads.impl.k7");
    }

    public r60(@NotNull l60 appearanceParametersProvider) {
        Intrinsics.checkNotNullParameter(appearanceParametersProvider, "appearanceParametersProvider");
        this.f84646a = appearanceParametersProvider;
    }
}
