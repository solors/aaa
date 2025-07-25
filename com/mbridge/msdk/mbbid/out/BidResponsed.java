package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.mbridge.msdk.click.CommonClickControl;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* loaded from: classes6.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* renamed from: ln */
    protected String f57393ln;
    private String price;

    /* renamed from: wn */
    protected String f57394wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f57393ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f57394wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (!TextUtils.isEmpty(this.f57393ln) && context != null && bidLossCode != null) {
            StringBuilder sb2 = new StringBuilder(this.f57393ln);
            if (this.f57393ln.contains("?")) {
                sb2.append(C21114v8.C21123i.f54135c);
            } else {
                sb2.append("?");
            }
            sb2.append("reason=");
            sb2.append(bidLossCode.getCurrentCode());
            CommonClickControl.m53242a(context, (CampaignEx) null, "", sb2.toString(), false, false);
        }
    }

    public void sendWinNotice(Context context) {
        if (!TextUtils.isEmpty(this.f57394wn) && context != null) {
            CommonClickControl.m53242a(context, (CampaignEx) null, "", this.f57394wn, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setBidId(String str) {
        this.bidId = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setBidToken(String str) {
        this.bidToken = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setCur(String str) {
        this.cur = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPrice(String str) {
        this.price = str;
    }
}
