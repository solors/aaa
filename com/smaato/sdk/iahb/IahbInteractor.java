package com.smaato.sdk.iahb;

import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p568ad.AdFormat;
import com.smaato.sdk.core.p572ub.AdMarkup;
import com.smaato.sdk.core.p572ub.UbCache;
import com.smaato.sdk.core.p572ub.UbId;
import com.smaato.sdk.core.util.HeaderValueUtils;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.iahb.InAppBiddingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.iahb.e */
/* loaded from: classes7.dex */
public final class IahbInteractor {
    @NonNull

    /* renamed from: a */
    private final UbCache f72051a;
    @NonNull

    /* renamed from: b */
    private final IahbJsonAdapter f72052b;
    @NonNull

    /* renamed from: c */
    private final Logger f72053c;
    @NonNull

    /* renamed from: d */
    private final ExpirationTimestampFactory f72054d;
    @NonNull

    /* renamed from: e */
    private final HeaderValueUtils f72055e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IahbInteractor(@NonNull UbCache ubCache, @NonNull IahbJsonAdapter iahbJsonAdapter, @NonNull ExpirationTimestampFactory expirationTimestampFactory, @NonNull HeaderValueUtils headerValueUtils, @NonNull Logger logger) {
        this.f72051a = ubCache;
        this.f72052b = iahbJsonAdapter;
        this.f72054d = expirationTimestampFactory;
        this.f72055e = headerValueUtils;
        this.f72053c = logger;
    }

    /* renamed from: a */
    private AdMarkup m39269a(String str, IahbBid iahbBid, AdFormat adFormat) {
        ImpressionCountingType impressionCountingType;
        AdMarkup.Builder adFormat2 = AdMarkup.builder().markup(iahbBid.adm()).adFormat(adFormat.toString());
        if (iahbBid.ext().impressionMeasurement() != null) {
            impressionCountingType = iahbBid.ext().impressionMeasurement();
        } else {
            impressionCountingType = ImpressionCountingType.STANDARD;
        }
        return adFormat2.impressionCountingType(impressionCountingType).expiresAt(this.f72054d.createExpirationTimestampFor(iahbBid.ext().expiresAt(), null)).sessionId(str).bundleId(iahbBid.bundleId()).adSpaceId(iahbBid.ext().adspaceid()).build();
    }

    /* renamed from: b */
    private InAppBiddingException m39268b(Exception exc) {
        if (exc instanceof InAppBiddingException) {
            return (InAppBiddingException) exc;
        }
        return new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR, exc);
    }

    /* renamed from: c */
    private AdFormat m39267c(IahbBid iahbBid) throws InAppBiddingException {
        AdFormat adFormatForAdFormatHeaderField = this.f72055e.getAdFormatForAdFormatHeaderField(iahbBid.ext().adtype());
        if (adFormatForAdFormatHeaderField != null) {
            return adFormatForAdFormatHeaderField;
        }
        InAppBiddingException.InApBiddingError inApBiddingError = InAppBiddingException.InApBiddingError.INVALID_JSON;
        throw new InAppBiddingException(inApBiddingError, new Exception("Invalid Ad Type: " + iahbBid.ext().adtype()));
    }

    /* renamed from: d */
    private void m39266d(InAppBiddingException inAppBiddingException) {
        if (inAppBiddingException.getMessage() != null) {
            this.f72053c.error(LogDomain.INAPP_BIDDING, inAppBiddingException.getMessage(), new Object[0]);
        } else {
            this.f72053c.error(LogDomain.INAPP_BIDDING, "Error saving bid", new Object[0]);
        }
    }

    /* renamed from: e */
    private UbId m39265e(@NonNull String str) throws InAppBiddingException {
        if (str != null) {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes()));
                try {
                    IahbResponse m39263a = this.f72052b.m39263a(new JsonReader(inputStreamReader));
                    String bidId = m39263a.bidId();
                    IahbBid bid = m39263a.bid();
                    UbId put = this.f72051a.put(m39269a(bidId, bid, m39267c(bid)));
                    inputStreamReader.close();
                    return put;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (InAppBiddingException | IOException e) {
                throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INVALID_JSON, e);
            }
        }
        throw new NullPointerException("'json' specified as non-null is null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m39264f(@NonNull InAppBid inAppBid, @NonNull Consumer<String> consumer, @NonNull Consumer<InAppBiddingException> consumer2) {
        if (inAppBid != null) {
            if (consumer != null) {
                if (consumer2 != null) {
                    try {
                        consumer.accept(m39265e(inAppBid.getJson()).toString());
                        return;
                    } catch (Exception e) {
                        InAppBiddingException m39268b = m39268b(e);
                        m39266d(m39268b);
                        consumer2.accept(m39268b);
                        return;
                    }
                }
                throw new NullPointerException("'onFailedToSave' specified as non-null is null");
            }
            throw new NullPointerException("'onSaved' specified as non-null is null");
        }
        throw new NullPointerException("'inAppBid' specified as non-null is null");
    }
}
