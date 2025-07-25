package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class Period {

    /* renamed from: a */
    private static final Pattern f92270a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;
    @NonNull
    public final TimeUnit timeUnit;

    /* loaded from: classes9.dex */
    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i, @NonNull TimeUnit timeUnit) {
        this.number = i;
        this.timeUnit = timeUnit;
    }

    @Nullable
    public static Period parse(@NonNull String str) {
        TimeUnit timeUnit;
        Matcher matcher = f92270a.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null && group2 != null) {
                try {
                    int parseInt = Integer.parseInt(group);
                    char charAt = group2.charAt(0);
                    if (charAt != 'D') {
                        if (charAt != 'M') {
                            if (charAt != 'W') {
                                if (charAt != 'Y') {
                                    timeUnit = TimeUnit.TIME_UNIT_UNKNOWN;
                                } else {
                                    timeUnit = TimeUnit.YEAR;
                                }
                            } else {
                                timeUnit = TimeUnit.WEEK;
                            }
                        } else {
                            timeUnit = TimeUnit.MONTH;
                        }
                    } else {
                        timeUnit = TimeUnit.DAY;
                    }
                    return new Period(parseInt, timeUnit);
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        if (this.number == period.number && this.timeUnit == period.timeUnit) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    @NonNull
    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
