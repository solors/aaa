package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public final class AudioAttributes implements Bundleable {
    public final int allowedCapturePolicy;
    @Nullable

    /* renamed from: b */
    private AudioAttributesV21 f32345b;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();

    /* renamed from: c */
    private static final String f32340c = Util.intToStringMaxRadix(0);

    /* renamed from: d */
    private static final String f32341d = Util.intToStringMaxRadix(1);

    /* renamed from: f */
    private static final String f32342f = Util.intToStringMaxRadix(2);

    /* renamed from: g */
    private static final String f32343g = Util.intToStringMaxRadix(3);

    /* renamed from: h */
    private static final String f32344h = Util.intToStringMaxRadix(4);
    public static final Bundleable.Creator<AudioAttributes> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.audio.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            AudioAttributes m75087b;
            m75087b = AudioAttributes.m75087b(bundle);
            return m75087b;
        }
    };

    @RequiresApi(29)
    /* loaded from: classes4.dex */
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static void setAllowedCapturePolicy(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    @RequiresApi(32)
    /* loaded from: classes4.dex */
    public static final class Api32 {
        private Api32() {
        }

        @DoNotInline
        public static void setSpatializationBehavior(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private int f32346a = 0;

        /* renamed from: b */
        private int f32347b = 0;

        /* renamed from: c */
        private int f32348c = 1;

        /* renamed from: d */
        private int f32349d = 1;

        /* renamed from: e */
        private int f32350e = 0;

        public AudioAttributes build() {
            return new AudioAttributes(this.f32346a, this.f32347b, this.f32348c, this.f32349d, this.f32350e);
        }

        @CanIgnoreReturnValue
        public Builder setAllowedCapturePolicy(int i) {
            this.f32349d = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setContentType(int i) {
            this.f32346a = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
            this.f32347b = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSpatializationBehavior(int i) {
            this.f32350e = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUsage(int i) {
            this.f32348c = i;
            return this;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ AudioAttributes m75087b(Bundle bundle) {
        Builder builder = new Builder();
        String str = f32340c;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        String str2 = f32341d;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        String str3 = f32342f;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        String str4 = f32343g;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = f32344h;
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
        if (this.f32345b == null) {
            this.f32345b = new AudioAttributesV21();
        }
        return this.f32345b;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f32340c, this.contentType);
        bundle.putInt(f32341d, this.flags);
        bundle.putInt(f32342f, this.usage);
        bundle.putInt(f32343g, this.allowedCapturePolicy);
        bundle.putInt(f32344h, this.spatializationBehavior);
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
