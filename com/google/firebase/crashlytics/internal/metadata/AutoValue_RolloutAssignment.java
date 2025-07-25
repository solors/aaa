package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes4.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* renamed from: a */
    private final String f42439a;

    /* renamed from: b */
    private final String f42440b;

    /* renamed from: c */
    private final String f42441c;

    /* renamed from: d */
    private final String f42442d;

    /* renamed from: e */
    private final long f42443e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.f42439a = str;
            if (str2 != null) {
                this.f42440b = str2;
                if (str3 != null) {
                    this.f42441c = str3;
                    if (str4 != null) {
                        this.f42442d = str4;
                        this.f42443e = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (this.f42439a.equals(rolloutAssignment.getRolloutId()) && this.f42440b.equals(rolloutAssignment.getParameterKey()) && this.f42441c.equals(rolloutAssignment.getParameterValue()) && this.f42442d.equals(rolloutAssignment.getVariantId()) && this.f42443e == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.f42440b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.f42441c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.f42439a;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.f42443e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.f42442d;
    }

    public int hashCode() {
        long j = this.f42443e;
        return ((((((((this.f42439a.hashCode() ^ 1000003) * 1000003) ^ this.f42440b.hashCode()) * 1000003) ^ this.f42441c.hashCode()) * 1000003) ^ this.f42442d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f42439a + ", parameterKey=" + this.f42440b + ", parameterValue=" + this.f42441c + ", variantId=" + this.f42442d + ", templateVersion=" + this.f42443e + "}";
    }
}
