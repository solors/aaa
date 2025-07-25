package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.mraid.Consts;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.exception.MraidException;
import com.smaato.sdk.richmedia.util.RectUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MraidResizeProperties {
    final boolean allowOffscreen;
    final int heightDp;
    final int offsetXDp;
    final int offsetYDp;
    final int widthDp;

    /* loaded from: classes7.dex */
    public static class Builder {
        @NonNull
        private Boolean allowOffscreen;
        @Nullable
        private Integer heightDp;
        @Nullable
        private Integer offsetXDp;
        @Nullable
        private Integer offsetYDp;
        @Nullable
        private Integer widthDp;

        public Builder(@NonNull Map<String, String> map) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            this.allowOffscreen = Boolean.FALSE;
            String str = map.get("width");
            if (!TextUtils.isEmpty(str)) {
                Float parseOptFloat = MraidUtils.parseOptFloat(str);
                if (parseOptFloat == null) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parseOptFloat.intValue());
                }
                this.widthDp = valueOf3;
            }
            String str2 = map.get("height");
            if (!TextUtils.isEmpty(str2)) {
                Float parseOptFloat2 = MraidUtils.parseOptFloat(str2);
                if (parseOptFloat2 == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parseOptFloat2.intValue());
                }
                this.heightDp = valueOf2;
            }
            String str3 = map.get(Consts.ResizePropertiesOffsetX);
            if (!TextUtils.isEmpty(str3)) {
                Float parseOptFloat3 = MraidUtils.parseOptFloat(str3);
                if (parseOptFloat3 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parseOptFloat3.intValue());
                }
                this.offsetXDp = valueOf;
            }
            String str4 = map.get(Consts.ResizePropertiesOffsetY);
            if (!TextUtils.isEmpty(str4)) {
                Float parseOptFloat4 = MraidUtils.parseOptFloat(str4);
                this.offsetYDp = parseOptFloat4 != null ? Integer.valueOf(parseOptFloat4.intValue()) : null;
            }
            String str5 = map.get(Consts.ResizePropertiesAllowOffscreen);
            if (!TextUtils.isEmpty(str5)) {
                this.allowOffscreen = Boolean.valueOf(Boolean.parseBoolean(str5));
            }
        }

        @NonNull
        public MraidResizeProperties build() throws MraidException {
            ArrayList arrayList = new ArrayList();
            if (this.widthDp == null) {
                arrayList.add("width");
            }
            if (this.heightDp == null) {
                arrayList.add("height");
            }
            if (this.offsetXDp == null) {
                arrayList.add(Consts.ResizePropertiesOffsetX);
            }
            if (this.offsetYDp == null) {
                arrayList.add(Consts.ResizePropertiesOffsetY);
            }
            if (arrayList.isEmpty()) {
                if (this.widthDp.intValue() >= 50 && this.heightDp.intValue() >= 50) {
                    return new MraidResizeProperties(this.widthDp.intValue(), this.heightDp.intValue(), this.offsetXDp.intValue(), this.offsetYDp.intValue(), this.allowOffscreen.booleanValue());
                }
                throw new MraidException("Expected resize dimension should be >= 50 dp");
            }
            throw new MraidException("Missing required parameter(s): " + Joiner.join(", ", arrayList));
        }
    }

    @NonNull
    public Rect getRectRelativeToMaxSize(@NonNull Rect rect, @NonNull Rect rect2) {
        int i = this.offsetXDp;
        int i2 = this.offsetYDp;
        if (!rect.isEmpty()) {
            i += rect.left;
            i2 += rect.top;
        }
        Rect rect3 = new Rect(i, i2, this.widthDp + i, this.heightDp + i2);
        if (this.allowOffscreen) {
            return rect3;
        }
        return RectUtils.adjust(rect3, rect2);
    }

    private MraidResizeProperties(int i, int i2, int i3, int i4, boolean z) {
        this.widthDp = i;
        this.heightDp = i2;
        this.offsetXDp = i3;
        this.offsetYDp = i4;
        this.allowOffscreen = z;
    }
}
