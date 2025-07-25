package com.smaato.sdk.core.browser;

import android.view.View;

/* loaded from: classes7.dex */
public abstract class DoubleClickPreventionListener implements View.OnClickListener {
    private long lastClickTimestamp;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTimestamp < 1000) {
            return;
        }
        this.lastClickTimestamp = currentTimeMillis;
        processClick();
    }

    protected void processClick() {
    }
}
