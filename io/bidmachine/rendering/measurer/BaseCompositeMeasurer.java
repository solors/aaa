package io.bidmachine.rendering.measurer;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.measurer.Measurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.CountDownPostback;
import io.bidmachine.rendering.utils.Utils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public class BaseCompositeMeasurer<MeasurerType extends Measurer<ViewType>, ViewType extends View> implements Measurer<ViewType> {

    /* renamed from: a */
    final List f97813a;

    public BaseCompositeMeasurer(@NonNull List<MeasurerType> list) {
        this.f97813a = new CopyOnWriteArrayList(list);
    }

    /* renamed from: a */
    public static /* synthetic */ void m19044a(BaseCompositeMeasurer baseCompositeMeasurer, Handler handler, Runnable runnable) {
        baseCompositeMeasurer.m19045a(handler, runnable);
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void destroy(@Nullable final Runnable runnable) {
        CountDownPostback countDownPostback;
        final Handler createHandlerWithMyOrMainLooper = Utils.createHandlerWithMyOrMainLooper();
        if (runnable != null) {
            countDownPostback = new CountDownPostback(this.f97813a.size(), new Runnable() { // from class: io.bidmachine.rendering.measurer.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseCompositeMeasurer.m19044a(BaseCompositeMeasurer.this, createHandlerWithMyOrMainLooper, runnable);
                }
            });
        } else {
            countDownPostback = null;
        }
        for (Measurer measurer : this.f97813a) {
            measurer.destroy(countDownPostback);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onClicked() {
        for (Measurer measurer : this.f97813a) {
            measurer.onClicked();
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onError(@NonNull Error error) {
        for (Measurer measurer : this.f97813a) {
            measurer.onError(error);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onShown() {
        for (Measurer measurer : this.f97813a) {
            measurer.onShown();
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewAddedToContainer(@NonNull ViewType viewtype, @NonNull ViewGroup viewGroup) {
        for (Measurer measurer : this.f97813a) {
            measurer.onViewAddedToContainer(viewtype, viewGroup);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewCreated(@NonNull ViewType viewtype) {
        for (Measurer measurer : this.f97813a) {
            measurer.onViewCreated(viewtype);
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer, io.bidmachine.rendering.measurer.HtmlMeasurer
    public void onViewReady(@NonNull ViewType viewtype) {
        for (Measurer measurer : this.f97813a) {
            measurer.onViewReady(viewtype);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m19045a(Handler handler, Runnable runnable) {
        this.f97813a.clear();
        handler.post(runnable);
    }
}
