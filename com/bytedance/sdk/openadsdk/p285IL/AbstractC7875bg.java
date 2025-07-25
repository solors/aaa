package com.bytedance.sdk.openadsdk.p285IL;

import com.bytedance.sdk.component.utils.C7756ldr;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.IL.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7875bg {

    /* renamed from: bg */
    protected boolean f17198bg = false;

    /* renamed from: IL */
    private final ExecutorService f17197IL = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.sdk.openadsdk.IL.bg$bg */
    /* loaded from: classes3.dex */
    private class CallableC7877bg implements Callable<Void> {

        /* renamed from: IL */
        private final File f17199IL;

        @Override // java.util.concurrent.Callable
        /* renamed from: bg */
        public Void call() throws Exception {
            AbstractC7875bg.this.m87500IL(this.f17199IL);
            return null;
        }

        private CallableC7877bg(File file) {
            this.f17199IL = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m87500IL(File file) throws IOException {
        if (this.f17198bg) {
            List<File> m87821bg = C7756ldr.m87821bg(file);
            m87821bg.toString();
            mo85163bg(m87821bg);
            return;
        }
        try {
            C7756ldr.m87826IL(file);
        } catch (Throwable unused) {
        }
        mo85163bg(C7756ldr.m87821bg(file.getParentFile()));
    }

    /* renamed from: bg */
    protected abstract void mo85163bg(List<File> list);

    /* renamed from: bg */
    protected abstract boolean mo87498bg(long j, int i);

    /* renamed from: bg */
    protected abstract boolean mo87495bg(File file, long j, int i);

    /* renamed from: bg */
    public void m87496bg(File file) throws IOException {
        this.f17197IL.submit(new CallableC7877bg(file));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public long m87499IL(List<File> list) {
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }
}
