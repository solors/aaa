package com.yandex.div.internal.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransientView.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.l */
/* loaded from: classes8.dex */
public final class C29823l implements TransientView {

    /* renamed from: b */
    private int f76207b;

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        if (this.f76207b != 0) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f76207b;
        if (i > 0) {
            int i2 = i - 1;
            this.f76207b = i2;
            if (i2 == 0) {
                view.invalidate();
            }
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f76207b + 1;
        this.f76207b = i;
        if (i == 1) {
            view.invalidate();
        }
    }
}
