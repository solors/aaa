package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;

/* loaded from: classes7.dex */
public class Tracking {
    public static final String EVENT = "event";
    public static final String NAME = "Tracking";
    public static final String OFFSET = "offset";
    public static final String URL = "url";
    @Nullable
    public final String offset;
    @NonNull
    public final String url;
    @NonNull
    public final VastEvent vastEvent;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String offset;
        @Nullable
        private String url;
        @Nullable
        private VastEvent vastEvent;

        @Nullable
        private String getOffsetForQuarterEvent(@NonNull VastEvent vastEvent) {
            int i = C27721a.f72485a[vastEvent.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return "0%";
                    }
                    return "25%";
                }
                return "50%";
            }
            return "75%";
        }

        @NonNull
        public Tracking build() throws VastElementMissingException {
            String str;
            VastModels.requireNonNull(this.vastEvent, "Cannot build Tracking: event is missing");
            VastModels.requireNonNull(this.url, "Cannot build Tracking: url is missing");
            if (TextUtils.isEmpty(this.offset)) {
                str = getOffsetForQuarterEvent(this.vastEvent);
            } else {
                str = this.offset;
            }
            this.offset = str;
            return new Tracking(this.vastEvent, this.url, str);
        }

        @NonNull
        public Builder setOffset(@Nullable String str) {
            this.offset = str;
            return this;
        }

        @NonNull
        public Builder setUrl(@Nullable String str) {
            this.url = str;
            return this;
        }

        @NonNull
        public Builder setVastEvent(@Nullable VastEvent vastEvent) {
            this.vastEvent = vastEvent;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.video.vast.model.Tracking$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C27721a {

        /* renamed from: a */
        static final /* synthetic */ int[] f72485a;

        static {
            int[] iArr = new int[VastEvent.values().length];
            f72485a = iArr;
            try {
                iArr[VastEvent.THIRD_QUARTILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72485a[VastEvent.MID_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72485a[VastEvent.FIRST_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72485a[VastEvent.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    Tracking(@NonNull VastEvent vastEvent, @NonNull String str, @Nullable String str2) {
        this.vastEvent = vastEvent;
        this.url = str;
        this.offset = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tracking tracking = (Tracking) obj;
        if (!this.url.equals(tracking.url) || this.vastEvent != tracking.vastEvent) {
            return false;
        }
        String str = this.offset;
        String str2 = tracking.offset;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.url.hashCode() * 31) + this.vastEvent.hashCode()) * 31;
        String str = this.offset;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
