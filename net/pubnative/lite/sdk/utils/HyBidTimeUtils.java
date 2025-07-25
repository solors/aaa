package net.pubnative.lite.sdk.utils;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes10.dex */
public class HyBidTimeUtils {
    public static final Long SESSION_RENEWAL = 1800000L;

    private int calculateTimeInMinutes(long j) {
        return (int) ((j / 60000) % 60);
    }

    public Boolean IsStartingNewSession(long j) {
        boolean z;
        if (calculateTimeInMinutes(j) > 30) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Long calculateSessionDuration(Long l, Long l2) {
        return Long.valueOf(l.longValue() - l2.longValue());
    }

    public String getDaysSince(long j) {
        if (j <= 0) {
            return "0";
        }
        Date date = new Date(j);
        if (Calendar.getInstance().before(date)) {
            return "0";
        }
        return String.valueOf((new Date(System.currentTimeMillis()).getTime() - date.getTime()) / 86400000);
    }

    public String getSeconds(long j) {
        return String.valueOf(j / 1000);
    }

    public long updateExpirationTimeStamp(long j) {
        return j + SESSION_RENEWAL.longValue();
    }
}
