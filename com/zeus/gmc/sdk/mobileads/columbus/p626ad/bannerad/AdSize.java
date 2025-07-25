package com.zeus.gmc.sdk.mobileads.columbus.p626ad.bannerad;

import android.content.Context;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.AdSize */
/* loaded from: classes8.dex */
public final class AdSize {
    private int coi222o222;
    private int coo2iico;
    public static final AdSize BANNER = new AdSize(320, 50);
    public static final AdSize LARGE_BANNER = new AdSize(320, 100);
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250);
    public static final AdSize FULL_BANNER = new AdSize(468, 90);
    public static final AdSize LEADERBOARD = new AdSize(728, 90);

    public AdSize(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                this.coo2iico = i;
                this.coi222o222 = i2;
                return;
            }
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
        throw new IllegalArgumentException("Invalid width for AdSize: " + i);
    }

    public final int getHeight() {
        return this.coi222o222;
    }

    public final int getHeightInPixels(Context context) {
        return (int) ((this.coi222o222 * context.getResources().getDisplayMetrics().density) + 0.5d);
    }

    public final int getWidth() {
        return this.coo2iico;
    }

    public final int getWidthInPixels(Context context) {
        return (int) ((this.coo2iico * context.getResources().getDisplayMetrics().density) + 0.5d);
    }
}
