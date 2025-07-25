package com.unity3d.services.core.network.domain;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: CleanupDirectory.kt */
@Metadata
/* loaded from: classes7.dex */
final class CleanupDirectory$invoke$additionalFiles$2 extends Lambda implements Function2<Tuples<? extends Long, ? extends List<? extends File>>, File, Tuples<? extends Long, ? extends List<? extends File>>> {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Tuples<? extends Long, ? extends List<? extends File>> mo105910invoke(Tuples<? extends Long, ? extends List<? extends File>> tuples, File file) {
        return invoke2((Tuples<Long, ? extends List<? extends File>>) tuples, file);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Tuples<Long, List<File>> invoke2(@NotNull Tuples<Long, ? extends List<? extends File>> tuples, @NotNull File file) {
        List m17568K0;
        Intrinsics.checkNotNullParameter(tuples, "<name for destructuring parameter 0>");
        Intrinsics.checkNotNullParameter(file, "file");
        Long valueOf = Long.valueOf(tuples.m17632a().longValue() - file.length());
        m17568K0 = _Collections.m17568K0(tuples.m17631b(), file);
        return C38513v.m14532a(valueOf, m17568K0);
    }
}
