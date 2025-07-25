package com.mobilefuse.videoplayer.model;

import be.MathJVM;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormatting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastTime.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastTime {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String formattedValue;
    private final boolean isPercentageMode;
    private final float percentageValue;
    private final float valueInFloatSeconds;
    private final long valueInMillis;
    private final int valueInSeconds;

    /* compiled from: VastTime.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final VastTime create(@Nullable String str) {
            boolean z;
            if (str == null) {
                return null;
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                return new VastTime(str, null);
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
                return null;
            }
        }
    }

    private VastTime(String str) {
        boolean m16616x;
        int m103791d;
        String m16628I;
        this.formattedValue = str;
        m16616x = StringsJVM.m16616x(str, "%", false, 2, null);
        if (m16616x) {
            this.isPercentageMode = true;
            this.valueInFloatSeconds = 0.0f;
            this.valueInSeconds = 0;
            this.valueInMillis = 0L;
            m16628I = StringsJVM.m16628I(str, "%", "", false, 4, null);
            this.percentageValue = Float.parseFloat(m16628I) / 100.0f;
            return;
        }
        this.isPercentageMode = false;
        this.percentageValue = 0.0f;
        Long formattedTimeToMillis = StringEncodingAndFormatting.formattedTimeToMillis(str);
        if (formattedTimeToMillis != null) {
            long longValue = formattedTimeToMillis.longValue();
            this.valueInMillis = longValue;
            float f = ((float) longValue) / 1000.0f;
            this.valueInFloatSeconds = f;
            m103791d = MathJVM.m103791d(f);
            this.valueInSeconds = m103791d;
            return;
        }
        throw new NumberFormatException("Can't format " + str + " to milliseconds");
    }

    @NotNull
    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public final float getPercentageValue() {
        return this.percentageValue;
    }

    public final float getValueInFloatSeconds() {
        return this.valueInFloatSeconds;
    }

    public final long getValueInMillis() {
        return this.valueInMillis;
    }

    public final long getValueInMillisForDuration(long j) {
        if (!this.isPercentageMode) {
            return this.valueInMillis;
        }
        return this.percentageValue * ((float) j);
    }

    public final int getValueInSeconds() {
        return this.valueInSeconds;
    }

    public final boolean isPercentageMode() {
        return this.isPercentageMode;
    }

    public /* synthetic */ VastTime(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
