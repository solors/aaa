package com.zeus.gmc.sdk.mobileads.columbus.remote;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.p552ot.pubsub.util.C26601v;
import com.zeus.gmc.sdk.mobileads.columbus.analytics.AnalyticsUtilHelper;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.gson.reflect.TypeToken;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32445c22o22co22i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32467cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.AdCacheInfo;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad.local.LocalConfigInfo;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class ConfigCache {
    public static final String SKU_MAX_NUM = "sku_unique";
    private static final String c222o2o2c2o = "ConfigCache";
    private static final String c2ccci2iii = "last_net_check_time";
    private static final String c2ccocci = "config_cache";
    private static final String c2cic2 = "positionConfig";
    private static final String cc2iiooocc2 = "gdpr_content";
    private static final String cc2o22co2c = "allowLocalAd";
    private static final String ccci2 = "expTime";
    private static final String ccoio = "om_version";
    private static final String ci22c2 = "md5";
    private static final String cici2o2oo = "columbus_config";
    private static final String cicoic = "localConfig";
    private static final String ciiio2o = "om_js";
    private static final String ciiioc2ioc = "last_clock_time";
    private static final String ciio2c = "interval";
    private static final String cioc2 = "pubSub_interval";
    private static final String cioiic = "tagIdCacheInfo";
    private static volatile ConfigCache coccoi2 = null;
    private static final String coocii = "localAdSrc";
    private List<LocalConfigInfo> c22o22co22i;
    private int c2oc2i;
    private long c2oc2o;
    private List<PositionConfig> c2oicci2;
    private long cco22;
    private String ccoc2oic;
    private int cicc2iiccc;
    private int cicic;
    private String cii2c2;
    private String ciii2coi2;
    private int cioccoiococ;
    private SharedPreferences coi222o222;
    private boolean coiic;
    private List<AdCacheInfo> coiio2;
    private C32445c22o22co22i coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$c2oc2i */
    /* loaded from: classes8.dex */
    public class C32746c2oc2i extends TypeToken<List<AdCacheInfo>> {
        C32746c2oc2i() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$c2oc2o */
    /* loaded from: classes8.dex */
    class C32747c2oc2o extends TypeToken<List<AdCacheInfo>> {
        C32747c2oc2o() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$cco22 */
    /* loaded from: classes8.dex */
    class C32748cco22 extends TypeToken<List<PositionConfig>> {
        C32748cco22() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$cii2c2 */
    /* loaded from: classes8.dex */
    class C32749cii2c2 extends TypeToken<List<LocalConfigInfo>> {
        C32749cii2c2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$cioccoiococ */
    /* loaded from: classes8.dex */
    public class C32750cioccoiococ extends TypeToken<List<LocalConfigInfo>> {
        C32750cioccoiococ() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$coi222o222 */
    /* loaded from: classes8.dex */
    public class C32751coi222o222 extends TypeToken<List<PositionConfig>> {
        C32751coi222o222() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache$coo2iico */
    /* loaded from: classes8.dex */
    class RunnableC32752coo2iico implements Runnable {
        RunnableC32752coo2iico() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigCache.this.coo2iico();
            ConfigCache.this.coi222o222();
            ConfigCache.this.c2oc2i();
        }
    }

    private ConfigCache() {
        this.cioccoiococ = 100;
        C32445c22o22co22i c32445c22o22co22i = new C32445c22o22co22i(cici2o2oo);
        this.coo2iico = c32445c22o22co22i;
        this.c2oc2i = c32445c22o22co22i.coo2iico(ciio2c, 0);
        this.c2oc2o = this.coo2iico.coo2iico(ciiioc2ioc, 0L);
        this.cco22 = this.coo2iico.coo2iico(c2ccci2iii, 0L);
        this.ciii2coi2 = this.coo2iico.coo2iico(ccoio, "0");
        this.cii2c2 = this.coo2iico.coo2iico(ciiio2o, (String) null);
        this.coiic = this.coo2iico.coo2iico(cc2o22co2c, false);
        this.cicic = this.coo2iico.coo2iico(coocii, 0);
        this.cicc2iiccc = this.coo2iico.coo2iico(ccci2, 1440);
        this.ccoc2oic = this.coo2iico.coo2iico(cc2iiooocc2, "");
        this.cioccoiococ = this.coo2iico.coo2iico(SKU_MAX_NUM, 100);
        AnalyticsUtilHelper.setUploadInterval(GlobalHolder.getApplicationContext(), this.coo2iico.coo2iico(cioc2, 30));
        C32465cioc2.c2oc2i.execute(new RunnableC32752coo2iico());
    }

    public static ConfigCache getInstance() {
        if (coccoi2 == null) {
            synchronized (ConfigCache.class) {
                if (coccoi2 == null) {
                    coccoi2 = new ConfigCache();
                }
            }
        }
        return coccoi2;
    }

    public List<Integer> getAdPosition(String str) {
        try {
            if (C32467cioccoiococ.coi222o222(this.c2oicci2)) {
                coi222o222();
            }
            if (!C32467cioccoiococ.coi222o222(this.c2oicci2)) {
                for (PositionConfig positionConfig : this.c2oicci2) {
                    if (positionConfig != null && str.equals(positionConfig.coo2iico())) {
                        return positionConfig.cicic();
                    }
                }
            }
        } catch (Exception e) {
            MLog.m25888e(c222o2o2c2o, "getAdPosition: ", e);
        }
        return Collections.emptyList();
    }

    public boolean getAllowLocalAd() {
        return this.coiic;
    }

    public int getAllowLocalAdSource() {
        return this.cicic;
    }

    public String getCache() {
        return this.coo2iico.coo2iico(c2ccocci, "");
    }

    public int getConfigInterval() {
        return this.c2oc2i;
    }

    public int getExpTime() {
        return this.cicc2iiccc;
    }

    public int getExpTimeMillis() {
        return this.cicc2iiccc * 60 * 1000;
    }

    public String getGdprContent() {
        if (this.coi222o222 == null) {
            Context applicationContext = GlobalHolder.getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            this.coi222o222 = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        }
        return this.coi222o222.getString("IABTCF_TCString", "");
    }

    public long getLastClockTime() {
        return this.c2oc2o;
    }

    public long getLastNetCheckTime() {
        return this.cco22;
    }

    public int getLocalConfigStyle(String str) {
        LocalConfigInfo coo2iico = coo2iico(str);
        if (coo2iico != null) {
            return coo2iico.cicic();
        }
        return 0;
    }

    public int getLocalConfigSwitch(String str) {
        LocalConfigInfo coo2iico = coo2iico(str);
        if (coo2iico != null) {
            return coo2iico.cicc2iiccc();
        }
        return 0;
    }

    public String getMd5() {
        return this.coo2iico.coo2iico(ci22c2, "");
    }

    public int getNonDfExpTimeMillis() {
        return C26601v.f69837d;
    }

    public String getOMJS() {
        return this.cii2c2;
    }

    public String getOMVersion() {
        return this.ciii2coi2;
    }

    public int getSkuMaxNum() {
        return this.cioccoiococ;
    }

    public List<AdCacheInfo> getTagIdCacheInfo() {
        if (this.coiio2 == null) {
            coo2iico();
            if (this.coiio2 == null) {
                return Collections.emptyList();
            }
        }
        return this.coiio2;
    }

    public void save(String str) {
        this.coo2iico.coi222o222(c2ccocci, str);
    }

    public void saveAllowLocalAd(boolean z) {
        this.coiic = z;
        this.coo2iico.coi222o222(cc2o22co2c, z);
    }

    public void saveAllowLocalAdSource(int i) {
        this.cicic = i;
        this.coo2iico.coi222o222(coocii, i);
    }

    public void saveConfigInterval(int i) {
        this.c2oc2i = i;
        this.coo2iico.coi222o222(ciio2c, i);
    }

    public void saveExpTime(int i) {
        this.cicc2iiccc = i;
        this.coo2iico.coi222o222(ccci2, i);
    }

    public void saveGdprContent(String str) {
        this.ccoc2oic = str;
        this.coo2iico.coi222o222(cc2iiooocc2, str);
    }

    public void saveLastClockTime() {
        long currentTimeMillis = System.currentTimeMillis();
        this.c2oc2o = currentTimeMillis;
        this.coo2iico.coi222o222(ciiioc2ioc, currentTimeMillis);
    }

    public void saveLastNetCheckTime() {
        long currentTimeMillis = System.currentTimeMillis();
        this.cco22 = currentTimeMillis;
        this.coo2iico.coi222o222(c2ccci2iii, currentTimeMillis);
    }

    public void saveLocalConfig(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.c22o22co22i = C32459ciii2coi2.coo2iico(str, new C32749cii2c2().getType());
            this.coo2iico.coi222o222(cicoic, str);
        }
    }

    public void saveMd5(String str) {
        this.coo2iico.coi222o222(ci22c2, str);
    }

    public void saveOMJS(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(C21114v8.C21123i.f54135c);
        if (split.length >= 2 && split[0].startsWith("v=")) {
            String substring = split[0].substring(2);
            try {
                if (Integer.parseInt(substring) < 0) {
                    return;
                }
                this.ciii2coi2 = substring;
                this.cii2c2 = split[1];
                this.coo2iico.coi222o222(ccoio, substring);
                this.coo2iico.coi222o222(ciiio2o, this.cii2c2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void savePositionConfig(String str) {
        MLog.m25892d(c222o2o2c2o, "savePositionConfig: " + str);
        if (!TextUtils.isEmpty(str)) {
            this.c2oicci2 = C32459ciii2coi2.coo2iico(str, new C32748cco22().getType());
            this.coo2iico.coi222o222(c2cic2, str);
        }
    }

    public void savePubSubInterval(int i) {
        this.coo2iico.coi222o222(cioc2, i);
    }

    public void saveSkuMaxNum(int i) {
        i = (i <= 0 || i > 1000) ? 100 : 100;
        this.cioccoiococ = i;
        this.coo2iico.coi222o222(SKU_MAX_NUM, i);
    }

    public void saveTagIdCacheInfo(String str) {
        this.coiio2 = C32459ciii2coi2.coo2iico(str, new C32747c2oc2o().getType());
        this.coo2iico.coi222o222(cioiic, str);
        C32111coo2iico.c2oc2i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2oc2i() {
        String coo2iico = this.coo2iico.coo2iico(cicoic, "");
        if (TextUtils.isEmpty(coo2iico)) {
            return;
        }
        this.c22o22co22i = C32459ciii2coi2.coo2iico(coo2iico, new C32750cioccoiococ().getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void coi222o222() {
        try {
            String coo2iico = this.coo2iico.coo2iico(c2cic2, "");
            if (TextUtils.isEmpty(coo2iico)) {
                return;
            }
            this.c2oicci2 = C32459ciii2coi2.coo2iico(coo2iico, new C32751coi222o222().getType());
        } catch (Exception e) {
            MLog.m25888e(c222o2o2c2o, "initAdPositions: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void coo2iico() {
        String coo2iico = this.coo2iico.coo2iico(cioiic, "");
        MLog.m25892d(c222o2o2c2o, " tagIdCacheInfo == " + coo2iico);
        this.coiio2 = C32459ciii2coi2.coo2iico(coo2iico, new C32746c2oc2i().getType());
    }

    private LocalConfigInfo coo2iico(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (C32467cioccoiococ.coi222o222(this.c22o22co22i)) {
            c2oc2i();
        }
        if (!C32467cioccoiococ.coi222o222(this.c22o22co22i)) {
            for (LocalConfigInfo localConfigInfo : this.c22o22co22i) {
                if (localConfigInfo != null && str.equals(localConfigInfo.coo2iico())) {
                    return localConfigInfo;
                }
            }
        }
        return null;
    }
}
