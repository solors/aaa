package com.yandex.div.core.view2.divs.widgets;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p985ta.DivItemBuilderResult;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.g */
/* loaded from: classes8.dex */
public interface DivCollectionHolder {
    @Nullable
    List<DivItemBuilderResult> getItems();

    void setItems(@Nullable List<DivItemBuilderResult> list);
}
