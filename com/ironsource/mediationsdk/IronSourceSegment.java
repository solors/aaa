package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C20086i9;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: m */
    private static final String f51252m = "segName";

    /* renamed from: a */
    private String f51253a;

    /* renamed from: g */
    private String f51259g;

    /* renamed from: b */
    private int f51254b = 999999;

    /* renamed from: c */
    private double f51255c = 999999.99d;

    /* renamed from: d */
    private final String f51256d = "custom";

    /* renamed from: e */
    private final int f51257e = 5;

    /* renamed from: f */
    private int f51258f = -1;

    /* renamed from: h */
    private int f51260h = -1;

    /* renamed from: i */
    private AtomicBoolean f51261i = null;

    /* renamed from: j */
    private double f51262j = -1.0d;

    /* renamed from: k */
    private long f51263k = 0;

    /* renamed from: l */
    private ArrayList<Pair<String, String>> f51264l = new ArrayList<>();

    /* renamed from: a */
    private boolean m57082a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public int getAge() {
        return this.f51258f;
    }

    public String getGender() {
        return this.f51259g;
    }

    public double getIapt() {
        return this.f51262j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f51261i;
    }

    public int getLevel() {
        return this.f51260h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f51258f != -1) {
            arrayList.add(new Pair<>("age", this.f51258f + ""));
        }
        if (!TextUtils.isEmpty(this.f51259g)) {
            arrayList.add(new Pair<>(GENDER, this.f51259g));
        }
        if (this.f51260h != -1) {
            arrayList.add(new Pair<>(LEVEL, this.f51260h + ""));
        }
        if (this.f51261i != null) {
            arrayList.add(new Pair<>(PAYING, this.f51261i + ""));
        }
        if (this.f51262j != -1.0d) {
            arrayList.add(new Pair<>(IAPT, this.f51262j + ""));
        }
        if (this.f51263k != 0) {
            arrayList.add(new Pair<>(USER_CREATION_DATE, this.f51263k + ""));
        }
        if (!TextUtils.isEmpty(this.f51253a)) {
            arrayList.add(new Pair<>(f51252m, this.f51253a));
        }
        arrayList.addAll(this.f51264l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f51253a;
    }

    public long getUcd() {
        return this.f51263k;
    }

    public void setAge(int i) {
        if (i > 0 && i <= 199) {
            this.f51258f = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (m57082a(str) && m57082a(str2) && m57081a(str, 1, 32) && m57081a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f51264l.size() >= 5) {
                    this.f51264l.remove(0);
                }
                this.f51264l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str) && (StringUtils.toLowerCase(str).equals("male") || StringUtils.toLowerCase(str).equals("female"))) {
            this.f51259g = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d) {
        if (d > 0.0d && d < this.f51255c) {
            this.f51262j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f51255c, 2);
    }

    public void setIsPaying(boolean z) {
        if (this.f51261i == null) {
            this.f51261i = new AtomicBoolean();
        }
        this.f51261i.set(z);
    }

    public void setLevel(int i) {
        if (i > 0 && i < this.f51254b) {
            this.f51260h = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f51254b, 2);
    }

    public void setSegmentName(String str) {
        if (m57082a(str) && m57081a(str, 1, 32)) {
            this.f51253a = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f51263k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e) {
                C20086i9.m57997d().m58003a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m57081a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}
