package com.smaato.sdk.richmedia.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;

/* loaded from: classes7.dex */
public class RichMediaWebViewFactory {
    @NonNull
    private final RichMediaHtmlUtils htmlUtils;
    @NonNull
    private final Logger logger;

    public RichMediaWebViewFactory(@NonNull Logger logger, @NonNull RichMediaHtmlUtils richMediaHtmlUtils) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.htmlUtils = (RichMediaHtmlUtils) Objects.requireNonNull(richMediaHtmlUtils);
    }

    @NonNull
    public RichMediaWebView create(@NonNull Context context) {
        return new RichMediaWebView(context, this.logger, this.htmlUtils);
    }
}
