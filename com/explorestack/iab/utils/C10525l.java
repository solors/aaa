package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

/* renamed from: com.explorestack.iab.utils.l */
/* loaded from: classes3.dex */
public class C10525l extends AbstractC10527n<View> {
    public C10525l(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: j */
    View mo79213j(@NonNull Context context, @NonNull C10507d c10507d) {
        if ("text".equals(c10507d.m79354x())) {
            return new TextCountdownView(context);
        }
        return new CircleCountdownView(context);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: l */
    protected C10507d mo79212l(@NonNull Context context, @Nullable C10507d c10507d) {
        if (c10507d != null && "text".equals(c10507d.m79354x())) {
            return C10504a.f23997i;
        }
        return C10504a.f23996h;
    }

    /* renamed from: r */
    public void m79236r(int i, int i2) {
        T t = this.f24084b;
        if (t instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) t;
            if (i2 == 0) {
                textCountdownView.setText("");
            } else {
                textCountdownView.setRemaining(i2);
            }
        } else if (t instanceof CircleCountdownView) {
            ((CircleCountdownView) t).changePercentage(i, i2);
        }
    }
}
