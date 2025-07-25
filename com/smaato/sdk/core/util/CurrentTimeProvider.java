package com.smaato.sdk.core.util;

import java.util.Calendar;

/* loaded from: classes7.dex */
public class CurrentTimeProvider {
    public long currentMillisUtc() {
        return System.currentTimeMillis();
    }

    public int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentMillisUtc());
        return calendar.get(1);
    }
}
