package com.pubmatic.sdk.common.log;

import android.util.Log;
import androidx.annotation.Keep;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: POBLog.java */
@Keep
/* loaded from: classes7.dex */
public class POBDefaultLogger implements POBLog.POBLogging {

    /* renamed from: com.pubmatic.sdk.common.log.POBDefaultLogger$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C26699a {

        /* renamed from: a */
        static final /* synthetic */ int[] f70103a;

        static {
            int[] iArr = new int[OpenWrapSDK.LogLevel.values().length];
            f70103a = iArr;
            try {
                iArr[OpenWrapSDK.LogLevel.Info.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70103a[OpenWrapSDK.LogLevel.Warn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70103a[OpenWrapSDK.LogLevel.Debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70103a[OpenWrapSDK.LogLevel.Verbose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.log.POBLog.POBLogging
    public void log(POBLog.POBLogMessage pOBLogMessage) {
        int i = C26699a.f70103a[pOBLogMessage.mLogLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Log.v(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
                    }
                } else {
                    Log.d(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
                }
            } else {
                Log.w(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
            }
        } else {
            Log.i(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
        if (pOBLogMessage.mLogLevel == OpenWrapSDK.LogLevel.Error) {
            Log.e(pOBLogMessage.mTAG, pOBLogMessage.mMsg);
        }
    }
}
