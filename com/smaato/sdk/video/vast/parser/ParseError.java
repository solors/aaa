package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class ParseError {
    @NonNull
    public final String enclosingName;
    @Nullable
    public final Exception exception;
    @Nullable
    public final List<ParseError> nestedErrors;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String enclosingName;
        @Nullable
        private Exception exception;
        @Nullable
        private List<ParseError> nestedErrors;

        @NonNull
        public ParseError build() {
            List unmodifiableList;
            Objects.requireNonNull(this.enclosingName);
            List<ParseError> list = this.nestedErrors;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            return new ParseError(this.enclosingName, this.exception, unmodifiableList);
        }

        @NonNull
        public Builder setEnclosingName(@Nullable String str) {
            this.enclosingName = str;
            return this;
        }

        @NonNull
        public Builder setException(@Nullable Exception exc) {
            this.exception = exc;
            return this;
        }

        @NonNull
        public Builder setNestedErrors(@Nullable List<ParseError> list) {
            this.nestedErrors = list;
            return this;
        }
    }

    public ParseError(@NonNull String str, @Nullable Exception exc, @Nullable List<ParseError> list) {
        this.enclosingName = str;
        this.exception = exc;
        this.nestedErrors = list;
    }

    @NonNull
    public static ParseError buildFrom(@NonNull String str, @Nullable Exception exc) {
        return new Builder().setEnclosingName(str).setException(exc).build();
    }
}
