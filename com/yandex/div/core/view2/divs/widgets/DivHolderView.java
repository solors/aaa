package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.widget.TransientView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p985ta.ExpressionSubscriber;
import sb.DivBase;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.i */
/* loaded from: classes8.dex */
public interface DivHolderView<T extends DivBase> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    @Nullable
    BindingContext getBindingContext();

    @Nullable
    T getDiv();

    void setBindingContext(@Nullable BindingContext bindingContext);

    void setDiv(@Nullable T t);
}
