package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes2.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a */
    private final MaxNetworkResponseInfo.AdLoadState f7970a;

    /* renamed from: b */
    private final MaxMediatedNetworkInfo f7971b;

    /* renamed from: c */
    private final Bundle f7972c;

    /* renamed from: d */
    private final boolean f7973d;

    /* renamed from: e */
    private final long f7974e;

    /* renamed from: f */
    private final String f7975f;

    /* renamed from: g */
    private final MaxError f7976g;

    /* renamed from: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C4837a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7977a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f7977a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7977a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z, long j, String str, @Nullable MaxError maxError) {
        this.f7970a = adLoadState;
        this.f7971b = maxMediatedNetworkInfo;
        this.f7972c = bundle;
        this.f7973d = z;
        this.f7974e = j;
        this.f7975f = str;
        this.f7976g = maxError;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        if (error != null ? error.equals(error2) : error2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f7970a;
    }

    public String getBCode() {
        return this.f7975f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f7972c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    @Nullable
    public MaxError getError() {
        return this.f7976g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f7974e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f7971b;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        if (isBidding()) {
            i = 79;
        } else {
            i = 97;
        }
        long latencyMillis = getLatencyMillis();
        int i2 = ((i + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int i3 = i2 * 59;
        int i4 = 43;
        if (adLoadState == null) {
            hashCode = 43;
        } else {
            hashCode = adLoadState.hashCode();
        }
        int i5 = i3 + hashCode;
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int i6 = i5 * 59;
        if (mediatedNetwork == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = mediatedNetwork.hashCode();
        }
        int i7 = i6 + hashCode2;
        Bundle credentials = getCredentials();
        int i8 = i7 * 59;
        if (credentials == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = credentials.hashCode();
        }
        int i9 = i8 + hashCode3;
        String bCode = getBCode();
        int i10 = i9 * 59;
        if (bCode == null) {
            hashCode4 = 43;
        } else {
            hashCode4 = bCode.hashCode();
        }
        int i11 = i10 + hashCode4;
        MaxError error = getError();
        int i12 = i11 * 59;
        if (error != null) {
            i4 = error.hashCode();
        }
        return i12 + i4;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f7973d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r1 != 2) goto L6;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.append(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f7970a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r3.f7971b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r3.f7972c
            r1.append(r2)
            java.lang.String r2 = ", isBidding="
            r1.append(r2)
            boolean r2 = r3.f7973d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.C4837a.f7977a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f7970a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L47
            r2 = 2
            if (r1 == r2) goto L51
            goto L5b
        L47:
            java.lang.String r1 = ", error="
            r0.append(r1)
            com.applovin.mediation.MaxError r1 = r3.f7976g
            r0.append(r1)
        L51:
            java.lang.String r1 = ", latencyMillis="
            r0.append(r1)
            long r1 = r3.f7974e
            r0.append(r1)
        L5b:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}
