package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.inmobi.media.j8 */
/* loaded from: classes6.dex */
public final class C19329j8 extends TextView {
    public C19329j8(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (getLineHeight() > 0) {
            i5 = i2 / getLineHeight();
        } else {
            i5 = 0;
        }
        if (i5 > 0) {
            setSingleLine(false);
            setLines(i5);
        }
        if (i5 == 1) {
            setSingleLine();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
