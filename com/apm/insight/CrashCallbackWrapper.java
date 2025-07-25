package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21018tj;
import org.json.JSONArray;

/* renamed from: com.apm.insight.b */
/* loaded from: classes2.dex */
public final class CrashCallbackWrapper implements ICrashCallback, IOOMCallback {

    /* renamed from: a */
    private IOOMCallback f3575a;

    /* renamed from: b */
    private ICrashCallback f3576b;

    /* renamed from: c */
    private String f3577c;

    public CrashCallbackWrapper(String str, ICrashCallback iCrashCallback) {
        this.f3577c = str;
        this.f3576b = iCrashCallback;
    }

    /* renamed from: a */
    public final void m102139a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j, JSONArray jSONArray) {
        if (this.f3575a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(AppDataCenter.m102166a(jSONArray.optJSONObject(i), "header", C21018tj.f53565b), this.f3577c)) {
                this.f3575a.onCrash(crashType, th, thread, j);
            }
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
    }

    public CrashCallbackWrapper(String str, IOOMCallback iOOMCallback) {
        this.f3577c = str;
        this.f3575a = iOOMCallback;
    }

    /* renamed from: a */
    public final void m102140a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f3576b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(AppDataCenter.m102166a(jSONArray.optJSONObject(i), "header", C21018tj.f53565b), this.f3577c)) {
                this.f3576b.onCrash(crashType, str, thread);
            }
        }
    }

    /* renamed from: a */
    public final void m102141a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        MonitorCrashHandler m102041a;
        if (this.f3576b == null || (m102041a = MonitorCrashHandler.m102041a(this.f3577c)) == null || !m102041a.m102040a(str3, str2)) {
            return;
        }
        this.f3576b.onCrash(crashType, str, null);
    }
}
