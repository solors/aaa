package com.p551my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
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
import com.ironsource.C20747r8;
import com.p551my.target.C25967o1;
import com.p551my.target.common.MyTargetConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.o1 */
/* loaded from: classes7.dex */
public final class C25967o1 extends AbstractC26021q1 {

    /* renamed from: a */
    public C25971d f67428a = new C25971d(new HashMap(), 0);

    /* renamed from: com.my.target.o1$a */
    /* loaded from: classes7.dex */
    public static class C25968a implements InterfaceC25969b {

        /* renamed from: a */
        public final String f67429a = "cdma";

        /* renamed from: b */
        public final int f67430b;

        /* renamed from: c */
        public final int f67431c;

        /* renamed from: d */
        public final int f67432d;

        /* renamed from: e */
        public final int f67433e;

        /* renamed from: f */
        public final int f67434f;

        /* renamed from: g */
        public final int f67435g;

        /* renamed from: h */
        public final int f67436h;

        /* renamed from: i */
        public final int f67437i;

        /* renamed from: j */
        public final int f67438j;

        /* renamed from: k */
        public final int f67439k;

        /* renamed from: l */
        public final int f67440l;

        /* renamed from: m */
        public final int f67441m;

        /* renamed from: n */
        public final int f67442n;

        /* renamed from: o */
        public final int f67443o;

        /* renamed from: p */
        public final int f67444p;

        public C25968a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f67430b = i;
            this.f67431c = i2;
            this.f67432d = i3;
            this.f67433e = i4;
            this.f67434f = i5;
            this.f67435g = i6;
            this.f67436h = i7;
            this.f67437i = i8;
            this.f67438j = i9;
            this.f67439k = i10;
            this.f67440l = i11;
            this.f67441m = i12;
            this.f67442n = i13;
            this.f67443o = i14;
            this.f67444p = i15;
        }

