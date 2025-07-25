package com.smaato.sdk.core.log;

import android.util.Log;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.log.a */
/* loaded from: classes7.dex */
class ConsoleLogWriter extends LogWriter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsoleLogWriter.java */
    /* renamed from: com.smaato.sdk.core.log.a$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C27167a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71645a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f71645a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71645a[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71645a[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71645a[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConsoleLogWriter(@NonNull LogLevel logLevel) {
        super(logLevel);
    }

    /* renamed from: d */
    private int m39499d(LogLevel logLevel) {
        int i = C27167a.f71645a[logLevel.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            if (i == 4) {
                return 6;
            }
            throw new IllegalArgumentException("Unknown level: " + logLevel);
        }
        return 5;
    }

    /* renamed from: e */
    private String m39498e(@NonNull String str) {
        Objects.requireNonNull(str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.log.LogWriter
    /* renamed from: b */
    public boolean mo39496b(@NonNull LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        if (logLevel.ordinal() >= m39497a().ordinal()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.smaato.sdk.core.log.LogWriter
    /* renamed from: c */
    public void mo39495c(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2) {
        int min;
        Objects.requireNonNull(logLevel);
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        String m39498e = m39498e(str);
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(10, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i + 4000);
                Log.println(m39499d(logLevel), m39498e, str2.substring(i, min));
                if (min >= indexOf) {
                    break;
                }
                i = min;
            }
            i = min + 1;
        }
    }
}
