package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class ViewableImpression {

    /* renamed from: ID */
    public static final String f72494ID = "id";
    public static final String NAME = "ViewableImpression";
    public static final String NOT_VIEWABLE = "NotViewable";
    public static final String VIEWABLE = "Viewable";
    public static final String VIEW_UNDETERMINED = "ViewUndetermined";
    @Nullable

    /* renamed from: id */
    public final String f72495id;
    @NonNull
    public final List<String> notViewable;
    @NonNull
    public final List<String> viewUndetermined;
    @NonNull
    public final List<String> viewable;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable

        /* renamed from: id */
        private String f72496id;
        @Nullable
        private List<String> notViewable;
        @Nullable
        private List<String> viewUndetermined;
        @Nullable
        private List<String> viewable;

        @NonNull
        public ViewableImpression build() {
            this.viewable = VastModels.toImmutableList(this.viewable);
            this.notViewable = VastModels.toImmutableList(this.notViewable);
            List<String> immutableList = VastModels.toImmutableList(this.viewUndetermined);
            this.viewUndetermined = immutableList;
            return new ViewableImpression(this.viewable, this.notViewable, immutableList, this.f72496id);
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72496id = str;
            return this;
        }

        @NonNull
        public Builder setNotViewable(@Nullable List<String> list) {
            this.notViewable = list;
            return this;
        }

        @NonNull
        public Builder setViewUndetermined(@Nullable List<String> list) {
            this.viewUndetermined = list;
            return this;
        }

        @NonNull
        public Builder setViewable(@Nullable List<String> list) {
            this.viewable = list;
            return this;
        }
    }

    ViewableImpression(@NonNull List<String> list, @NonNull List<String> list2, @NonNull List<String> list3, @Nullable String str) {
        this.f72495id = str;
        this.viewable = list;
        this.notViewable = list2;
        this.viewUndetermined = list3;
    }
}
