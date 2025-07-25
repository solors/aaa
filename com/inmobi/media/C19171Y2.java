package com.inmobi.media;

/* renamed from: com.inmobi.media.Y2 */
/* loaded from: classes6.dex */
public final class C19171Y2 {

    /* renamed from: a */
    public final long f47997a;

    /* renamed from: b */
    public final long f47998b;

    /* renamed from: c */
    public final long f47999c;

    public C19171Y2(long j, long j2, long j3) {
        this.f47997a = j;
        this.f47998b = j2;
        this.f47999c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19171Y2)) {
            return false;
        }
        C19171Y2 c19171y2 = (C19171Y2) obj;
        if (this.f47997a == c19171y2.f47997a && this.f47998b == c19171y2.f47998b && this.f47999c == c19171y2.f47999c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f47998b);
        return Long.hashCode(this.f47999c) + ((hashCode + (Long.hashCode(this.f47997a) * 31)) * 31);
    }

    public final String toString() {
        return "DeviceMemoryInfo(maxHeapSize=" + this.f47997a + ", freeHeapSize=" + this.f47998b + ", currentHeapSize=" + this.f47999c + ')';
    }
}
