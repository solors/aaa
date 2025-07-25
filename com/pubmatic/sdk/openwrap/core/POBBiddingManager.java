package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBBiddingManager extends POBBaseBidder<POBBid> implements POBBidderListener<POBBid> {
    @NonNull

    /* renamed from: a */
    private final POBBidding<POBBid> f70616a;
    @Nullable

    /* renamed from: b */
    private POBAdResponse<POBBid> f70617b;

    public POBBiddingManager(@NonNull POBBidding<POBBid> pOBBidding) {
        this.f70616a = pOBBidding;
        pOBBidding.setBidderListener(this);
    }

    /* renamed from: a */
    private void m40328a(@NonNull POBBidding<POBBid> pOBBidding) {
        POBAdResponse<POBBid> defaultResponse;
        String identifier = pOBBidding.getIdentifier();
        POBBidderResult<POBBid> pOBBidderResult = pOBBidding.getBidderResults().get(identifier);
        ArrayList arrayList = new ArrayList();
        if (pOBBidderResult != null) {
            POBNetworkResult networkResult = pOBBidderResult.getNetworkResult();
            if (networkResult != null) {
                POBLog.info("POBBiddingManager", "Network result for bidder %s is : %s", identifier, networkResult.toString());
            }
            POBAdResponse<POBBid> adResponse = pOBBidderResult.getAdResponse();
            if (adResponse != null) {
                arrayList.addAll(adResponse.getBids());
            }
        }
        if (this.bidderListener != null) {
            if (!arrayList.isEmpty()) {
                if (this.f70616a.getAdResponse() != null) {
                    defaultResponse = this.f70616a.getAdResponse();
                } else {
                    defaultResponse = POBAdResponse.defaultResponse();
                }
                List<POBBid> bids = defaultResponse.getBids();
                POBBid pOBBid = null;
                if (defaultResponse.isSendAllBidsEnabled()) {
                    Iterator<POBBid> it = bids.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        POBBid next = it.next();
                        if (next.isServerSideAuctionWinner()) {
                            pOBBid = next;
                            break;
                        }
                    }
                    if (pOBBid == null && !bids.isEmpty()) {
                        pOBBid = bids.get(0);
                    }
                } else if (!arrayList.isEmpty()) {
                    pOBBid = (POBBid) arrayList.get(0);
                }
                if (pOBBid != null) {
                    this.bidderListener.onBidsFetched(this, m40327a(pOBBid, bids));
                } else {
                    m40329a();
                }
                arrayList.clear();
                return;
            }
            m40329a();
        }
    }

    @Nullable
    public static POBBid getWinningBid(@Nullable POBAdResponse<POBBid> pOBAdResponse) {
        if (pOBAdResponse != null) {
            return pOBAdResponse.getWinningBid();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.f70616a.destroy();
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        return this.f70617b;
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        return this.f70616a.getBidderResults();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFailed(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBError pOBError) {
        m40328a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFetched(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBAdResponse<POBBid> pOBAdResponse) {
        m40328a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder, com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.f70616a.requestBid();
    }

    @NonNull
    /* renamed from: a */
    private POBAdResponse<POBBid> m40327a(@NonNull POBBid pOBBid, @NonNull List<POBBid> list) {
        POBAdResponse.Builder builder = new POBAdResponse.Builder(list);
        builder.setWinningBid(pOBBid);
        POBAdResponse<POBBid> adResponse = this.f70616a.getAdResponse();
        if (adResponse != null) {
            builder.setRefreshInterval(adResponse.getRefreshInterval());
            builder.setSendAllBidsState(adResponse.isSendAllBidsEnabled());
            builder.setNbrCode(adResponse.getNbrCode());
        } else {
            builder.setRefreshInterval(30);
        }
        builder.setServerSidePartnerBids(list);
        POBAdResponse<POBBid> build = builder.build();
        this.f70617b = build;
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40329a() {
        /*
            r5 = this;
            com.pubmatic.sdk.common.base.POBBidding<com.pubmatic.sdk.openwrap.core.POBBid> r0 = r5.f70616a
            java.util.Map r0 = r0.getBidderResults()
            com.pubmatic.sdk.common.base.POBBidding<com.pubmatic.sdk.openwrap.core.POBBid> r1 = r5.f70616a
            java.lang.String r1 = r1.getIdentifier()
            java.lang.Object r0 = r0.get(r1)
            com.pubmatic.sdk.common.base.POBBidderResult r0 = (com.pubmatic.sdk.common.base.POBBidderResult) r0
            if (r0 == 0) goto L57
            com.pubmatic.sdk.common.models.POBAdResponse r1 = r0.getAdResponse()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            java.lang.Integer r4 = r1.getNbrCode()
            if (r4 == 0) goto L35
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r1 = r1.getNbrCode()
            r2[r3] = r1
            java.lang.String r1 = "No ads available, reason(NBR): %s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            goto L59
        L35:
            com.pubmatic.sdk.common.POBError r1 = r0.getError()
            if (r1 == 0) goto L57
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.pubmatic.sdk.common.base.POBBidding<com.pubmatic.sdk.openwrap.core.POBBid> r4 = r5.f70616a
            java.lang.String r4 = r4.getIdentifier()
            r1[r3] = r4
            com.pubmatic.sdk.common.POBError r0 = r0.getError()
            java.lang.String r0 = r0.toString()
            r1[r2] = r0
            java.lang.String r0 = " %s : %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L59
        L57:
            java.lang.String r0 = "No Ads available from any bidder"
        L59:
            com.pubmatic.sdk.common.base.POBBidderListener<T extends com.pubmatic.sdk.common.base.POBAdDescriptor> r1 = r5.bidderListener
            if (r1 == 0) goto L67
            com.pubmatic.sdk.common.POBError r2 = new com.pubmatic.sdk.common.POBError
            r3 = 1002(0x3ea, float:1.404E-42)
            r2.<init>(r3, r0)
            r1.onBidsFailed(r5, r2)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.openwrap.core.POBBiddingManager.m40329a():void");
    }
}
