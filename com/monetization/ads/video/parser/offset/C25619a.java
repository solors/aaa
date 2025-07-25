package com.monetization.ads.video.parser.offset;

import com.yandex.mobile.ads.impl.b02;
import com.yandex.mobile.ads.impl.d02;
import com.yandex.mobile.ads.impl.pf1;
import com.yandex.mobile.ads.impl.tc1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.monetization.ads.video.parser.offset.a */
/* loaded from: classes7.dex */
public final class C25619a {
    @NotNull

    /* renamed from: a */
    private final Set<b02> f66580a;
    @NotNull

    /* renamed from: b */
    private final tc1 f66581b;
    @NotNull

    /* renamed from: c */
    private final pf1 f66582c;
    @NotNull

    /* renamed from: d */
    private final d02 f66583d;

    /* JADX WARN: Multi-variable type inference failed */
    public C25619a(@NotNull Set<? extends b02> allowedFormats, @NotNull tc1 percentageParser, @NotNull pf1 positionParser, @NotNull d02 timeParser) {
        Intrinsics.checkNotNullParameter(allowedFormats, "allowedFormats");
        Intrinsics.checkNotNullParameter(percentageParser, "percentageParser");
        Intrinsics.checkNotNullParameter(positionParser, "positionParser");
        Intrinsics.checkNotNullParameter(timeParser, "timeParser");
        this.f66580a = allowedFormats;
        this.f66581b = percentageParser;
        this.f66582c = positionParser;
        this.f66583d = timeParser;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0078, code lost:
        if (r0 <= 100.0f) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00bb  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.monetization.ads.video.parser.offset.VastTimeOffset m44261a(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.video.parser.offset.C25619a.m44261a(java.lang.String):com.monetization.ads.video.parser.offset.VastTimeOffset");
    }

    public /* synthetic */ C25619a(Set set) {
        this(set, new tc1(), new pf1(), new d02());
    }
}
