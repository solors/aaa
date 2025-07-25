package com.maticoo.sdk.mraid;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes6.dex */
public class Background {
    private static final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

    public static ScheduledThreadPoolExecutor getExecutor() {
        return executor;
    }
}
