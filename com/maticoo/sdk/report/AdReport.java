package com.maticoo.sdk.report;

import android.content.Context;
import android.text.TextUtils;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.bean.Bidresp;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.StringRequestBody;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AdReport {
    private static final long cleanUpIntervalMillis = 60000;
    private static final long expiryDurationMillis = 900000;
    private static long lastCleanUpTime = 0;
    private static final ReentrantReadWriteLock lock;
    private static final int maxSize = 1000;
    private static final Lock readLock;
    private static final Map<String, Long> urlMap = new LinkedHashMap(1000, 0.75f, true);
    private static final Lock writeLock;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        lock = reentrantReadWriteLock;
        readLock = reentrantReadWriteLock.readLock();
        writeLock = reentrantReadWriteLock.writeLock();
        lastCleanUpTime = 0L;
    }

    public static void CLKReport(Context context, AdBean adBean) {
        Bidresp bidBean;
        DeveloperLog.LogD("Click reporting");
        if (adBean == null || (bidBean = adBean.getBidBean()) == null) {
            return;
        }
        reportTrack(bidBean.getClkurl(), "impReport", null);
    }

    private static String buildReportBody(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ToolBar.REFRESH, i);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static void cleanUp(long j) {
        writeLock.lock();
        try {
            Iterator<Map.Entry<String, Long>> it = urlMap.entrySet().iterator();
            while (it.hasNext()) {
                if (j > it.next().getValue().longValue()) {
                    it.remove();
                }
            }
        } finally {
            writeLock.unlock();
        }
    }

    public static void impReport(Context context, AdBean adBean, int i) {
        Bidresp bidBean;
        DeveloperLog.LogD("Impression reporting");
        if (adBean == null || (bidBean = adBean.getBidBean()) == null) {
            return;
        }
        reportTrack(bidBean.getImpurl(), "impReport", buildReportBody(i));
    }

    public static void loadReport(AdBean adBean, int i) {
        Bidresp bidBean;
        DeveloperLog.LogD("try load reporting");
        if (adBean == null || (bidBean = adBean.getBidBean()) == null) {
            return;
        }
        DeveloperLog.LogD("load reporting");
        reportTrack(bidBean.getLoadurl(), "loadTracker", buildReportBody(i));
    }

    private static void removeOldUrlsInternal() {
        Map<String, Long> map = urlMap;
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        int size = map.size() / 2;
        for (int i = 0; i < size && it.hasNext(); i++) {
            it.next();
            it.remove();
        }
    }

    public static void reportClickTrack(String str) {
        reportTrack(str, "nativeTrack", null);
    }

    public static void reportTrack(String str, String str2, String str3) {
        Long l;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastCleanUpTime > 60000) {
            cleanUp(currentTimeMillis);
            lastCleanUpTime = currentTimeMillis;
        }
        Lock lock2 = readLock;
        lock2.lock();
        try {
            Map<String, Long> map = urlMap;
            if (map.containsKey(str) && (l = map.get(str)) != null) {
                if (currentTimeMillis < l.longValue()) {
                    lock2.unlock();
                    return;
                }
            }
            lock2.unlock();
            Lock lock3 = writeLock;
            lock3.lock();
            try {
                if (map.size() >= 1000) {
                    removeOldUrlsInternal();
                }
                DeveloperLog.LogD("reportTrack reporting tag:" + str2);
                Request.RequestBuilder url = AdRequest.get().url(str);
                if (!TextUtils.isEmpty(str3)) {
                    url.body(new StringRequestBody(str3));
                }
                url.readTimeout(60000).connectTimeout(30000).instanceFollowRedirects(true).performRequest(ApplicationUtil.getInstance().getApplicationContext());
                map.put(str, Long.valueOf(currentTimeMillis + 900000));
                lock3.unlock();
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    public static void reportTracks(String[] strArr, String str) {
        for (String str2 : strArr) {
            reportTrack(str2, str, null);
        }
    }
}
