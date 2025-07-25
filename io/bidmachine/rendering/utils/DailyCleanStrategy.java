package io.bidmachine.rendering.utils;

import java.io.File;
import java.util.Date;

/* loaded from: classes9.dex */
public class DailyCleanStrategy extends CleanStrategy {

    /* renamed from: a */
    private final Date f97937a;

    public DailyCleanStrategy() {
        this(3);
    }

    @Override // io.bidmachine.rendering.utils.CleanStrategy
    /* renamed from: a */
    protected boolean mo19027a(File file) {
        return FileUtils.isFileOlderThanDate(file, this.f97937a);
    }

    public DailyCleanStrategy(int i) {
        this.f97937a = Utils.getDate(i);
    }
}
