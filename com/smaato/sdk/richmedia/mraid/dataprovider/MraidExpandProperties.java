package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.exception.MraidException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MraidExpandProperties {
    public final int heightDp;
    public final boolean isModal;
    public final int widthDp;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private Integer heightDp;
        @Nullable
        private Integer widthDp;

        public Builder(@NonNull Map<String, String> map) {
            Integer valueOf;
            String str = map.get("width");
            if (!TextUtils.isEmpty(str)) {
                Float parseOptFloat = MraidUtils.parseOptFloat(str);
                if (parseOptFloat == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parseOptFloat.intValue());
                }
                this.widthDp = valueOf;
            }
            String str2 = map.get("height");
            if (!TextUtils.isEmpty(str2)) {
                Float parseOptFloat2 = MraidUtils.parseOptFloat(str2);
                this.heightDp = parseOptFloat2 != null ? Integer.valueOf(parseOptFloat2.intValue()) : null;
            }
        }

        @NonNull
        public MraidExpandProperties build() throws MraidException {
            ArrayList arrayList = new ArrayList();
            if (this.widthDp == null) {
                arrayList.add("width");
            }
            if (this.heightDp == null) {
                arrayList.add("height");
            }
            if (arrayList.isEmpty()) {
                if (this.widthDp.intValue() <= 0) {
                    arrayList.add("width");
                }
                if (this.heightDp.intValue() <= 0) {
                    arrayList.add("height");
                }
                if (arrayList.isEmpty()) {
                    return new MraidExpandProperties(this.widthDp.intValue(), this.heightDp.intValue());
                }
                throw new MraidException("Invalid parameter(s): " + Joiner.join(", ", arrayList));
            }
            throw new MraidException("Missing required parameter(s): " + Joiner.join(", ", arrayList));
        }
    }

    private MraidExpandProperties(int i, int i2) {
        this.isModal = true;
        this.widthDp = i;
        this.heightDp = i2;
    }
}
