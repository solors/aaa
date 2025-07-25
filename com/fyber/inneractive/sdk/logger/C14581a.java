package com.fyber.inneractive.sdk.logger;

import android.content.Context;
import android.util.Log;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.logger.a */
/* loaded from: classes4.dex */
public final class C14581a extends FMPLogger {
    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void debug(String str, Object... objArr) {
        if (IAlog.f30554a <= 3) {
            Log.d("Inneractive_debug", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void error(String str, Throwable th, Object... objArr) {
        if (IAlog.f30554a <= 6) {
            if (th == null) {
                Log.e("Inneractive_error", String.format(str, objArr));
            } else {
                Log.e("Inneractive_error", String.format(str, objArr), th);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void info(String str, Object... objArr) {
        if (IAlog.f30554a <= 4) {
            Log.i("Inneractive_info", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void log(int i, Exception exc, String str, Object... objArr) {
        if (IAlog.f30554a <= i) {
            if (exc == null) {
                Log.v("Inneractive_general", String.format(str, objArr));
            } else {
                Log.v("Inneractive_general", String.format(str, objArr), exc);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Object... objArr) {
        if (IAlog.f30554a <= 2) {
            Log.v("Inneractive_verbose", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void warning(String str, Object... objArr) {
        if (IAlog.f30554a <= 4) {
            Log.w("Inneractive_warning", String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Throwable th, Object... objArr) {
        if (IAlog.f30554a <= 2) {
            Log.v("Inneractive_verbose", String.format(str, objArr), th);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void initialize(Context context) {
    }
}
