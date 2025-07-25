package com.pubmatic.sdk.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBVastErrorHandler {
    @NonNull

    /* renamed from: a */
    private final POBTrackerHandler f70807a;

    public POBVastErrorHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f70807a = pOBTrackerHandler;
    }

    /* renamed from: a */
    private boolean m40141a(@Nullable POBVastError pOBVastError) {
        if (pOBVastError != null && convertToPOBError(pOBVastError) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.pubmatic.sdk.common.POBError convertToPOBError(@androidx.annotation.NonNull com.pubmatic.sdk.video.POBVastError r2) {
        /*
            int r0 = r2.getErrorCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L5e
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 == r1) goto L5e
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5e
            r1 = 900(0x384, float:1.261E-42)
            if (r0 == r1) goto L52
            switch(r0) {
                case 100: goto L22;
                case 101: goto L22;
                case 102: goto L22;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 300: goto L52;
                case 301: goto L2e;
                case 302: goto L46;
                case 303: goto L46;
                case 304: goto L2e;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 400: goto L5e;
                case 401: goto L46;
                case 402: goto L3a;
                case 403: goto L5e;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 500: goto L5e;
                case 501: goto L46;
                case 502: goto L46;
                case 503: goto L5e;
                default: goto L20;
            }
        L20:
            r2 = 0
            return r2
        L22:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1, r2)
            return r0
        L2e:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1005(0x3ed, float:1.408E-42)
            r0.<init>(r1, r2)
            return r0
        L3a:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.<init>(r1, r2)
            return r0
        L46:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1002(0x3ea, float:1.404E-42)
            r0.<init>(r1, r2)
            return r0
        L52:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1006(0x3ee, float:1.41E-42)
            r0.<init>(r1, r2)
            return r0
        L5e:
            com.pubmatic.sdk.common.POBError r0 = new com.pubmatic.sdk.common.POBError
            java.lang.String r2 = r2.getErrorMessage()
            r1 = 1009(0x3f1, float:1.414E-42)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.video.POBVastErrorHandler.convertToPOBError(com.pubmatic.sdk.video.POBVastError):com.pubmatic.sdk.common.POBError");
    }

    public void executeVastErrors(@Nullable List<String> list, @NonNull POBVastError pOBVastError) {
        executeVastErrorsWithMacros(list, null, pOBVastError, null);
    }

    public void executeVastErrorsWithMacros(@Nullable List<String> list, @Nullable Map<Object, Object> map, @NonNull POBVastError pOBVastError, @Nullable Map<String, String> map2) {
        POBLog.debug("POBVastErrorHandler", "Vast error occurred: %s", pOBVastError.toString());
        if (list != null && !list.isEmpty()) {
            if (m40141a(pOBVastError)) {
                if (map == null) {
                    map = Collections.synchronizedMap(new HashMap(1));
                }
                map.put("[ERRORCODE]", "" + pOBVastError.getErrorCode());
                this.f70807a.handleTrackersForError(list, map, map2);
                return;
            }
            POBLog.warn("POBVastErrorHandler", "Skipped tracker execution for vast error: %d", Integer.valueOf(pOBVastError.getErrorCode()));
            return;
        }
        POBLog.warn("POBVastErrorHandler", "Tracker url list is empty for vast error: %d", new Object[0]);
    }
}
