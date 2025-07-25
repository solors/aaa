package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.ironsource.C20747r8;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.o */
/* loaded from: classes7.dex */
public final class C26377o {

    /* renamed from: b */
    public static int f68773b = 5;

    /* renamed from: a */
    private volatile boolean f68774a = true;

    /* renamed from: a */
    public static /* synthetic */ int m41915a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }

    /* renamed from: c */
    public void m41902c(C26405s0 c26405s0, Context context) {
        if (!this.f68774a) {
            return;
        }
        m41914a(c26405s0, context);
        m41903b(c26405s0, context);
    }

    /* renamed from: a */
    public void m41916a(Context context) {
    }

    /* renamed from: b */
    public void m41905b(Context context) {
    }

    /* renamed from: a */
    static void m41914a(C26405s0 c26405s0, Context context) {
        List<CellInfo> allCellInfo;
        if (Build.VERSION.SDK_INT < 29) {
            if (!C26378o0.m41900a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                C26468z0.m41528a("EnvironmentParamsDataProvider: can't access information");
                return;
            }
        } else if (!C26378o0.m41900a("android.permission.ACCESS_FINE_LOCATION", context)) {
            C26468z0.m41528a("EnvironmentParamsDataProvider: can't access information");
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null && !allCellInfo.isEmpty()) {
                boolean z = true;
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            m41913a(c26405s0, (CellInfoCdma) cellInfo);
                        } else if (cellInfo instanceof CellInfoGsm) {
                            m41912a(c26405s0, (CellInfoGsm) cellInfo);
                        } else if (cellInfo instanceof CellInfoLte) {
                            m41911a(c26405s0, (CellInfoLte) cellInfo);
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            m41908a(c26405s0, (CellInfoWcdma) cellInfo);
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                                m41909a(c26405s0, (CellInfoTdscdma) cellInfo);
                            } else if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                                m41910a(c26405s0, (CellInfoNr) cellInfo);
                            }
                        }
                        z = false;
                    }
                }
                if (z) {
                    m41907a(c26405s0, telephonyManager);
                }
            }
        } catch (Throwable th) {
            C26468z0.m41527a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
        }
    }

    /* renamed from: b */
    static void m41903b(C26405s0 c26405s0, Context context) {
        List<ScanResult> scanResults;
        if (C26378o0.m41900a("android.permission.ACCESS_WIFI_STATE", context)) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        c26405s0.m41709a(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    }
                    if ((C26378o0.m41900a("android.permission.ACCESS_FINE_LOCATION", context) || C26378o0.m41900a("android.permission.ACCESS_COARSE_LOCATION", context)) && (scanResults = wifiManager.getScanResults()) != null && !scanResults.isEmpty()) {
                        Collections.sort(scanResults, new Comparator() { // from class: com.my.tracker.obfuscated.d2
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int m41915a;
                                m41915a = C26377o.m41915a((ScanResult) obj, (ScanResult) obj2);
                                return m41915a;
                            }
                        });
                        int min = Math.min(scanResults.size(), f68773b);
                        for (int i = 0; i < min; i++) {
                            ScanResult scanResult = scanResults.get(i);
                            c26405s0.m41710a(scanResult.SSID, scanResult.BSSID, scanResult.level);
                        }
                    }
                }
            } catch (Throwable th) {
                C26468z0.m41527a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            }
        }
    }

    /* renamed from: a */
    static void m41913a(C26405s0 c26405s0, CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        c26405s0.m41717a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude(), cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    /* renamed from: a */
    static void m41912a(C26405s0 c26405s0, CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        c26405s0.m41707a(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getArfcn(), cellIdentity.getBsic(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m41911a(C26405s0 c26405s0, CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        c26405s0.m41694b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), cellIdentity.getEarfcn(), cellIdentity.getPci(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    /* renamed from: a */
    static void m41910a(C26405s0 c26405s0, CellInfoNr cellInfoNr) {
        CellIdentity cellIdentity;
        CellSignalStrength cellSignalStrength;
        String mccString;
        String mncString;
        long nci;
        int tac;
        int nrarfcn;
        int pci;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoNr.getCellIdentity();
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
        cellSignalStrength = cellInfoNr.getCellSignalStrength();
        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
        mccString = cellIdentityNr.getMccString();
        mncString = cellIdentityNr.getMncString();
        nci = cellIdentityNr.getNci();
        tac = cellIdentityNr.getTac();
        nrarfcn = cellIdentityNr.getNrarfcn();
        pci = cellIdentityNr.getPci();
        level = cellSignalStrengthNr.getLevel();
        dbm = cellSignalStrengthNr.getDbm();
        asuLevel = cellSignalStrengthNr.getAsuLevel();
        c26405s0.m41706a(mccString, mncString, nci, tac, nrarfcn, pci, level, dbm, asuLevel);
    }

    /* renamed from: a */
    static void m41909a(C26405s0 c26405s0, CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity;
        CellSignalStrengthTdscdma cellSignalStrength;
        String mccString;
        String mncString;
        int cid;
        int lac;
        int uarfcn;
        int cpid;
        int level;
        int dbm;
        int asuLevel;
        cellIdentity = cellInfoTdscdma.getCellIdentity();
        cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        mccString = cellIdentity.getMccString();
        mncString = cellIdentity.getMncString();
        cid = cellIdentity.getCid();
        lac = cellIdentity.getLac();
        uarfcn = cellIdentity.getUarfcn();
        cpid = cellIdentity.getCpid();
        level = cellSignalStrength.getLevel();
        dbm = cellSignalStrength.getDbm();
        asuLevel = cellSignalStrength.getAsuLevel();
        c26405s0.m41708a(mccString, mncString, cid, lac, uarfcn, cpid, level, dbm, asuLevel);
    }

    /* renamed from: a */
    static void m41908a(C26405s0 c26405s0, CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        c26405s0.m41695b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getPsc(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    /* renamed from: a */
    static void m41907a(C26405s0 c26405s0, TelephonyManager telephonyManager) {
        String str;
        String str2;
        String str3;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            String networkOperator = telephonyManager.getNetworkOperator();
            String str4 = null;
            if (TextUtils.isEmpty(networkOperator)) {
                str = null;
                str2 = null;
            } else {
                try {
                    str3 = networkOperator.substring(0, 3);
                } catch (Throwable unused) {
                    str3 = null;
                }
                try {
                    str4 = networkOperator.substring(3);
                } catch (Throwable unused2) {
                    C26468z0.m41528a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                    str = str3;
                    str2 = str4;
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    c26405s0.m41707a(str, str2, gsmCellLocation.getCid(), gsmCellLocation.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str = str3;
                str2 = str4;
            }
            GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
            c26405s0.m41707a(str, str2, gsmCellLocation2.getCid(), gsmCellLocation2.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: a */
    public void m41906a(boolean z) {
        this.f68774a = z;
    }

    /* renamed from: a */
    public static boolean m41918a(int i) {
        return Integer.MAX_VALUE != i;
    }

    /* renamed from: a */
    public static boolean m41917a(long j) {
        return Long.MAX_VALUE != j;
    }
}
