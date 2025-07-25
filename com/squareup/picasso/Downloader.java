package com.squareup.picasso;

import androidx.annotation.NonNull;
import java.io.IOException;
import p1077ze.C45275a0;
import p1077ze.C45292c0;

/* loaded from: classes7.dex */
public interface Downloader {
    @NonNull
    C45292c0 load(@NonNull C45275a0 c45275a0) throws IOException;

    void shutdown();
}
