package com.explorestack.protobuf.ext;

import com.explorestack.protobuf.Duration;
import com.explorestack.protobuf.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class Timestamps {
    static final long MILLIS_PER_SECOND = 1000;
    static final long NANOS_PER_MICROSECOND = 1000;
    static final long NANOS_PER_MILLISECOND = 1000000;
    static final long NANOS_PER_SECOND = 1000000000;
    static final long TIMESTAMP_SECONDS_MAX = 253402300799L;
    static final long TIMESTAMP_SECONDS_MIN = -62135596800L;
    private static final ThreadLocal<SimpleDateFormat> timestampFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.explorestack.protobuf.ext.Timestamps.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return Timestamps.access$000();
        }
    };

    private Timestamps() {
    }

    static /* synthetic */ SimpleDateFormat access$000() {
        return createTimestampFormat();
    }

    public static Timestamp add(Timestamp timestamp, Duration duration) {
        checkValid(timestamp);
        return normalizedTimestamp(checkedAdd(timestamp.getSeconds(), duration.getSeconds()), checkedAdd(timestamp.getNanos(), duration.getNanos()));
    }

    private static void checkNoOverflow(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static Timestamp checkValid(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        if (isValid(seconds, nanos)) {
            return timestamp;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    private static int checkedAdd(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        int i = (int) j3;
        if (j3 == i) {
            z = true;
        } else {
            z = false;
        }
        checkNoOverflow(z, "checkedAdd", j, j2);
        return i;
    }

    private static int checkedMultiply(long j, long j2) {
        boolean z;
        long j3 = j * j2;
        int i = (int) j3;
        if (j3 == i) {
            z = true;
        } else {
            z = false;
        }
        checkNoOverflow(z, "checkedMultiply", j, j2);
        return i;
    }

    private static int checkedSubtract(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        int i = (int) j3;
        if (j3 == i) {
            z = true;
        } else {
            z = false;
        }
        checkNoOverflow(z, "checkedSubtract", j, j2);
        return i;
    }

    private static SimpleDateFormat createTimestampFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private static String formatNanos(int i) {
        long j = i;
        if (j % 1000000 == 0) {
            return String.format(Locale.ENGLISH, "%1$03d", Long.valueOf(j / 1000000));
        }
        if (j % 1000 == 0) {
            return String.format(Locale.ENGLISH, "%1$06d", Long.valueOf(j / 1000));
        }
        return String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
    }

    public static Timestamp fromMillis(long j) {
        return normalizedTimestamp(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static boolean isValid(long j, int i) {
        if (j < TIMESTAMP_SECONDS_MIN || j > TIMESTAMP_SECONDS_MAX || i < 0 || i >= 1000000000) {
            return false;
        }
        return true;
    }

    private static Timestamp normalizedTimestamp(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = checkedAdd(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (i < 0) {
            i = (int) (i + 1000000000);
            j = checkedSubtract(j, 1L);
        }
        return checkValid(Timestamp.newBuilder().setSeconds(j).setNanos(i).build());
    }

    private static int parseNanos(String str) throws ParseException {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) >= '0' && str.charAt(i2) <= '9') {
                    i += str.charAt(i2) - '0';
                } else {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
            }
        }
        return i;
    }

    private static long parseTimezoneOffset(String str) throws ParseException {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new ParseException("Invalid offset value: " + str, 0);
    }

    public static long toMillis(Timestamp timestamp) {
        checkValid(timestamp);
        return checkedAdd(checkedMultiply(timestamp.getSeconds(), 1000L), timestamp.getNanos() / 1000000);
    }

    public static String toString(Timestamp timestamp) {
        checkValid(timestamp);
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(timestampFormat.get().format(new Date(seconds * 1000)));
        if (nanos != 0) {
            sb2.append(".");
            sb2.append(formatNanos(nanos));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    public static Timestamp checkValid(Timestamp.Builder builder) {
        return checkValid(builder.build());
    }
}
