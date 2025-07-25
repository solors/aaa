package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.iahb.InAppBiddingException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SmaatoSdkInAppBidding {
    @Inject
    private static IahbInteractor iahbInteractor;
    @Inject
    private static Logger logger;

    private SmaatoSdkInAppBidding() {
    }

    public static /* synthetic */ void lambda$saveBid$0(AtomicReference atomicReference, String str) {
        atomicReference.set(Either.left(str));
    }

    public static /* synthetic */ void lambda$saveBid$1(AtomicReference atomicReference, InAppBiddingException inAppBiddingException) {
        atomicReference.set(Either.right(inAppBiddingException));
    }

    @NonNull
    public static String saveBid(@NonNull InAppBid inAppBid) throws InAppBiddingException {
        if (inAppBid != null) {
            final AtomicReference atomicReference = new AtomicReference();
            if (iahbInteractor == null || logger == null) {
                AndroidsInjector.injectStatic(SmaatoSdkInAppBidding.class);
            }
            IahbInteractor iahbInteractor2 = iahbInteractor;
            if (iahbInteractor2 == null) {
                Logger logger2 = logger;
                if (logger2 != null) {
                    logger2.error(LogDomain.INAPP_BIDDING, "InAppBidding module was not initialized", new Object[0]);
                }
                atomicReference.set(Either.right(new InAppBiddingException(InAppBiddingException.InApBiddingError.NOT_INITIALISED)));
            } else {
                iahbInteractor2.m39264f(inAppBid, new Consumer() { // from class: com.smaato.sdk.iahb.j
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        SmaatoSdkInAppBidding.lambda$saveBid$0(atomicReference, (String) obj);
                    }
                }, new Consumer() { // from class: com.smaato.sdk.iahb.k
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        SmaatoSdkInAppBidding.lambda$saveBid$1(atomicReference, (InAppBiddingException) obj);
                    }
                });
            }
            String str = (String) ((Either) atomicReference.get()).left();
            if (str != null) {
                return str;
            }
            InAppBiddingException inAppBiddingException = (InAppBiddingException) ((Either) atomicReference.get()).right();
            if (inAppBiddingException != null) {
                throw inAppBiddingException;
            }
            throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR);
        }
        throw new NullPointerException("'inAppBid' specified as non-null is null");
    }
}