        @Override // com.p551my.target.C25967o1.InterfaceC25969b
        /* renamed from: a */
        public String mo43287a() {
            return this.f67429a + "," + this.f67430b + "," + this.f67431c + "," + this.f67432d + "," + this.f67433e + "," + this.f67434f + "," + this.f67435g + "," + this.f67436h + "," + this.f67437i + "," + this.f67438j + "," + this.f67439k + "," + this.f67440l + "," + this.f67441m + "," + this.f67442n + "," + this.f67443o + "," + this.f67444p;
        }
    }

    /* renamed from: com.my.target.o1$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25969b {
        /* renamed from: a */
        String mo43287a();
    }

    /* renamed from: com.my.target.o1$c */
    /* loaded from: classes7.dex */
    public static final class C25970c {

        /* renamed from: a */
        public List f67445a;

        public C25970c(Context context) {
            boolean z;
            InterfaceC25969b m43290b;
            this.f67445a = null;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return;
            }
            try {
                if (Build.VERSION.SDK_INT < 29 && AbstractC26021q1.m43186a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean m43186a = AbstractC26021q1.m43186a("android.permission.ACCESS_FINE_LOCATION", context);
                if (!z && !m43186a) {
                    return;
                }
                List m43291a = m43291a(telephonyManager);
                this.f67445a = m43291a;
                if ((m43291a != null && !m43291a.isEmpty()) || (m43290b = m43290b(telephonyManager)) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                this.f67445a = arrayList;
                arrayList.add(m43290b);
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("EnvironmentParamsDataProvider$CellEnvironment: Environment provider error - " + th.getMessage());
            }
        }

        /* renamed from: a */
        public static List m43291a(TelephonyManager telephonyManager) {
            InterfaceC25969b c25972e;
            String valueOf;
            String valueOf2;
            String valueOf3;
            String valueOf4;
            int i;
            String valueOf5;
            String valueOf6;
            CellIdentityTdscdma cellIdentity;
            CellSignalStrength cellSignalStrength;
            int cid;
            int lac;
            String mccString;
            String mncString;
            int level;
            int dbm;
            int asuLevel;
            int uarfcn;
            CellIdentity cellIdentity2;
            CellSignalStrength cellSignalStrength2;
            long nci;
            String mccString2;
            String mncString2;
            int level2;
            int dbm2;
            int asuLevel2;
            int nrarfcn;
            int tac;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength3 = cellInfoLte.getCellSignalStrength();
                        long ci = cellIdentity3.getCi();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 28) {
                            valueOf = cellIdentity3.getMccString();
                        } else {
                            valueOf = String.valueOf(cellIdentity3.getMcc());
                        }
                        if (i2 >= 28) {
                            valueOf2 = cellIdentity3.getMncString();
                        } else {
                            valueOf2 = String.valueOf(cellIdentity3.getMnc());
                        }
                        c25972e = new C25972e("lte", ci, Integer.MAX_VALUE, valueOf, valueOf2, cellSignalStrength3.getLevel(), cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel(), cellSignalStrength3.getTimingAdvance(), cellIdentity3.getEarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity3.getTac());
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity4 = cellInfoGsm.getCellIdentity();
                        CellSignalStrengthGsm cellSignalStrength4 = cellInfoGsm.getCellSignalStrength();
                        long cid2 = cellIdentity4.getCid();
                        int lac2 = cellIdentity4.getLac();
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 28) {
                            valueOf3 = cellIdentity4.getMccString();
                        } else {
                            valueOf3 = String.valueOf(cellIdentity4.getMcc());
                        }
                        if (i3 >= 28) {
                            valueOf4 = cellIdentity4.getMncString();
                        } else {
                            valueOf4 = String.valueOf(cellIdentity4.getMnc());
                        }
                        String str = valueOf4;
                        int level3 = cellSignalStrength4.getLevel();
                        int dbm3 = cellSignalStrength4.getDbm();
                        int asuLevel3 = cellSignalStrength4.getAsuLevel();
                        if (i3 >= 26) {
                            i = cellSignalStrength4.getTimingAdvance();
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        c25972e = new C25972e("gsm", cid2, lac2, valueOf3, str, level3, dbm3, asuLevel3, i, Integer.MAX_VALUE, cellIdentity4.getBsic(), cellIdentity4.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity5 = cellInfoWcdma.getCellIdentity();
                        CellSignalStrengthWcdma cellSignalStrength5 = cellInfoWcdma.getCellSignalStrength();
                        long cid3 = cellIdentity5.getCid();
                        int lac3 = cellIdentity5.getLac();
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 28) {
                            valueOf5 = cellIdentity5.getMccString();
                        } else {
                            valueOf5 = String.valueOf(cellIdentity5.getMcc());
                        }
                        if (i4 >= 28) {
                            valueOf6 = cellIdentity5.getMncString();
                        } else {
                            valueOf6 = String.valueOf(cellIdentity5.getMnc());
                        }
                        c25972e = new C25972e("wcdma", cid3, lac3, valueOf5, valueOf6, cellSignalStrength5.getLevel(), cellSignalStrength5.getDbm(), cellSignalStrength5.getAsuLevel(), Integer.MAX_VALUE, cellIdentity5.getUarfcn(), Integer.MAX_VALUE, cellIdentity5.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        CellIdentityCdma cellIdentity6 = cellInfoCdma.getCellIdentity();
                        CellSignalStrengthCdma cellSignalStrength6 = cellInfoCdma.getCellSignalStrength();
                        c25972e = new C25968a(cellIdentity6.getNetworkId(), cellIdentity6.getSystemId(), cellIdentity6.getBasestationId(), cellIdentity6.getLatitude(), cellIdentity6.getLongitude(), cellSignalStrength6.getCdmaLevel(), cellSignalStrength6.getLevel(), cellSignalStrength6.getEvdoLevel(), cellSignalStrength6.getAsuLevel(), cellSignalStrength6.getCdmaDbm(), cellSignalStrength6.getDbm(), cellSignalStrength6.getEvdoDbm(), cellSignalStrength6.getEvdoEcio(), cellSignalStrength6.getCdmaEcio(), cellSignalStrength6.getEvdoSnr());
                    } else {
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 29 && (cellInfo instanceof CellInfoNr)) {
                            cellIdentity2 = cellInfo.getCellIdentity();
                            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity2;
                            cellSignalStrength2 = cellInfo.getCellSignalStrength();
                            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength2;
                            nci = cellIdentityNr.getNci();
                            mccString2 = cellIdentityNr.getMccString();
                            mncString2 = cellIdentityNr.getMncString();
                            level2 = cellSignalStrengthNr.getLevel();
                            dbm2 = cellSignalStrengthNr.getDbm();
                            asuLevel2 = cellSignalStrengthNr.getAsuLevel();
                            nrarfcn = cellIdentityNr.getNrarfcn();
                            tac = cellIdentityNr.getTac();
                            c25972e = new C25972e("nr", nci, Integer.MAX_VALUE, mccString2, mncString2, level2, dbm2, asuLevel2, Integer.MAX_VALUE, nrarfcn, Integer.MAX_VALUE, Integer.MAX_VALUE, tac);
                        } else if (i5 >= 30 && (cellInfo instanceof CellInfoTdscdma)) {
                            cellIdentity = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                            cellSignalStrength = cellInfo.getCellSignalStrength();
                            CellSignalStrengthTdscdma cellSignalStrengthTdscdma = (CellSignalStrengthTdscdma) cellSignalStrength;
                            cid = cellIdentity.getCid();
                            lac = cellIdentity.getLac();
                            mccString = cellIdentity.getMccString();
                            mncString = cellIdentity.getMncString();
                            level = cellSignalStrengthTdscdma.getLevel();
                            dbm = cellSignalStrengthTdscdma.getDbm();
                            asuLevel = cellSignalStrengthTdscdma.getAsuLevel();
                            uarfcn = cellIdentity.getUarfcn();
                            c25972e = new C25972e("tdscdma", cid, lac, mccString, mncString, level, dbm, asuLevel, Integer.MAX_VALUE, uarfcn, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        }
                    }
                    arrayList.add(c25972e);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public static InterfaceC25969b m43290b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String str3;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String str4 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() != 0) {
                try {
                    str3 = networkOperator.substring(0, 3);
                    try {
                        str4 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        AbstractC25846ja.m43680a("EnvironmentParamsDataProvider$CellEnvironment: Unable to substring network operator " + networkOperator);
                        str2 = str4;
                        str = str3;
                        return new C25972e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    str3 = null;
                }
                str2 = str4;
                str = str3;
            } else {
                str = null;
                str2 = null;
            }
            return new C25972e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    /* renamed from: com.my.target.o1$d */
    /* loaded from: classes7.dex */
    public static final class C25971d {

        /* renamed from: a */
        public final Map f67446a;

        /* renamed from: b */
        public final long f67447b;

        public C25971d(Map map, long j) {
            this.f67446a = map;
            this.f67447b = j;
        }

        /* renamed from: a */
        public long m43289a() {
            return this.f67447b;
        }

        /* renamed from: b */
        public Map m43288b() {
            return new HashMap(this.f67446a);
        }
    }

    /* renamed from: com.my.target.o1$e */
    /* loaded from: classes7.dex */
    public static class C25972e implements InterfaceC25969b {

        /* renamed from: a */
        public final String f67448a;

        /* renamed from: b */
        public final String f67449b;

        /* renamed from: c */
        public final String f67450c;

        /* renamed from: d */
        public final long f67451d;

        /* renamed from: e */
        public final int f67452e;

        /* renamed from: f */
        public final int f67453f;

        /* renamed from: g */
        public final int f67454g;

        /* renamed from: h */
        public final int f67455h;

        /* renamed from: i */
        public final int f67456i;

        /* renamed from: j */
        public final int f67457j;

        /* renamed from: k */
        public final int f67458k;

        /* renamed from: l */
        public final int f67459l;

        /* renamed from: m */
        public final int f67460m;

        public C25972e(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f67448a = str;
            this.f67451d = j;
            this.f67452e = i;
            this.f67449b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.f67450c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f67453f = i2;
            this.f67454g = i3;
            this.f67455h = i4;
            this.f67456i = i5;
            this.f67457j = i6;
            this.f67458k = i7;
            this.f67459l = i8;
            this.f67460m = i9;
        }

        @Override // com.p551my.target.C25967o1.InterfaceC25969b
        /* renamed from: a */
        public String mo43287a() {
            return this.f67448a + "," + this.f67451d + "," + this.f67452e + "," + this.f67449b + "," + this.f67450c + "," + this.f67453f + "," + this.f67454g + "," + this.f67455h + "," + this.f67456i + "," + this.f67457j + "," + this.f67458k + "," + this.f67459l + "," + this.f67460m;
        }
    }

    /* renamed from: com.my.target.o1$f */
    /* loaded from: classes7.dex */
    public static final class C25973f {

        /* renamed from: a */
        public WifiInfo f67461a;

        /* renamed from: b */
        public List f67462b;

        public C25973f(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    this.f67461a = wifiManager.getConnectionInfo();
                    if (C25967o1.m43298a(context)) {
                        this.f67462b = wifiManager.getScanResults();
                    }
                    List list = this.f67462b;
                    if (list == null) {
                        return;
                    }
                    Collections.sort(list, new Comparator() { // from class: com.my.target.fe
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return C25967o1.C25973f.m43286a((ScanResult) obj, (ScanResult) obj2);
                        }
                    });
                }
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("EnvironmentParamsDataProvider$WiFiEnvironment: No permissions for access to wifi state");
            }
        }

        /* renamed from: a */
        public static /* synthetic */ int m43286a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    /* renamed from: a */
    public static boolean m43298a(Context context) {
        return AbstractC26021q1.m43186a("android.permission.ACCESS_FINE_LOCATION", context) || AbstractC26021q1.m43186a("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    /* renamed from: b */
    public synchronized Map m43295b(final MyTargetConfig myTargetConfig, final Context context) {
        C25971d m43299a;
        m43299a = m43299a();
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.ed
            {
                C25967o1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25967o1.this.m43293c(myTargetConfig, context);
            }
        });
        return m43299a.m43288b();
    }

    /* renamed from: c */
    public final void m43292c(Map map, Context context) {
        if (AbstractC26021q1.m43186a("android.permission.ACCESS_WIFI_STATE", context)) {
            C25973f c25973f = new C25973f(context);
            WifiInfo wifiInfo = c25973f.f67461a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + "," + ssid + "," + rssi + "," + networkId + "," + linkSpeed;
                map.put(C20747r8.f52730b, str);
                AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: ip - " + wifiInfo.getIpAddress());
                AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: wifi - " + str);
            }
            List list = c25973f.f67462b;
            if (list == null) {
                return;
            }
            int min = Math.min(list.size(), 5);
            int i = 0;
            while (i < min) {
                ScanResult scanResult = (ScanResult) list.get(i);
                AbstractC25846ja.m43680a(scanResult.level + "");
                String str2 = scanResult.BSSID;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = scanResult.SSID;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str2 + "," + str3 + "," + scanResult.level;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C20747r8.f52730b);
                i++;
                sb2.append(i);
                map.put(sb2.toString(), str4);
                AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: wifi" + i + " - " + str4);
            }
        }
    }

    /* renamed from: b */
    public static void m43294b(Map map, Context context) {
        LocationManager locationManager;
        if (m43298a(context) && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            Location location = null;
            long j = 0;
            float f = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: LocationProvider - " + str2);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = str2;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (Throwable unused) {
                    AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: No permissions for get geo data");
                }
            }
            if (location == null) {
                return;
            }
            String str3 = location.getLatitude() + "," + location.getLongitude() + "," + location.getAccuracy() + "," + location.getSpeed() + "," + (j / 1000);
            map.put("location", str3);
            AbstractC25846ja.m43680a("EnvironmentParamsDataProvider: Location - " + str3);
            map.put("location_provider", str);
        }
    }

    /* renamed from: a */
    public final void m43293c(MyTargetConfig myTargetConfig, Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!myTargetConfig.isTrackingLocationEnabled) {
            synchronized (this) {
                this.f67428a = new C25971d(new HashMap(), SystemClock.uptimeMillis() - uptimeMillis);
            }
            return;
        }
        HashMap hashMap = new HashMap();
        m43294b(hashMap, context);
        if (myTargetConfig.isTrackingEnvironmentEnabled) {
            m43292c(hashMap, context);
            m43296a(hashMap, context);
        }
        synchronized (this) {
            this.f67428a = new C25971d(hashMap, SystemClock.uptimeMillis() - uptimeMillis);
        }
    }

    /* renamed from: a */
    public final void m43296a(Map map, Context context) {
        List list;
        if (AbstractC26021q1.m43186a("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new C25970c(context).f67445a) != null) {
            int i = 0;
            while (i < list.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cell");
                sb2.append(i != 0 ? Integer.valueOf(i) : "");
                map.put(sb2.toString(), ((InterfaceC25969b) list.get(i)).mo43287a());
                i++;
            }
        }
    }

    /* renamed from: a */
    public synchronized C25971d m43299a() {
        return this.f67428a;
    }
}
