package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CallbackManager.kt */
@Metadata
/* loaded from: classes3.dex */
public interface CallbackManager {

    /* compiled from: CallbackManager.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class ActivityResultParameters {
        @Nullable
        private final Intent data;
        private final int requestCode;
        private final int resultCode;

        public ActivityResultParameters(int i, int i2, @Nullable Intent intent) {
            this.requestCode = i;
            this.resultCode = i2;
            this.data = intent;
        }

        public static /* synthetic */ ActivityResultParameters copy$default(ActivityResultParameters activityResultParameters, int i, int i2, Intent intent, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = activityResultParameters.requestCode;
            }
            if ((i3 & 2) != 0) {
                i2 = activityResultParameters.resultCode;
            }
            if ((i3 & 4) != 0) {
                intent = activityResultParameters.data;
            }
            return activityResultParameters.copy(i, i2, intent);
        }

        public final int component1() {
            return this.requestCode;
        }

        public final int component2() {
            return this.resultCode;
        }

        @Nullable
        public final Intent component3() {
            return this.data;
        }

        @NotNull
        public final ActivityResultParameters copy(int i, int i2, @Nullable Intent intent) {
            return new ActivityResultParameters(i, i2, intent);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityResultParameters)) {
                return false;
            }
            ActivityResultParameters activityResultParameters = (ActivityResultParameters) obj;
            if (this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && Intrinsics.m17075f(this.data, activityResultParameters.data)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final Intent getData() {
            return this.data;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((Integer.hashCode(this.requestCode) * 31) + Integer.hashCode(this.resultCode)) * 31;
            Intent intent = this.data;
            if (intent == null) {
                hashCode = 0;
            } else {
                hashCode = intent.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    /* compiled from: CallbackManager.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Factory {
        @NotNull
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @NotNull
        public static final CallbackManager create() {
            return new CallbackManagerImpl();
        }
    }

    boolean onActivityResult(int i, int i2, @Nullable Intent intent);
}
