package com.yandex.div.core.view2.divs.widgets;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p985ta.DivItemBuilderResult;

/* compiled from: DivCollectionHolder.kt */
@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.h */
/* loaded from: classes8.dex */
public final class C29687h implements DivCollectionHolder {
    @Nullable

    /* renamed from: b */
    private List<DivItemBuilderResult> f75676b;

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    @Nullable
    public List<DivItemBuilderResult> getItems() {
        return this.f75676b;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivCollectionHolder
    public void setItems(@Nullable List<DivItemBuilderResult> list) {
        this.f75676b = list;
    }
}
