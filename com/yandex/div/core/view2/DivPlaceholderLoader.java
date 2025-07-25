package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p879s9.ImageRepresentation;

@Metadata
/* renamed from: com.yandex.div.core.view2.n */
/* loaded from: classes8.dex */
public class DivPlaceholderLoader {
    @NotNull

    /* renamed from: a */
    private final Div2ImageStubProvider f75856a;
    @NotNull

    /* renamed from: b */
    private final ExecutorService f75857b;

    /* compiled from: DivPlaceholderLoader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.n$a */
    /* loaded from: classes8.dex */
    static final class C29733a extends Lambda implements Function1<ImageRepresentation, Unit> {

        /* renamed from: g */
        final /* synthetic */ ErrorCollector f75858g;

        /* renamed from: h */
        final /* synthetic */ Function1<Drawable, Unit> f75859h;

        /* renamed from: i */
        final /* synthetic */ DivPlaceholderLoader f75860i;

        /* renamed from: j */
        final /* synthetic */ int f75861j;

        /* renamed from: k */
        final /* synthetic */ Function1<ImageRepresentation, Unit> f75862k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C29733a(ErrorCollector errorCollector, Function1<? super Drawable, Unit> function1, DivPlaceholderLoader divPlaceholderLoader, int i, Function1<? super ImageRepresentation, Unit> function12) {
            super(1);
            this.f75858g = errorCollector;
            this.f75859h = function1;
            this.f75860i = divPlaceholderLoader;
            this.f75861j = i;
            this.f75862k = function12;
        }

        /* renamed from: a */
        public final void m36733a(@Nullable ImageRepresentation imageRepresentation) {
            if (imageRepresentation == null) {
                this.f75858g.m36940f(new Throwable("Preview doesn't contain base64 image"));
                this.f75859h.invoke(this.f75860i.f75856a.mo37269a(this.f75861j));
                return;
            }
            this.f75862k.invoke(imageRepresentation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageRepresentation imageRepresentation) {
            m36733a(imageRepresentation);
            return Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DivPlaceholderLoader.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.n$b */
    /* loaded from: classes8.dex */
    public static final class C29734b extends Lambda implements Function1<ImageRepresentation, Unit> {

        /* renamed from: g */
        final /* synthetic */ Function1<ImageRepresentation, Unit> f75863g;

        /* renamed from: h */
        final /* synthetic */ LoadableImage f75864h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C29734b(Function1<? super ImageRepresentation, Unit> function1, LoadableImage loadableImage) {
            super(1);
            this.f75863g = function1;
            this.f75864h = loadableImage;
        }

        /* renamed from: a */
        public final void m36732a(@Nullable ImageRepresentation imageRepresentation) {
            this.f75863g.invoke(imageRepresentation);
            this.f75864h.cleanLoadingTask();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImageRepresentation imageRepresentation) {
            m36732a(imageRepresentation);
            return Unit.f99208a;
        }
    }

    public DivPlaceholderLoader(@NotNull Div2ImageStubProvider imageStubProvider, @NotNull ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(imageStubProvider, "imageStubProvider");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f75856a = imageStubProvider;
        this.f75857b = executorService;
    }

    /* renamed from: c */
    private Future<?> m36735c(String str, boolean z, Function1<? super ImageRepresentation, Unit> function1) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z, function1);
        if (z) {
            decodeBase64ImageTask.run();
            return null;
        }
        return this.f75857b.submit(decodeBase64ImageTask);
    }

    /* renamed from: d */
    private void m36734d(String str, LoadableImage loadableImage, boolean z, Function1<? super ImageRepresentation, Unit> function1) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> m36735c = m36735c(str, z, new C29734b(function1, loadableImage));
        if (m36735c != null) {
            loadableImage.saveLoadingTask(m36735c);
        }
    }

    @MainThread
    /* renamed from: b */
    public void m36736b(@NotNull LoadableImage imageView, @NotNull ErrorCollector errorCollector, @Nullable String str, int i, boolean z, @NotNull Function1<? super Drawable, Unit> onSetPlaceholder, @NotNull Function1<? super ImageRepresentation, Unit> onSetPreview) {
        Unit unit;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(onSetPlaceholder, "onSetPlaceholder");
        Intrinsics.checkNotNullParameter(onSetPreview, "onSetPreview");
        if (str != null) {
            m36734d(str, imageView, z, new C29733a(errorCollector, onSetPlaceholder, this, i, onSetPreview));
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            onSetPlaceholder.invoke(this.f75856a.mo37269a(i));
        }
    }
}
