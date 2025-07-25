package io.bidmachine.rendering.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.utils.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class AdElementParams {

    /* renamed from: a */
    private final AdElementType f97817a;

    /* renamed from: b */
    private final String f97818b;

    /* renamed from: c */
    private final String f97819c;

    /* renamed from: d */
    private final String f97820d;

    /* renamed from: e */
    private final ElementLayoutParams f97821e;

    /* renamed from: f */
    private final AppearanceParams f97822f;

    /* renamed from: g */
    private final Map f97823g;

    /* renamed from: h */
    private final MeasurerFactory f97824h;

    /* renamed from: i */
    private final List f97825i;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final AdElementType f97826a;

        /* renamed from: b */
        private final String f97827b;

        /* renamed from: c */
        private final ElementLayoutParams f97828c;

        /* renamed from: d */
        private final AppearanceParams f97829d;

        /* renamed from: e */
        private final Map f97830e = new HashMap();

        /* renamed from: f */
        private String f97831f;

        /* renamed from: g */
        private String f97832g;

        /* renamed from: h */
        private MeasurerFactory f97833h;

        /* renamed from: i */
        private List f97834i;

        public Builder(@NonNull AdElementType adElementType, @NonNull String str, @NonNull ElementLayoutParams elementLayoutParams, @NonNull AppearanceParams appearanceParams) {
            this.f97826a = adElementType;
            this.f97827b = str;
            this.f97828c = elementLayoutParams;
            this.f97829d = appearanceParams;
        }

        public AdElementParams build() {
            return new AdElementParams(this.f97826a, this.f97827b, this.f97831f, this.f97832g, this.f97828c, this.f97829d, this.f97830e, this.f97833h, this.f97834i);
        }

        public Builder setCustomParams(@Nullable Map<String, String> map) {
            Utils.set(this.f97830e, map);
            return this;
        }

        public Builder setMeasurerFactory(@Nullable MeasurerFactory measurerFactory) {
            this.f97833h = measurerFactory;
            return this;
        }

        public Builder setMeasurerParamsList(@Nullable List<MeasurerParams> list) {
            this.f97834i = list;
            return this;
        }

        public Builder setPlaceholder(@Nullable String str) {
            this.f97832g = str;
            return this;
        }

        public Builder setSource(@Nullable String str) {
            this.f97831f = str;
            return this;
        }
    }

    public AdElementParams(@NonNull AdElementType adElementType, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull ElementLayoutParams elementLayoutParams, @NonNull AppearanceParams appearanceParams, @NonNull Map<String, String> map, @Nullable MeasurerFactory measurerFactory, @Nullable List<MeasurerParams> list) {
        this.f97817a = adElementType;
        this.f97818b = str.toLowerCase();
        this.f97819c = str2;
        this.f97820d = str3;
        this.f97821e = elementLayoutParams;
        this.f97822f = appearanceParams;
        this.f97823g = map;
        this.f97824h = measurerFactory;
        this.f97825i = list;
    }

    @NonNull
    public AdElementParams addCustomParams(@Nullable String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            this.f97823g.put(str, str2);
        }
        return this;
    }

    @NonNull
    public AdElementType getAdElementType() {
        return this.f97817a;
    }

    @NonNull
    public AppearanceParams getAppearanceParams() {
        return this.f97822f;
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return (String) this.f97823g.get(str);
    }

    @NonNull
    public Map<String, String> getCustomParams() {
        return this.f97823g;
    }

    @NonNull
    public ElementLayoutParams getLayoutParams() {
        return this.f97821e;
    }

    @Nullable
    public MeasurerFactory getMeasurerFactory() {
        return this.f97824h;
    }

    @Nullable
    public List<MeasurerParams> getMeasurerParamsList() {
        return this.f97825i;
    }

    @NonNull
    public String getName() {
        return this.f97818b;
    }

    @Nullable
    public String getPlaceholder() {
        return this.f97820d;
    }

    @Nullable
    public String getSource() {
        return this.f97819c;
    }
}
