package com.pubmatic.sdk.crashanalytics;

import android.content.Context;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* compiled from: POBCrashAnalyticsUtils.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBCrashAnalyticsUtils {
    @NotNull
    public static final POBCrashAnalyticsUtils INSTANCE = new POBCrashAnalyticsUtils();

    private POBCrashAnalyticsUtils() {
    }

    @Nullable
    public static final String readFromFile(@NotNull Context context, @NotNull String fileName) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(context.getFilesDir(), fileName);
        boolean z = false;
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                Closeable.m1220a(bufferedReader, null);
            } catch (IOException e) {
                POBLog.debug("POBCrashAnalyticsUtils", "IOException caught while reading data from file: " + fileName + ". IOException Message -> " + e.getMessage(), new Object[0]);
            }
            if (sb2.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            return sb2.toString();
        }
        POBLog.debug("POBCrashAnalyticsUtils", fileName + " is not present in internal storage.", new Object[0]);
        return null;
    }

    public static final void writeToFile(@NotNull Context context, @NotNull String fileName, @NotNull String crashData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(crashData, "crashData");
        try {
            FileOutputStream openFileOutput = context.openFileOutput(fileName, 0);
            byte[] bytes = crashData.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            openFileOutput.write(bytes);
            Closeable.m1220a(openFileOutput, null);
        } catch (Exception e) {
            POBLog.debug("POBCrashAnalyticsUtils", "Exception caught while writing crash data to " + fileName + ". Message -> " + e.getMessage() + '.', new Object[0]);
        }
    }
}
