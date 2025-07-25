package com.yandex.div.core.view2.divs.widgets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.o */
/* loaded from: classes8.dex */
public class MediaReleaseViewVisitor extends DivViewVisitor {
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    /* renamed from: r */
    public void mo36962r(@NotNull DivVideoView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.release();
    }
}
