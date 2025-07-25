package com.explorestack.iab.utils;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.vast.view.CircleCountdownView;
import com.explorestack.iab.vast.view.LinearCountdownView;
import com.explorestack.iab.vast.view.TextCountdownView;

/* renamed from: com.explorestack.iab.utils.q */
/* loaded from: classes3.dex */
public class C10532q extends AbstractC10527n<View> {
    public C10532q(@Nullable View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: j */
    View mo79213j(@NonNull Context context, @NonNull C10507d c10507d) {
        if (!"text".equals(c10507d.m79354x()) && !"text-reverse".equals(c10507d.m79354x())) {
            if (!"circular".equals(c10507d.m79354x()) && !"circular-reverse".equals(c10507d.m79354x())) {
                return new LinearCountdownView(context);
            }
            return new CircleCountdownView(context);
        }
        return new TextCountdownView(context);
    }

    @Override // com.explorestack.iab.utils.AbstractC10527n
    @NonNull
    /* renamed from: l */
    protected C10507d mo79212l(@NonNull Context context, @Nullable C10507d c10507d) {
        if (c10507d != null) {
            if (!"text".equals(c10507d.m79354x()) && !"text-reverse".equals(c10507d.m79354x())) {
                if ("circular".equals(c10507d.m79354x()) || "circular-reverse".equals(c10507d.m79354x())) {
                    return C10504a.f24003o;
                }
            } else {
                return C10504a.f24001m;
            }
        }
        return C10504a.f24002n;
    }

    /* renamed from: r */
    public void m79215r(float f, int i, int i2) {
        boolean z;
        C10507d c10507d = this.f24085c;
        if (c10507d == null) {
            return;
        }
        int i3 = 0;
        if (c10507d.m79354x() != null && this.f24085c.m79354x().endsWith("reverse")) {
            z = true;
        } else {
            z = false;
        }
        T t = this.f24084b;
        if (t instanceof TextCountdownView) {
            TextCountdownView textCountdownView = (TextCountdownView) t;
            if (i2 == 0) {
                textCountdownView.setText("");
                return;
            }
            if (z) {
                i = i2 - i;
            }
            textCountdownView.setRemaining(Math.max(1, i));
        } else if (t instanceof CircleCountdownView) {
            CircleCountdownView circleCountdownView = (CircleCountdownView) t;
            if (z) {
                if (i2 != 0) {
                    i3 = Math.max(1, i2 - i);
                }
                circleCountdownView.changePercentage(f, i3);
                return;
            }
            circleCountdownView.changePercentage(100.0f - f, i);
        } else if (t instanceof LinearCountdownView) {
            LinearCountdownView linearCountdownView = (LinearCountdownView) t;
            if (z) {
                f = 100.0f - f;
            }
            linearCountdownView.changePercentage(f);
        }
    }
}
