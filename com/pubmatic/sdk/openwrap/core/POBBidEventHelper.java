package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;

/* loaded from: classes7.dex */
public class POBBidEventHelper {

    /* renamed from: com.pubmatic.sdk.openwrap.core.POBBidEventHelper$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C26791a {

        /* renamed from: a */
        static final /* synthetic */ int[] f70615a;

        static {
            int[] iArr = new int[POBBidEvent.BidEventError.values().length];
            f70615a = iArr;
            try {
                iArr[POBBidEvent.BidEventError.CLIENT_SIDE_AUCTION_LOSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70615a[POBBidEvent.BidEventError.BID_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70615a[POBBidEvent.BidEventError.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    public static POBError convertToPOBError(@NonNull POBBidEvent.BidEventError bidEventError) {
        int i = C26791a.f70615a[bidEventError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new POBError(1006, bidEventError.getErrorMessage());
            }
            return new POBError(1011, bidEventError.getErrorMessage());
        }
        return new POBError(3001, bidEventError.getErrorMessage());
    }
}
