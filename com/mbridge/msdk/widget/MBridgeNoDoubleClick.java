package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.mbridge.msdk.widget.a */
/* loaded from: classes6.dex */
public abstract class MBridgeNoDoubleClick implements View.OnClickListener {
    public static final int MIN_CLICK_DELAY_TIME = 2000;
    private long lastClickTime = 0;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.lastClickTime > 2000) {
            this.lastClickTime = timeInMillis;
            onNoDoubleClick(view);
        }
    }

    protected abstract void onNoDoubleClick(View view);
}
