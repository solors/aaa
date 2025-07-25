package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

/* loaded from: classes4.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* renamed from: a */
    private final String f43608a;

    /* renamed from: b */
    private final String f43609b;

    /* renamed from: c */
    private final String f43610c;

    /* renamed from: d */
    private final String f43611d;

    /* renamed from: e */
    private final long f43612e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends RolloutAssignment.Builder {

        /* renamed from: a */
        private String f43613a;

        /* renamed from: b */
        private String f43614b;

        /* renamed from: c */
        private String f43615c;

        /* renamed from: d */
        private String f43616d;

        /* renamed from: e */
        private long f43617e;

        /* renamed from: f */
        private byte f43618f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.f43618f == 1 && this.f43613a != null && this.f43614b != null && this.f43615c != null && this.f43616d != null) {
                return new AutoValue_RolloutAssignment(this.f43613a, this.f43614b, this.f43615c, this.f43616d, this.f43617e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f43613a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f43614b == null) {
                sb2.append(" variantId");
            }
            if (this.f43615c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f43616d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f43618f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.f43615c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.f43616d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String str) {
            if (str != null) {
                this.f43613a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long j) {
            this.f43617e = j;
            this.f43618f = (byte) (this.f43618f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String str) {
            if (str != null) {
                this.f43614b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (this.f43608a.equals(rolloutAssignment.getRolloutId()) && this.f43609b.equals(rolloutAssignment.getVariantId()) && this.f43610c.equals(rolloutAssignment.getParameterKey()) && this.f43611d.equals(rolloutAssignment.getParameterValue()) && this.f43612e == rolloutAssignment.getTemplateVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterKey() {
        return this.f43610c;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterValue() {
        return this.f43611d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getRolloutId() {
        return this.f43608a;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.f43612e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getVariantId() {
        return this.f43609b;
    }

    public int hashCode() {
        long j = this.f43612e;
        return ((((((((this.f43608a.hashCode() ^ 1000003) * 1000003) ^ this.f43609b.hashCode()) * 1000003) ^ this.f43610c.hashCode()) * 1000003) ^ this.f43611d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f43608a + ", variantId=" + this.f43609b + ", parameterKey=" + this.f43610c + ", parameterValue=" + this.f43611d + ", templateVersion=" + this.f43612e + "}";
    }

    private AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        this.f43608a = str;
        this.f43609b = str2;
        this.f43610c = str3;
        this.f43611d = str4;
        this.f43612e = j;
    }
}
