package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.applovin.impl.u7 */
/* loaded from: classes2.dex */
public class C5606u7 {

    /* renamed from: b */
    private final String f11065b;

    /* renamed from: c */
    private final Map f11066c;

    /* renamed from: a */
    private final String f11064a = UUID.randomUUID().toString();

    /* renamed from: d */
    private final long f11067d = System.currentTimeMillis();

    public C5606u7(String str, Map map) {
        this.f11065b = str;
        this.f11066c = map;
    }

    /* renamed from: a */
    public long m94258a() {
        return this.f11067d;
    }

    /* renamed from: b */
    public String m94257b() {
        return this.f11064a;
    }

    /* renamed from: c */
    public String m94256c() {
        return this.f11065b;
    }

    /* renamed from: d */
    public Map m94255d() {
        return this.f11066c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5606u7 c5606u7 = (C5606u7) obj;
        if (this.f11067d != c5606u7.f11067d || !Objects.equals(this.f11065b, c5606u7.f11065b) || !Objects.equals(this.f11066c, c5606u7.f11066c)) {
            return false;
        }
        return Objects.equals(this.f11064a, c5606u7.f11064a);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f11065b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.f11066c;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f11067d;
        int i5 = (((i4 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f11064a;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return "Event{name='" + this.f11065b + "', id='" + this.f11064a + "', creationTimestampMillis=" + this.f11067d + ", parameters=" + this.f11066c + '}';
    }
}
