package net.pubnative.lite.sdk.utils.browser;

import android.view.View;

/* loaded from: classes10.dex */
public abstract class DoubleClickPreventionListener implements View.OnClickListener {
    private static final long MIN_CLICK_INTERVAL_MS = 1000;
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
