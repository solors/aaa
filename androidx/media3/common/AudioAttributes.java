package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class AudioAttributes implements Bundleable {
    public final int allowedCapturePolicy;
    @Nullable
    private AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    private static final String FIELD_CONTENT_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_FLAGS = Util.intToStringMaxRadix(1);
    private static final String FIELD_USAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_ALLOWED_CAPTURE_POLICY = Util.intToStringMaxRadix(3);
    private static final String FIELD_SPATIALIZATION_BEHAVIOR = Util.intToStringMaxRadix(4);
    @UnstableApi
    public static final Bundleable.Creator<AudioAttributes> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.d
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return AudioAttributes.m104673a(bundle);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(32)
    /* loaded from: classes.dex */
    public static final class Api32 {
        private Api32() {
        }

        @DoNotInline
        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(AudioAttributes audioAttributes) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(audioAttributes.contentType).setFlags(audioAttributes.flags).setUsage(audioAttributes.usage);
            int i = Util.SDK_INT;
            if (i >= 29) {
                Api29.setAllowedCapturePolicy(usage, audioAttributes.allowedCapturePolicy);
            }
            if (i >= 32) {
                Api32.setSpatializationBehavior(usage, audioAttributes.spatializationBehavior);
            }
            this.audioAttributes = usage.build();
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;
        private int spatializationBehavior = 0;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior);
        }

        @CanIgnoreReturnValue
        public Builder setAllowedCapturePolicy(int i) {
            this.allowedCapturePolicy = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setContentType(int i) {
            this.contentType = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSpatializationBehavior(int i) {
            this.spatializationBehavior = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUsage(int i) {
            this.usage = i;
            return this;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AudioAttributes m104673a(Bundle bundle) {
        return lambda$static$0(bundle);
    }

    public static /* synthetic */ AudioAttributes lambda$static$0(Bundle bundle) {
        Builder builder = new Builder();
        String str = FIELD_CONTENT_TYPE;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        String str2 = FIELD_FLAGS;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        String str3 = FIELD_USAGE;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        String str4 = FIELD_ALLOWED_CAPTURE_POLICY;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = FIELD_SPATIALIZATION_BEHAVIOR;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        return builder.build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        if (this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    public AudioAttributesV21 getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            this.audioAttributesV21 = new AudioAttributesV21();
        }
        return this.audioAttributesV21;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior;
    }

    @Override // androidx.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_CONTENT_TYPE, this.contentType);
        bundle.putInt(FIELD_FLAGS, this.flags);
        bundle.putInt(FIELD_USAGE, this.usage);
        bundle.putInt(FIELD_ALLOWED_CAPTURE_POLICY, this.allowedCapturePolicy);
        bundle.putInt(FIELD_SPATIALIZATION_BEHAVIOR, this.spatializationBehavior);
        return bundle;
    }

    private AudioAttributes(int i, int i2, int i3, int i4, int i5) {
        this.contentType = i;
        this.flags = i2;
        this.usage = i3;
        this.allowedCapturePolicy = i4;
        this.spatializationBehavior = i5;
    }
}
