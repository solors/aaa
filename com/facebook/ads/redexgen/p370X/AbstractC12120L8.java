package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.L8 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12120L8 {
    public static AdError A00(C12034Jg c12034Jg) {
        if (c12034Jg.A03().isPublicError()) {
            return new AdError(c12034Jg.A03().getErrorCode(), c12034Jg.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
