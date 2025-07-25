package io.bidmachine.rendering.measurer;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public class CompositeHtmlMeasurer extends BaseCompositeMeasurer<HtmlMeasurer, WebView> implements HtmlMeasurer {
    public CompositeHtmlMeasurer(@NonNull List<HtmlMeasurer> list) {
        super(list);
    }

    @Override // io.bidmachine.rendering.measurer.HtmlMeasurer
    @NonNull
    public String prepareCreativeForMeasure(@NonNull String str) {
        for (HtmlMeasurer htmlMeasurer : this.f97813a) {
            str = htmlMeasurer.prepareCreativeForMeasure(str);
        }
        return str;
    }
}
