package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.j6 */
/* loaded from: classes9.dex */
public final class FileObserverC34635j6 extends FileObserver {

    /* renamed from: a */
    public final Consumer f94674a;

    /* renamed from: b */
    public final File f94675b;

    /* renamed from: c */
    public final C34347Y9 f94676c;

    public FileObserverC34635j6(File file, C33857E1 c33857e1, C34347Y9 c34347y9) {
        super(file.getAbsolutePath(), 4095);
        this.f94674a = c33857e1;
        this.f94675b = file;
        this.f94676c = c34347y9;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (i == 8 && !TextUtils.isEmpty(str)) {
            Consumer consumer = this.f94674a;
            C34347Y9 c34347y9 = this.f94676c;
            File file = this.f94675b;
            c34347y9.getClass();
            consumer.consume(new File(file, str));
        }
    }
}
