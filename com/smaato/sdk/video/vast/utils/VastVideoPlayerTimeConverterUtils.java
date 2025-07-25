package com.smaato.sdk.video.vast.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class VastVideoPlayerTimeConverterUtils {
    @NonNull
    private static final Pattern PERCENTAGE_PATTERN = Pattern.compile("^(\\d?\\d(\\.\\d*)?|100(?:\\.0*)?)%$");
    @NonNull
    private static final Pattern TIME_PATTERN_SEMICOLON_OR_DOTS_WITH_MILLISECONDS = Pattern.compile("^(([01]?[0-9]|2[0-3])(:|\\.)[0-5][0-9](:|\\.)[0-5][0-9](:|\\.)\\d{1,3}$)");
    @NonNull
    private static final Pattern TIME_PATTERN_SEMICOLON_OR_DOTS_WITHOUT_MILLISECONDS = Pattern.compile("^(([01]?[0-9]|2[0-3])(:|\\.)[0-5][0-9](:|\\.)[0-5][0-9]$)");
    @NonNull
    private static final Pattern TIME_PATTERN_SEMICOLON_OR_DOTS_WITHOUT_HOURS = Pattern.compile("^([0-5][0-9](:|\\.)[0-5][0-9]$)");
    @NonNull
    private static final Pattern TIME_PATTERN_WITH_SECONDS = Pattern.compile("^([0-5][0-9]$)");

    private VastVideoPlayerTimeConverterUtils() {
    }

    private static long buildTimeOffset(@NonNull String str, @NonNull Logger logger, @NonNull String str2) {
        String replace = str.replace('.', ':');
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(replace).getTime();
        } catch (ParseException unused) {
            logger.debug(LogDomain.VAST, "Received invalid duration parameter: %s", replace);
            return -1L;
        }
    }

    public static long convertDurationStringToMilliseconds(@Nullable String str, @NonNull Logger logger) {
        if (!TextUtils.isEmpty(str)) {
            return getMillisecondsFromString(str, logger);
        }
        return -1L;
    }

    public static long convertOffsetStringToMilliseconds(@Nullable String str, long j, @NonNull Logger logger) {
        if (!TextUtils.isEmpty(str)) {
            long millisecondsFromString = getMillisecondsFromString(str, logger);
            if (millisecondsFromString >= 0) {
                return millisecondsFromString;
            }
            if (PERCENTAGE_PATTERN.matcher(str).matches()) {
                try {
                    float parseFloat = Float.parseFloat(str.replace("%", ""));
                    if (parseFloat == 0.0f) {
                        return -1L;
                    }
                    return Math.round((j / 100.0d) * parseFloat);
                } catch (NumberFormatException unused) {
                    logger.debug(LogDomain.VAST, "Invalid baseOffsetInMs value: %s", str);
                }
            }
        }
        return -1L;
    }

    public static int convertOffsetStringToPercentage(@Nullable String str, long j, @NonNull Logger logger) {
        if (j == 0) {
            return -1;
        }
        return (int) ((convertOffsetStringToMilliseconds(str, j, logger) * 100) / j);
    }

    private static long getMillisecondsFromString(@NonNull String str, @NonNull Logger logger) {
        if (TIME_PATTERN_SEMICOLON_OR_DOTS_WITH_MILLISECONDS.matcher(str).matches()) {
            return buildTimeOffset(str, logger, "HH:mm:ss:SSS");
        }
        if (TIME_PATTERN_SEMICOLON_OR_DOTS_WITHOUT_MILLISECONDS.matcher(str).matches()) {
            return buildTimeOffset(str, logger, "HH:mm:ss");
        }
        if (TIME_PATTERN_SEMICOLON_OR_DOTS_WITHOUT_HOURS.matcher(str).matches()) {
            return buildTimeOffset(str, logger, "mm:ss");
        }
        if (TIME_PATTERN_WITH_SECONDS.matcher(str).matches()) {
            return buildTimeOffset(str, logger, "ss");
        }
        return -1L;
    }
}
