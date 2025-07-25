package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.K1 */
/* loaded from: classes6.dex */
public final class C18987K1 {

    /* renamed from: a */
    public String f47388a;

    /* renamed from: b */
    public int f47389b;

    /* renamed from: c */
    public int f47390c;

    public C18987K1() {
    }

    /* renamed from: a */
    public static String m60982a(String mcc, String mnc, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mcc);
        sb2.append('#');
        sb2.append(mnc);
        sb2.append('#');
        sb2.append(i);
        sb2.append('#');
        sb2.append(i2);
        sb2.append('#');
        sb2.append(i3 == -1 ? "" : Integer.valueOf(i3));
        sb2.append('#');
        sb2.append(i4 != Integer.MAX_VALUE ? Integer.valueOf(i4) : "");
        return sb2.toString();
    }

    public C18987K1(CellInfo cellInfo, String mcc, String mnc, int i) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f47390c = i;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f47389b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
            this.f47388a = m60982a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f47390c = i;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f47389b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
            int systemId = cellIdentity2.getSystemId();
            int networkId = cellIdentity2.getNetworkId();
            int basestationId = cellIdentity2.getBasestationId();
            Intrinsics.checkNotNullParameter(mcc, "mcc");
            this.f47388a = mcc + '#' + systemId + '#' + networkId + '#' + basestationId;
        } else if (cellInfo instanceof CellInfoWcdma) {
            this.f47390c = i;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f47389b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
            this.f47388a = m60982a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public final JSONObject m60983a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f47388a);
            int i = this.f47389b;
            if (i != Integer.MAX_VALUE) {
                jSONObject.put("ss", i);
            }
            jSONObject.put("nt", this.f47390c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
