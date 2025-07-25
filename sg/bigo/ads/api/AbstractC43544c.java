package sg.bigo.ads.api;

import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.AbstractC43544c;

/* renamed from: sg.bigo.ads.api.c */
/* loaded from: classes10.dex */
public abstract class AbstractC43544c<ARB extends AbstractC43544c, AR extends AbstractC43532b> {
    private long mActivatedTime;
    private int mAge;
    private int mGender;
    protected String mServerBidPayload;
    protected String mSlotId;

    public AR build() {
        AR createAdRequest = createAdRequest();
        if (createAdRequest != null) {
            int i = this.mAge;
            int i2 = this.mGender;
            long j = this.mActivatedTime;
            createAdRequest.f114040d = i;
            createAdRequest.f114041e = i2;
            createAdRequest.f114042f = j;
        }
        return createAdRequest;
    }

    protected abstract AR createAdRequest();

    public ARB withActivatedTime(long j) {
        this.mActivatedTime = j;
        return this;
    }

    public ARB withAge(int i) {
        this.mAge = i;
        return this;
    }

    public final ARB withBid(String str) {
        this.mServerBidPayload = str;
        return this;
    }

    public ARB withGender(int i) {
        this.mGender = i;
        return this;
    }

    public final ARB withSlotId(String str) {
        this.mSlotId = str;
        return this;
    }
}
