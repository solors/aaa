package com.google.android.play.core.review.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzi {

    /* renamed from: a */
    private final String f39232a;

    public zzi(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f39232a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    /* renamed from: a */
    private static String m70138a(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + C21114v8.C21123i.f54139e;
            }
        }
        return str + " : " + str2;
    }

    public final int zza(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m70138a(this.f39232a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int zzb(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m70138a(this.f39232a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int zzc(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m70138a(this.f39232a, str, objArr), th);
        }
        return 0;
    }

    public final int zzd(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m70138a(this.f39232a, str, objArr));
        }
        return 0;
    }

    public final int zze(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m70138a(this.f39232a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
