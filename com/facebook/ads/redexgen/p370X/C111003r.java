package com.facebook.ads.redexgen.p370X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r */
/* loaded from: assets/audience_network.dex */
public class C111003r extends C11774FL {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C111003r(C13029Zs c13029Zs) {
        super(c13029Zs);
        setCarouselLayoutManager(c13029Zs);
    }

    public AbstractC12637TU getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        } else if (A00[6].length() != 2) {
            throw new RuntimeException();
        } else {
            A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.C11774FL
    public C13091at getLayoutManager() {
        return (C13091at) super.getLayoutManager();
    }

    public AbstractC111634t getOnScrollListener() {
        return new C12763VX(this);
    }

    private void setCarouselLayoutManager(C13029Zs c13029Zs) {
        C13091at c13091at = new C13091at(c13029Zs, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c13091at.A1R(true);
        }
        super.setLayoutManager(c13091at);
    }

    @Override // com.facebook.ads.redexgen.p370X.C11774FL
    public void setLayoutManager(AbstractC111584o abstractC111584o) {
    }
}
