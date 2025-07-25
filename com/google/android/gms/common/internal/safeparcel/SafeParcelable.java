package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes4.dex */
public interface SafeParcelable extends Parcelable {
    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Class {
        @NonNull
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Constructor {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m72314id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Param {
        /* renamed from: id */
        int m72313id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m72312id();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface Reserved {
        @NonNull
        int[] value();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes4.dex */
    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m72311id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
