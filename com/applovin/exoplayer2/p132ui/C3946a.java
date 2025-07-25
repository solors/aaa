package com.applovin.exoplayer2.p132ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.p132ui.SubtitleView;
import com.applovin.impl.C3989a5;
import com.applovin.impl.C5815x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.a */
/* loaded from: classes2.dex */
final class C3946a extends View implements SubtitleView.InterfaceC3945a {

    /* renamed from: a */
    private final List f4260a;

    /* renamed from: b */
    private List f4261b;

    /* renamed from: c */
    private int f4262c;

    /* renamed from: d */
    private float f4263d;

    /* renamed from: f */
    private C5815x2 f4264f;

    /* renamed from: g */
    private float f4265g;

    public C3946a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static C3989a5 m101251a(C3989a5 c3989a5) {
        C3989a5.C3991b m101039b = c3989a5.m101054a().m101042b(-3.4028235E38f).m101040b(Integer.MIN_VALUE).m101039b((Layout.Alignment) null);
        if (c3989a5.f4493g == 0) {
            m101039b.m101048a(1.0f - c3989a5.f4492f, 0);
        } else {
            m101039b.m101048a((-c3989a5.f4492f) - 1.0f, 1);
        }
        int i = c3989a5.f4494h;
        if (i == 0) {
            m101039b.m101047a(2);
        } else if (i == 2) {
            m101039b.m101047a(0);
        }
        return m101039b.m101050a();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f4261b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i = paddingBottom - paddingTop;
            float m101113a = AbstractC3963h.m101113a(this.f4262c, this.f4263d, height, i);
            if (m101113a <= 0.0f) {
                return;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                C3989a5 c3989a5 = (C3989a5) list.get(i2);
                if (c3989a5.f4503q != Integer.MIN_VALUE) {
                    c3989a5 = m101251a(c3989a5);
                }
                C3989a5 c3989a52 = c3989a5;
                int i3 = paddingBottom;
                ((C3962g) this.f4260a.get(i2)).m101117a(c3989a52, this.f4264f, m101113a, AbstractC3963h.m101113a(c3989a52.f4501o, c3989a52.f4502p, height, i), this.f4265g, canvas, paddingLeft, paddingTop, width, i3);
                i2++;
                size = size;
                i = i;
                paddingBottom = i3;
                width = width;
            }
        }
    }

    public C3946a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4260a = new ArrayList();
        this.f4261b = Collections.emptyList();
        this.f4262c = 0;
        this.f4263d = 0.0533f;
        this.f4264f = C5815x2.f11863g;
        this.f4265g = 0.08f;
    }

    @Override // com.applovin.exoplayer2.p132ui.SubtitleView.InterfaceC3945a
    /* renamed from: a */
    public void mo101094a(List list, C5815x2 c5815x2, float f, int i, float f2) {
        this.f4261b = list;
        this.f4264f = c5815x2;
        this.f4263d = f;
        this.f4262c = i;
        this.f4265g = f2;
        while (this.f4260a.size() < list.size()) {
            this.f4260a.add(new C3962g(getContext()));
        }
        invalidate();
    }
}
