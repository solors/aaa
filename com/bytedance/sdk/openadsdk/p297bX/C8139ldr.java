package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.ldr */
/* loaded from: classes3.dex */
public class C8139ldr extends ScrollView {

    /* renamed from: IL */
    private final C9109zx f17822IL;

    /* renamed from: bg */
    private final C8126eo f17823bg;

    public C8139ldr(Context context, C8126eo c8126eo) {
        super(context);
        this.f17823bg = c8126eo;
        C9109zx c9109zx = new C9109zx(context);
        this.f17822IL = c9109zx;
        c9109zx.setOrientation(1);
        addView(c9109zx, new FrameLayout.LayoutParams(-1, -2));
        if (c8126eo.m86969Kg() == 0) {
            m86933bg();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    /* renamed from: IL */
    private void m86935IL(List<FilterWord> list) {
        float f;
        this.f17822IL.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.f17822IL.addView(new C8138iR(getContext(), filterWord, this.f17823bg));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                Context context = getContext();
                if (this.f17823bg.m86968WR()) {
                    f = 16.0f;
                } else {
                    f = 8.0f;
                }
                int m82537bX = ZQc.m82537bX(context, f);
                layoutParams.topMargin = m82537bX;
                layoutParams.bottomMargin = m82537bX;
                this.f17822IL.addView(new C8115VB(getContext()), layoutParams);
            }
        }
    }

    /* renamed from: bX */
    private static List<FilterWord> m86934bX(List<FilterWord> list) {
        if (list != null && !list.isEmpty()) {
            int i = 0;
            int i2 = -1;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (list.get(i3).hasSecondOptions()) {
                    i2 = i3;
                }
            }
            if (i2 != -1 && i2 <= list.size()) {
                i = i2;
            }
            FilterWord filterWord = list.get(i);
            Iterator<FilterWord> it = list.iterator();
            while (it.hasNext()) {
                FilterWord next = it.next();
                if (!next.hasSecondOptions()) {
                    filterWord.addOption(next);
                    it.remove();
                }
            }
            return list;
        }
        return null;
    }

    /* renamed from: bg */
    private void m86933bg() {
        if (this.f17823bg.m86969Kg() != 0) {
            return;
        }
        this.f17823bg.m86963bg(ZQc.m82538bX(getContext()), ZQc.eqN(getContext()));
    }

    /* renamed from: bg */
    public void m86932bg(List<FilterWord> list) {
        List<FilterWord> m86934bX = m86934bX(list);
        if (m86934bX == null) {
            return;
        }
        m86935IL(m86934bX);
    }
}
