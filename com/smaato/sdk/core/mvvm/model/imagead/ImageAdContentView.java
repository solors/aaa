package com.smaato.sdk.core.mvvm.model.imagead;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.p573ui.ProgressView;
import com.smaato.sdk.core.p573ui.WatermarkImageButton;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.mvvmcommon.C27442R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class ImageAdContentView extends AdContentView {
    private final List<Extension> extensions;
    private ImageView imageView;
    @NonNull
    private final View.OnClickListener internalClickListener;
    private final Logger logger;

    private ImageAdContentView(@NonNull Context context, @NonNull Bitmap bitmap, int i, int i2, @NonNull View.OnClickListener onClickListener, @Nullable List<Extension> list, @NonNull Logger logger) {
        super(context);
        this.internalClickListener = onClickListener;
        this.extensions = list;
        this.logger = logger;
        init(bitmap, i, i2);
    }

    @NonNull
    public static ImageAdContentView create(@NonNull Context context, @NonNull Bitmap bitmap, int i, int i2, @NonNull View.OnClickListener onClickListener, @Nullable List<Extension> list, @NonNull Logger logger) {
        if (context != null) {
            if (bitmap != null) {
                if (onClickListener != null) {
                    if (logger != null) {
                        return new ImageAdContentView((Context) Objects.requireNonNull(context, "Parameter context cannot be null for StaticImageAdContentView::create"), (Bitmap) Objects.requireNonNull(bitmap, "Parameter bitmap cannot be null for StaticImageAdContentView::create"), i, i2, (View.OnClickListener) Objects.requireNonNull(onClickListener, "Parameter internalClickListener cannot be null for StaticImageAdContentView::create"), list, logger);
                    }
                    throw new NullPointerException("'logger' specified as non-null is null");
                }
                throw new NullPointerException("'internalClickListener' specified as non-null is null");
            }
            throw new NullPointerException("'bitmap' specified as non-null is null");
        }
        throw new NullPointerException("'context' specified as non-null is null");
    }

    private Map<String, List<ViewabilityVerificationResource>> getViewabilityResourcesMap(List<Extension> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            try {
                for (Extension extension : list) {
                    if (extension != null && extension.getName().equalsIgnoreCase(Extension.f71716OM)) {
                        ViewabilityVerificationResource viewabilityVerificationResource = new ViewabilityVerificationResource(extension.getExtConfig().getVendorKey(), extension.getScript(), "", extension.getExtConfig().getVerificationParam(), true);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(viewabilityVerificationResource);
                        hashMap.put(CampaignEx.KEY_OMID, arrayList);
                    }
                }
            } catch (Exception e) {
                this.logger.error(LogDomain.CORE, e, "Error while creating ViewabilityResourcesMap", new Object[0]);
            }
        }
        return hashMap;
    }

    private void init(@NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap != null) {
            this.imageView = new ImageView(getContext());
            if (i > 0) {
                i = UIUtils.dpToPx(getContext(), i);
            }
            if (i2 > 0) {
                i2 = UIUtils.dpToPx(getContext(), i2);
            }
            addView(this.imageView, AdContentView.generateDefaultLayoutParams(i, i2));
            addView(new WatermarkImageButton(getContext()));
            this.imageView.setImageBitmap(bitmap);
            setLayoutParams(new FrameLayout.LayoutParams(i, i2, 17));
            super.setOnClickListener(this.internalClickListener);
            return;
        }
        throw new NullPointerException("'bitmap' specified as non-null is null");
    }

    public /* synthetic */ void lambda$setOnClickListener$1(View.OnClickListener onClickListener, final View view) {
        this.internalClickListener.onClick(view);
        Objects.onNotNull(onClickListener, new Consumer() { // from class: com.smaato.sdk.core.mvvm.model.imagead.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((View.OnClickListener) obj).onClick(view);
            }
        });
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void destroy() {
        this.imageView = null;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForOmTracking() {
        return this.imageView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForVisibilityTracking() {
        return this.imageView;
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap() {
        return getViewabilityResourcesMap(this.extensions);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.core.mvvm.model.imagead.b
            {
                ImageAdContentView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageAdContentView.this.lambda$setOnClickListener$1(onClickListener, view);
            }
        });
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @MainThread
    public void showProgressIndicator(boolean z) {
        Threads.ensureMainThread();
        if (z) {
            addView(new ProgressView(getContext()));
        } else {
            removeView((ProgressView) findViewById(C27442R.C27445id.smaato_sdk_core_progress_view_id));
        }
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public void startShowingView() {
    }
}
