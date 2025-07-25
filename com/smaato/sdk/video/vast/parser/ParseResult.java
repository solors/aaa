package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.collections.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ParseResult<Result> {
    @NonNull
    public final List<ParseError> errors;
    @Nullable
    public final Result value;

    /* loaded from: classes7.dex */
    public static class Builder<Result> {
        @Nullable
        private List<ParseError> errors;
        @Nullable
        private Result value;

        @NonNull
        public ParseResult<Result> build() {
            if (this.value == null && this.errors == null) {
                throw new IllegalStateException("ParseResult should contain value or list of errors at least");
            }
            return new ParseResult<>(Lists.toImmutableList((Collection) this.errors), this.value);
        }

        @NonNull
        public Builder<Result> setErrors(@Nullable List<ParseError> list) {
            this.errors = list;
            return this;
        }

        @NonNull
        public Builder<Result> setResult(@Nullable Result result) {
            this.value = result;
            return this;
        }
    }

    @NonNull
    public static <Result> ParseResult<Result> error(@NonNull String str, @Nullable Exception exc) {
        return new ParseResult<>(Collections.singletonList(ParseError.buildFrom(str, exc)), null);
    }

    private ParseResult(@NonNull List<ParseError> list, @Nullable Result result) {
        this.errors = list;
        this.value = result;
    }

    @NonNull
    public static <Result> ParseResult<Result> error(@NonNull ParseError parseError) {
        return new ParseResult<>(Collections.singletonList(parseError), null);
    }
}
