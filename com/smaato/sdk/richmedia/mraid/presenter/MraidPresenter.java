package com.smaato.sdk.richmedia.mraid.presenter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p574fi.BiConsumer;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.mvp.Presenter;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;

/* loaded from: classes7.dex */
public interface MraidPresenter extends Presenter<RichMediaAdContentView> {
    void handleClose();

    void handleMraidUrl(@NonNull String str, boolean z);

    void onFailedToExpand();

    void onFailedToResize(@NonNull String str);

    void onHtmlLoaded();

    void onWasClosed();

    void onWasExpanded();

    void onWasResized();

    void setAdViolationCallback(@Nullable BiConsumer<String, String> biConsumer);

    void setOnCollapseCallback(@Nullable Consumer<Whatever> consumer);

    void setOnExpandCallback(@Nullable BiConsumer<String, MraidExpandProperties> biConsumer);

    void setOnHideCallback(@Nullable Consumer<Whatever> consumer);

    void setOnOpenCallback(@Nullable Consumer<String> consumer);

    void setOnPlayVideoCallback(@Nullable Consumer<String> consumer);

    void setOnUnloadCallback(@Nullable Consumer<Whatever> consumer);

    void setResizeCallback(@Nullable Consumer<ResizeParams> consumer);

    void setUseCustomCloseCallback(@Nullable Consumer<Boolean> consumer);
}
