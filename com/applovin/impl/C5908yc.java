package com.applovin.impl;

import com.applovin.impl.sdk.C5434n;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.yc */
/* loaded from: classes2.dex */
public class C5908yc {

    /* renamed from: a */
    private final C5636ug f12307a = new C5636ug();

    /* renamed from: b */
    private final TreeSet f12308b = new TreeSet();

    /* renamed from: c */
    private final Map f12309c = new HashMap();

    /* renamed from: d */
    private int f12310d;

    /* renamed from: e */
    private int f12311e;

    public C5908yc(MaxAdPlacerSettings maxAdPlacerSettings) {
        m92775a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    public void m92780a() {
        this.f12309c.clear();
        this.f12308b.clear();
    }

    /* renamed from: b */
    public int m92772b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m92777a(i - 1, false);
    }

    /* renamed from: c */
    public int m92769c(int i) {
        return i + m92777a(i, false);
    }

    /* renamed from: d */
    public int m92767d(int i) {
        if (m92764g(i)) {
            return -1;
        }
        return i - m92777a(i, true);
    }

    /* renamed from: e */
    public Collection m92766e(int i) {
        return new TreeSet((SortedSet) this.f12308b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: f */
    public void m92765f(int i) {
        int m94081b = this.f12307a.m94081b(Integer.valueOf(i));
        for (int size = this.f12307a.size() - 1; size >= m94081b; size--) {
            Integer num = (Integer) this.f12307a.m94085a(size);
            int intValue = num.intValue() + 1;
            m92778a(num.intValue(), intValue);
            this.f12307a.m94084a(size, Integer.valueOf(intValue));
        }
    }

    /* renamed from: g */
    public boolean m92764g(int i) {
        return this.f12307a.contains(Integer.valueOf(i));
    }

    /* renamed from: h */
    public boolean m92763h(int i) {
        return this.f12308b.contains(Integer.valueOf(i));
    }

    /* renamed from: i */
    public void m92762i(int i) {
        int m94081b = this.f12307a.m94081b(Integer.valueOf(i));
        if (m92764g(i)) {
            this.f12309c.remove(Integer.valueOf(i));
            this.f12308b.remove(Integer.valueOf(i));
            this.f12307a.m94082b(m94081b);
        }
        while (m94081b < this.f12307a.size()) {
            Integer num = (Integer) this.f12307a.m94085a(m94081b);
            int intValue = num.intValue() - 1;
            m92778a(num.intValue(), intValue);
            this.f12307a.m94084a(m94081b, Integer.valueOf(intValue));
            m94081b++;
        }
    }

    /* renamed from: b */
    public void m92771b(int i, int i2) {
        m92762i(i);
        m92765f(i2);
    }

    /* renamed from: c */
    public int m92770c() {
        int i = this.f12310d;
        if (i != -1 && this.f12311e != -1) {
            while (i <= this.f12311e) {
                if (m92764g(i) && !m92763h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m92774a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f12309c.remove(num);
            this.f12308b.remove(num);
        }
    }

    /* renamed from: b */
    public Collection m92773b() {
        return new TreeSet((SortedSet) this.f12308b);
    }

    /* renamed from: c */
    public void m92768c(int i, int i2) {
        this.f12310d = i;
        this.f12311e = i2;
    }

    /* renamed from: a */
    public MaxAd m92779a(int i) {
        return (MaxAd) this.f12309c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    private int m92777a(int i, boolean z) {
        int m94080c = this.f12307a.m94080c(Integer.valueOf(i));
        if (!z) {
            int i2 = i + m94080c;
            while (m94080c < this.f12307a.size() && i2 >= ((Integer) this.f12307a.m94085a(m94080c)).intValue()) {
                i2++;
                m94080c++;
            }
        }
        return m94080c;
    }

    /* renamed from: a */
    private void m92775a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C5434n.m94898h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f12307a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f12307a.isEmpty()) {
            this.f12307a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.f12307a.m94086a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f12307a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            }
            this.f12307a.add(Integer.valueOf(intValue));
        }
    }

    /* renamed from: a */
    public void m92776a(MaxAd maxAd, int i) {
        this.f12309c.put(Integer.valueOf(i), maxAd);
        this.f12308b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m92778a(int i, int i2) {
        if (this.f12309c.containsKey(Integer.valueOf(i))) {
            this.f12309c.put(Integer.valueOf(i2), (MaxAd) this.f12309c.get(Integer.valueOf(i)));
            this.f12308b.add(Integer.valueOf(i2));
            this.f12309c.remove(Integer.valueOf(i));
            this.f12308b.remove(Integer.valueOf(i));
        }
    }
}
