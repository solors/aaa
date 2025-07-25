package com.inmobi.media;

/* renamed from: com.inmobi.media.Y9 */
/* loaded from: classes6.dex */
public final class C19178Y9 {

    /* renamed from: a */
    public final int f48018a;

    public C19178Y9(int i) {
        this.f48018a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19178Y9) && this.f48018a == ((C19178Y9) obj).f48018a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48018a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f48018a + ')';
    }
}
