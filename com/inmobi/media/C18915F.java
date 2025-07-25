package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.F */
/* loaded from: classes6.dex */
public final class C18915F {

    /* renamed from: a */
    public final C18952H8 f47226a;

    /* renamed from: b */
    public final InMobiAdRequestStatus f47227b;

    public C18915F(C18952H8 mResponse) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(mResponse, "mResponse");
        this.f47226a = mResponse;
        C18896D8 c18896d8 = mResponse.f47317c;
        if (c18896d8 != null) {
            EnumC19506w3 enumC19506w3 = c18896d8.f47181a;
            if (enumC19506w3 == null) {
                i = -1;
            } else {
                i = AbstractC18901E.f47189a[enumC19506w3.ordinal()];
            }
            switch (i) {
                case 1:
                    this.f47227b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    return;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    this.f47227b = inMobiAdRequestStatus;
                    C18896D8 c18896d82 = mResponse.f47317c;
                    if (c18896d82 != null) {
                        str = c18896d82.f47182b;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        inMobiAdRequestStatus.setCustomMessage(str);
                        return;
                    }
                    return;
                case 3:
                    this.f47227b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.f47227b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    return;
                case 9:
                    this.f47227b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    return;
                default:
                    this.f47227b = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    return;
            }
        }
    }
}
